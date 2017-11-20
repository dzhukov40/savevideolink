package ru.doneathome.savevideolink.daoHibernateSpring.service.api;

import ru.doneathome.savevideolink.daoHibernateSpring.base.Service;
import ru.doneathome.savevideolink.daoHibernateSpring.model.User;

/**
 *
 */
public interface UserService extends Service<User> {

    User getRandom();

}
