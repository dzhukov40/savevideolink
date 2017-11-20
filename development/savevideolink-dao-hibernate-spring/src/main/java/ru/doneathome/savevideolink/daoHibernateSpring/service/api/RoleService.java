package ru.doneathome.savevideolink.daoHibernateSpring.service.api;

import ru.doneathome.savevideolink.daoHibernateSpring.base.Service;
import ru.doneathome.savevideolink.daoHibernateSpring.model.Role;

/**
 *
 */
public interface RoleService extends Service<Role> {

    Role getRandom();

}
