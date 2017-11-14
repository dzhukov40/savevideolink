package ru.doneathome.savevideolink.daoHibernateSpring.model;

import ru.doneathome.savevideolink.daoHibernateSpring.base.BaseEntity;

import javax.persistence.*;

/**
 * Роль - группа для аутинтификации
 */

@Entity
@Table(name = "roles", schema = "public")
public class Role extends BaseEntity {

    @Id
    @Column(name = "role_id", nullable = false)
    private Long id;

    @Column(name = "role", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Role role;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
