package ru.doneathome.savevideolink.daoHibernateSpring.model;

import ru.doneathome.savevideolink.daoHibernateSpring.base.BaseEntity;

import javax.persistence.*;

/**
 *
 */
@Entity
@Table(name = "links", schema = "public")
public class Link extends BaseEntity {

    @Id
    @Column(name = "link_id", nullable = false)
    private Long id;

    @Column(name = "link", nullable = false)
    private String link;

    @OneToOne
    @JoinColumn(name = "link_master")
    private String link_master;


    public Long getId() {
        return null;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink_master() {
        return link_master;
    }

    public void setLink_master(String link_master) {
        this.link_master = link_master;
    }

    @Override
    public String toString() {
        return "Link{" +
                "id=" + id +
                ", link='" + link + '\'' +
                ", link_master='" + link_master + '\'' +
                '}';
    }

}
