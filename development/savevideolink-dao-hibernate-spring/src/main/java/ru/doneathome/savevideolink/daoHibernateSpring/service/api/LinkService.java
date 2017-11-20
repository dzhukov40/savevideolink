package ru.doneathome.savevideolink.daoHibernateSpring.service.api;

import ru.doneathome.savevideolink.daoHibernateSpring.base.Service;
import ru.doneathome.savevideolink.daoHibernateSpring.model.Link;

/**
 *
 */
public interface LinkService extends Service<Link> {

    Link getRandom();

}
