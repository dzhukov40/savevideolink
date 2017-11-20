package ru.doneathome.savevideolink.daoHibernateSpring.service.api;

import ru.doneathome.savevideolink.daoHibernateSpring.base.Service;
import ru.doneathome.savevideolink.daoHibernateSpring.model.List;

/**
 *
 */
public interface ListService extends Service<List> {

    List getRandom();

}
