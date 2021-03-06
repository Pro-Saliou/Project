package com.example.entities;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Mouhamadou Saliou Diallo
 *
 */
@SuppressWarnings("deprecation")
@Entity
@Table(name = "customroles")
public class CustomRole {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false, unique = true)
    @NotEmpty
    private String name;

    @ManyToMany(mappedBy = "customRoles")
    private List < CustomUser > customusers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List < CustomUser > getUsers() {
        return customusers;
    }

    public void setUsers(List < CustomUser > users) {
        this.customusers = users;
    }
}