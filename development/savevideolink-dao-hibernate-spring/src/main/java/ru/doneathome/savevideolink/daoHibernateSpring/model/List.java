package ru.doneathome.savevideolink.daoHibernateSpring.model;

import ru.doneathome.savevideolink.daoHibernateSpring.base.BaseEntity;

import javax.persistence.*;

/**
 *
 */

@Entity
@Table(name = "lists", schema = "public")
public class List extends BaseEntity {

    @Id
    @Column(name = "list_id", nullable = false)
    private Long id;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToOne
    @JoinColumn(name = "list_master")
    private User list_master;

    public Long getId() {
        return null;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getList_master() {
        return list_master;
    }

    public void setList_master(User list_master) {
        this.list_master = list_master;
    }

    @Override
    public String toString() {
        return "List{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", list_master=" + list_master +
                '}';
    }

}
