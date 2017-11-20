package ru.doneathome.savevideolink.daoHibernateSpring.dao.impl;

import org.springframework.stereotype.Repository;
import ru.doneathome.savevideolink.daoHibernateSpring.base.BaseDao;
import ru.doneathome.savevideolink.daoHibernateSpring.dao.api.RoleDao;
import ru.doneathome.savevideolink.daoHibernateSpring.model.Role;

/**
 *
 */
@Repository
public class RoleDaoImpl extends BaseDao<Role> implements RoleDao {

    public Role findByUserName(String userName) {
        return null;
    }
}
