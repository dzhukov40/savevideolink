package ru.doneathome.savevideolink.daoHibernateSpring.dao.api;

import ru.doneathome.savevideolink.daoHibernateSpring.base.Dao;
import ru.doneathome.savevideolink.daoHibernateSpring.model.Link;

/**
 *
 */
public interface LinkDao extends Dao<Link> {
    Link findByUserName(String userName);
}
