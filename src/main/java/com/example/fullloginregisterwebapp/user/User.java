package com.example.fullloginregisterwebapp.user;

import com.example.fullloginregisterwebapp.auditing.Auditable;
import com.example.fullloginregisterwebapp.role.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Set;

@Entity
@Table(name = "Users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User extends Auditable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    private String phone;

    private Boolean isActive;

    private Boolean isLocked;

    private Integer failedLoginAttempts = 0;

    private Instant lockedUntil;

    private Instant lastLoginAt;

    private Set<Role> role;

}
