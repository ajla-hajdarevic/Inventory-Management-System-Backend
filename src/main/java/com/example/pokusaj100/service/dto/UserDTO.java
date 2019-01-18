package com.example.pokusaj100.service.dto;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

public class UserDTO implements Serializable {
    private Long id;
    private String username;
    private String email;
    private String password;
    private Set<String> role;

    public UserDTO(){ this.role = new TreeSet<>(); }

    public UserDTO(Long id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public UserDTO(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Set<String> getRole() {
        return role;
    }

    public void setRole(Set<String> role) {
        if(role == null){
            this.role = new TreeSet<>();
        }else {
            this.role = role;
        }
    }

    public void addRole(String role){
        this.role.add(role);
    }
}
