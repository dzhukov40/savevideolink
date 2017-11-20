package ru.doneathome.savevideolink.daoHibernateSpring.service.impl;

import org.springframework.stereotype.Service;
import ru.doneathome.savevideolink.daoHibernateSpring.base.BaseService;
import ru.doneathome.savevideolink.daoHibernateSpring.dao.api.ListDao;
import ru.doneathome.savevideolink.daoHibernateSpring.model.List;
import ru.doneathome.savevideolink.daoHibernateSpring.service.api.ListService;

/**
 *
 */
@Service
public class ListServiceImpl extends BaseService<ListDao, List> implements ListService {

    public List getRandom() {
        return null;
    }

}
