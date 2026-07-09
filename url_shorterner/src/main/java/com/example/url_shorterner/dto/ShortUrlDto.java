package com.example.url_shorterner.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ShortUrlDto {
    private Long id;
    private String shortKey;
    private String originalUrl;
    private Boolean isPrivate;
    private LocalDateTime createdAt;
    private LocalDateTime expiredAt;
    private Long clickCount;
}
