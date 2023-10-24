package com.alaoui.JWTSecurity.services;

import com.alaoui.JWTSecurity.entities.AppUser;

import java.sql.SQLDataException;
import java.util.Collection;

public interface AppRoleServiceInterface {

    public Collection<AppUser> getAllUsers();

    public AppUser getUser(Integer id) throws SQLDataException;

    public AppUser addUser(AppUser appUser);

    public void addRoleToUser(Integer id, String role);
}
