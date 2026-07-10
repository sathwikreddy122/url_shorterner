package com.example.url_shorterner.mapper;

import com.example.url_shorterner.dto.ShortUrlDto;
import com.example.url_shorterner.dto.ShortUrlResponse;
import com.example.url_shorterner.entity.ShortUrl;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ShortUrlMapper {

    ShortUrl toEntity(ShortUrlDto shortUrlDto);

    ShortUrlResponse toDto (ShortUrl shortUrl);

    List<ShortUrlResponse> toListDto(List<ShortUrl> shortUrl);
}
