package com.alaoui.JWTSecurity.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String username;
private String password;
@ManyToMany(fetch = FetchType.EAGER)
private Collection<AppRole> role = new ArrayList<>();
}
