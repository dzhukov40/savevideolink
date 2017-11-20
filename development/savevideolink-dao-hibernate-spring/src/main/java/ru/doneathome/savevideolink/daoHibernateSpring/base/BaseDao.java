package ru.doneathome.savevideolink.daoHibernateSpring.base;

import org.hibernate.LockOptions;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.engine.spi.SessionImplementor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


/**
 *
 */

public abstract class BaseDao <T extends BaseEntity> implements Dao<T> {

    @Autowired
    private SessionFactory sessionFactory;
    private Class<T> persistentClass;


    public Session getSession() {
        Session session = sessionFactory.getCurrentSession();
        if (session instanceof SessionImplementor) {
            ((SessionImplementor)session).setAutoClear(true);
        }
        return session;
    }

    public Class<T> getPersistentClass() {
        return persistentClass;
    }

    public void saveOrUpdate(T entity) {
        getSession().saveOrUpdate(entity);
    }

    public Long add(T entity) {
        return (Long) getSession().save(entity);
    }

    public final void delete(T entity) {
        getSession().delete(entity);
    }

    public final void deleteById(Long id) {
        Session session = getSession();
        Object o = session.get(getPersistentClass(), id);
        if (o != null) {
            session.delete(o);
        }
    }

    @SuppressWarnings("unchecked")
    public T merge(T entity) {
        return (T) getSession().merge(entity);
    }

    public void evict(T entity) {
        getSession().evict(entity);
    }

    public T findAndLock(Long id) {
        return getSession().get(getPersistentClass(), id, LockOptions.UPGRADE);
    }

    public T findById(Long id, String... properties) {
        T entity = getSession().get(getPersistentClass(), id);
        // HibernateInitializer.initializeProperties(t, properties);
        return entity;
    }
}
