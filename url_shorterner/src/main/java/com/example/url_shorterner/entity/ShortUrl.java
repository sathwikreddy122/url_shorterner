package com.example.url_shorterner.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class ShortUrl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String originalUrl;

    @ManyToOne
    private User created_by;

    private boolean isPrivate;

    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime expiredAt;

    private Long clickCount;
}
