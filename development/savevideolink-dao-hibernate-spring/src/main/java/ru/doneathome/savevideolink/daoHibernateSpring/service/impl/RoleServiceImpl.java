package ru.doneathome.savevideolink.daoHibernateSpring.service.impl;

import org.springframework.stereotype.Service;
import ru.doneathome.savevideolink.daoHibernateSpring.base.BaseService;
import ru.doneathome.savevideolink.daoHibernateSpring.dao.api.RoleDao;
import ru.doneathome.savevideolink.daoHibernateSpring.model.Role;
import ru.doneathome.savevideolink.daoHibernateSpring.service.api.RoleService;

/**
 *
 */
@Service
public class RoleServiceImpl extends BaseService<RoleDao, Role> implements RoleService {

    public Role getRandom() {
        return null;
    }

}
