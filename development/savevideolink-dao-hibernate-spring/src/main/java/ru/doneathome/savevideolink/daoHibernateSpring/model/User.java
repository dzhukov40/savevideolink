package ru.doneathome.savevideolink.daoHibernateSpring.model;


import ru.doneathome.savevideolink.daoHibernateSpring.base.BaseEntity;

import javax.persistence.*;

/**
 * Пользователь - учетная запись для афторизации
 */

@Entity
@Table(name = "all_users", schema = "public")
public class User extends BaseEntity {

    @Id
    @Column(name = "user_id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "password", nullable = false)
    private String password;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
