package ru.doneathome.savevideolink.daoHibernateSpring.dao.api;

import org.springframework.stereotype.Repository;
import ru.doneathome.savevideolink.daoHibernateSpring.base.Dao;
import ru.doneathome.savevideolink.daoHibernateSpring.model.User;

/**
 *
 */
public interface UserDao extends Dao<User> {
    User findByUserName(String userName);
}
