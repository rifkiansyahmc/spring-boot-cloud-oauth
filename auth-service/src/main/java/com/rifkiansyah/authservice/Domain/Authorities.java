package com.rifkiansyah.authservice.Domain;

import org.springframework.security.core.GrantedAuthority;

public enum Authorities implements GrantedAuthority {
    ROLE_USER;

    @Override
    public String getAuthority(){
        return name();
    }
}
