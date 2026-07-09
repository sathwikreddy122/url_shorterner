package com.example.url_shorterner.entity;

import com.example.url_shorterner.model.Role;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, name = "email")
    private String email;

    @Column(nullable = false, name = "password")
    private String password;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(nullable = false)
    private LocalDateTime createdAt;
}
