package com.citynow.revollet.revollet_auth_service.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "privilege")
public class Privilege implements GrantedAuthority {

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "code",length = 100)
    private String code;

    @ManyToMany(mappedBy = "privileges")
    private List<Role> roles = new ArrayList<>();

    @Column(name = "name")
    private String name;

    @Override
    public String toString() {
        return this.code;
    }

    @Override
    public String getAuthority() {
        return this.code;
    }
}
