package ru.doneathome.savevideolink.daoHibernateSpring.dao.impl;

import org.springframework.stereotype.Repository;
import ru.doneathome.savevideolink.daoHibernateSpring.base.BaseDao;
import ru.doneathome.savevideolink.daoHibernateSpring.dao.api.LinkDao;
import ru.doneathome.savevideolink.daoHibernateSpring.model.Link;

/**
 *
 */
@Repository
public class LinkDaoImpl extends BaseDao<Link> implements LinkDao {

    public Link findByUserName(String userName) {
        return null;
    }

}
