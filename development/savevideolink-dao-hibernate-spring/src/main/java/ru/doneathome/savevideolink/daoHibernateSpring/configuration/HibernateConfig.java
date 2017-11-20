package ru.doneathome.savevideolink.daoHibernateSpring.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * настройка подключения к базе
 */
@Configuration
@PropertySource("classpath:hibernate.properties")
@EnableTransactionManagement
@ComponentScan("ru.doneathome.savevideolink")
public class HibernateConfig {

    // работает с аннотацией [@PropertySource] для получения значений из файла [.properties]
    @Autowired
    private Environment env;

    /**
     * Это бин использующий определенную реализацию JDBC и минимально
     * достаточный набор параметров для подключения к базе данных.
     * @return обЪект соединения с базой
     */
    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getRequiredProperty("datasource.driver"));
        dataSource.setUrl(env.getRequiredProperty("datasource.url"));
        dataSource.setUsername(env.getRequiredProperty("datasource.username"));
        dataSource.setPassword(env.getRequiredProperty("datasource.password"));
        return dataSource;
    }

    /**
     * Это наспройки вынесенные в отдельный метод для удобства конфигурации
     * бина [LocalSessionFactoryBean]
     * @return настройки Hibernate
     */
    private Properties getHibernateProperties() {
        Properties properties = new Properties();
        properties.put(AvailableSettings.DIALECT, env.getRequiredProperty("hibernate.dialect"));
        properties.put(AvailableSettings.POOL_SIZE, env.getRequiredProperty("hibernate.pool.size"));
        properties.put(AvailableSettings.CURRENT_SESSION_CONTEXT_CLASS, env.getRequiredProperty("hibernate.current.session.context.class"));

        properties.put(AvailableSettings.STATEMENT_BATCH_SIZE, env.getRequiredProperty("hibernate.batch.size"));
        properties.put(AvailableSettings.HBM2DDL_AUTO, env.getRequiredProperty("hibernate.hbm2ddl.auto"));
        properties.put(AvailableSettings.SHOW_SQL, env.getRequiredProperty("hibernate.show_sql"));

        return properties;
    }

    /**
     * Этот бин нам следует использовать для получение сессии из пула
     * и дальнейшего выполнения запросса.
     * @return LocalSessionFactoryBean
     */
    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(getDataSource());
        // если вы хотите использовать какой-то класс для связи с какой-то таблицей, вы должны его здесь указать.
        sessionFactory.setPackagesToScan("ru.doneathome.savevideolink.dao.model");
        sessionFactory.setHibernateProperties(getHibernateProperties());
        return sessionFactory;
    }

    /**
     *
     * @param sessionFactory 1
     * @return HibernateTransactionManager
     */
    @Bean
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
        HibernateTransactionManager txManager = new HibernateTransactionManager();
        txManager.setSessionFactory(sessionFactory);
        return txManager;
    }

}
