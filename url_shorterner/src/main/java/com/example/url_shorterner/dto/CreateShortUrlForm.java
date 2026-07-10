package com.example.url_shorterner.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateShortUrlForm {

    @NotBlank(message = "Original url cannot be blank")
    private String originalUrl;
}
