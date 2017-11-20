package ru.doneathome.savevideolink.daoHibernateSpring.service.impl;

import org.springframework.stereotype.Service;
import ru.doneathome.savevideolink.daoHibernateSpring.base.BaseService;
import ru.doneathome.savevideolink.daoHibernateSpring.dao.api.UserDao;
import ru.doneathome.savevideolink.daoHibernateSpring.model.User;
import ru.doneathome.savevideolink.daoHibernateSpring.service.api.UserService;

/**
 *
 */
@Service
public class UserServiceImpl extends BaseService<UserDao, User> implements UserService {


    public User getRandom() {
        return null;
    }



}
