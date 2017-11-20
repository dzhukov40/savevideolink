package ru.doneathome.savevideolink.daoHibernateSpring.base;

/**
 *
 */
public interface Service<T extends BaseEntity> {

    T findById(Long id, String... properties);

    T save(T entity);

    void delete(T entity);

    void deleteById(Long id);

    T findByIdReadOnly(Long id, String... properties);
}

