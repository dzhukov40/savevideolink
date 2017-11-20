package ru.doneathome.savevideolink.daoHibernateSpring.dao.api;

import ru.doneathome.savevideolink.daoHibernateSpring.base.Dao;
import ru.doneathome.savevideolink.daoHibernateSpring.model.List;

/**
 *
 */
public interface ListDao extends Dao<List> {
    List findByUserName(String userName);
}
