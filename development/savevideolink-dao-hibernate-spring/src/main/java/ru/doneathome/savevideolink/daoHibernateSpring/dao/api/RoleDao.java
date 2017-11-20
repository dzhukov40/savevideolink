package ru.doneathome.savevideolink.daoHibernateSpring.dao.api;

import ru.doneathome.savevideolink.daoHibernateSpring.base.Dao;
import ru.doneathome.savevideolink.daoHibernateSpring.model.Role;

/**
 *
 */
public interface RoleDao extends Dao<Role> {
        Role findByUserName(String userName);
}
