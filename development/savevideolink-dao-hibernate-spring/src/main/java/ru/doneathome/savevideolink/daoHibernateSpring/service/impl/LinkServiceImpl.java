package ru.doneathome.savevideolink.daoHibernateSpring.service.impl;

import org.springframework.stereotype.Service;
import ru.doneathome.savevideolink.daoHibernateSpring.base.BaseService;
import ru.doneathome.savevideolink.daoHibernateSpring.dao.api.LinkDao;
import ru.doneathome.savevideolink.daoHibernateSpring.model.Link;
import ru.doneathome.savevideolink.daoHibernateSpring.service.api.LinkService;

/**
 *
 */
@Service
public class LinkServiceImpl extends BaseService<LinkDao, Link> implements LinkService {

    public Link getRandom() {
        return null;
    }

}
