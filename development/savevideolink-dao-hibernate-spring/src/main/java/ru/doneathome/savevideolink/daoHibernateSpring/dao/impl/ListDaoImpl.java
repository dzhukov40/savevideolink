package ru.doneathome.savevideolink.daoHibernateSpring.dao.impl;

import org.springframework.stereotype.Repository;
import ru.doneathome.savevideolink.daoHibernateSpring.base.BaseDao;
import ru.doneathome.savevideolink.daoHibernateSpring.dao.api.ListDao;
import ru.doneathome.savevideolink.daoHibernateSpring.model.List;

/**
 *
 */
@Repository
public class ListDaoImpl extends BaseDao<List> implements ListDao {

    public List findByUserName(String userName) {
        return null;
    }

}
