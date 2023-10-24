package com.alaoui.JWTSecurity.dao;

import com.alaoui.JWTSecurity.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository  extends JpaRepository<AppUser,Integer> {
}
