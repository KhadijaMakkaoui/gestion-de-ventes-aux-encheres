package org.gestion.encheres.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String telephone;
    @Enumerated(EnumType.STRING)
    private Type type;

    @OneToMany(mappedBy = "acheteur")
    private List<Encherir> encheres;

    @OneToMany(mappedBy = "vendeur")
    private List<Produit> articles;

    public Client(){

    }
    public Client(String username, String password, String telephone, Type type){
        this.username = username;
        this.password = password;
        this.telephone = telephone;
        this.type = type;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
