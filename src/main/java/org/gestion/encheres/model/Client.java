package org.gestion.encheres.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String password;
    private String telephone;

    private String type;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
