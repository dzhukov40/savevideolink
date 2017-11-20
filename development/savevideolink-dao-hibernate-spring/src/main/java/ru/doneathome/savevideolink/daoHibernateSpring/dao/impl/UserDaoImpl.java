package ru.doneathome.savevideolink.daoHibernateSpring.dao.impl;

import org.springframework.stereotype.Repository;
import ru.doneathome.savevideolink.daoHibernateSpring.base.BaseDao;
import ru.doneathome.savevideolink.daoHibernateSpring.dao.api.UserDao;
import ru.doneathome.savevideolink.daoHibernateSpring.model.User;

/**
 *
 */
@Repository
public class UserDaoImpl extends BaseDao<User> implements UserDao {


    public User findByUserName(String userName) {
        return null;
    }



}
