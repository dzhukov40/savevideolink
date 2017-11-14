package ru.doneathome.savevideolink.daoHibernateSpring.base;

import java.io.Serializable;

/**
 *
 */
public abstract class BaseEntity implements IdHolder, Serializable {

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BaseEntity that = (BaseEntity) o;

        return !(getId() == null || !getId().equals(that.getId()));
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : super.hashCode();
    }

}