package com.alaoui.JWTSecurity.dao;

import com.alaoui.JWTSecurity.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Integer> {
}
