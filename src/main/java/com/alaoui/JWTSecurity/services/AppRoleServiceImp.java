package com.alaoui.JWTSecurity.services;

import com.alaoui.JWTSecurity.dao.AppRoleRepository;
import com.alaoui.JWTSecurity.dao.AppUserRepository;
import com.alaoui.JWTSecurity.entities.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.SQLDataException;
import java.util.Collection;
import java.util.Optional;

public class AppRoleServiceImp implements AppRoleServiceInterface{
    @Autowired
    AppUserRepository appUserRepository;
    @Autowired
    AppRoleRepository appRoleRepository;

    @Override
    public Collection<AppUser> getAllUsers() {
        return appUserRepository.findAll();
    }

    @Override
    public AppUser getUser(Integer id) throws SQLDataException {
        Optional<AppUser> user = appUserRepository.findById(id);
        if(user.isPresent()){
        return user.get();
        }
            throw new SQLDataException("User Not Found");


    }

    @Override
    public AppUser addUser(AppUser appUser) {
        return appUserRepository.save(appUser);
    }

    @Override
    public void addRoleToUser(Integer id, String role) {
        System.out.println(id);
    }
}
