package com.alaoui.JWTSecurity;

import com.alaoui.JWTSecurity.entities.AppUser;
import com.alaoui.JWTSecurity.services.AppRoleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class AppUserController {
    @Autowired
    AppRoleServiceImp appRoleServiceImp;

    @GetMapping("/users")
    public Collection<AppUser> getAllUsers(){
    return appRoleServiceImp.getAllUsers();
    }
}
