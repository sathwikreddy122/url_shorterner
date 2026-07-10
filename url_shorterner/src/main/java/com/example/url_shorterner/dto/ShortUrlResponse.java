package com.example.url_shorterner.dto;

import com.example.url_shorterner.entity.Users;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ShortUrlResponse {

    private String shortKey;

    private String originalUrl;

    private Users createdBy;

    private boolean isPrivate;

    private LocalDateTime createdAt;

    private LocalDateTime expiredAt;

    private Long clickCount;
}
