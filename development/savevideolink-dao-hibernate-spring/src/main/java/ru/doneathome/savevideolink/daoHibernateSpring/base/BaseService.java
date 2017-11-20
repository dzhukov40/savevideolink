package ru.doneathome.savevideolink.daoHibernateSpring.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 */
public abstract class BaseService <T extends Dao, E extends BaseEntity> implements Service<E> {

    private T dao;

    protected T getDao() {
        return dao;
    }

    @Autowired
    protected void setDao(T dao) {
        this.dao = dao;
    }

    @Transactional
    @SuppressWarnings("unchecked")
    public E save(E entity) {
        dao.saveOrUpdate(entity);
        return entity;
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public E findById(Long id, String... properties) {
        return (E) dao.findById(id, properties);
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public E findByIdReadOnly(final Long id, final String... properties) {
        return (E) dao.findById(id, properties);
    }

    @Transactional
    @SuppressWarnings("unchecked")
    public void delete(E entity){
        dao.delete(entity);
    }

    @Transactional
    public void deleteById(Long id){
        dao.deleteById(id);
    }

}
