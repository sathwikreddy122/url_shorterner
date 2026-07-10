package com.example.url_shorterner.mapper;

import com.example.url_shorterner.dto.ShortUrlDto;
import com.example.url_shorterner.dto.ShortUrlResponse;
import com.example.url_shorterner.entity.ShortUrl;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-10T13:26:03+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 25.0.2 (Oracle Corporation)"
)
@Component
public class ShortUrlMapperImpl implements ShortUrlMapper {

    @Override
    public ShortUrl toEntity(ShortUrlDto shortUrlDto) {
        if ( shortUrlDto == null ) {
            return null;
        }

        ShortUrl shortUrl = new ShortUrl();

        shortUrl.setId( shortUrlDto.getId() );
        shortUrl.setShortKey( shortUrlDto.getShortKey() );
        shortUrl.setOriginalUrl( shortUrlDto.getOriginalUrl() );
        shortUrl.setCreatedAt( shortUrlDto.getCreatedAt() );
        shortUrl.setExpiredAt( shortUrlDto.getExpiredAt() );
        shortUrl.setClickCount( shortUrlDto.getClickCount() );

        return shortUrl;
    }

    @Override
    public ShortUrlResponse toDto(ShortUrl shortUrl) {
        if ( shortUrl == null ) {
            return null;
        }

        ShortUrlResponse shortUrlResponse = new ShortUrlResponse();

        shortUrlResponse.setShortKey( shortUrl.getShortKey() );
        shortUrlResponse.setOriginalUrl( shortUrl.getOriginalUrl() );
        shortUrlResponse.setCreatedBy( shortUrl.getCreatedBy() );
        shortUrlResponse.setPrivate( shortUrl.isPrivate() );
        shortUrlResponse.setCreatedAt( shortUrl.getCreatedAt() );
        shortUrlResponse.setExpiredAt( shortUrl.getExpiredAt() );
        shortUrlResponse.setClickCount( shortUrl.getClickCount() );

        return shortUrlResponse;
    }

    @Override
    public List<ShortUrlResponse> toListDto(List<ShortUrl> shortUrl) {
        if ( shortUrl == null ) {
            return null;
        }

        List<ShortUrlResponse> list = new ArrayList<ShortUrlResponse>( shortUrl.size() );
        for ( ShortUrl shortUrl1 : shortUrl ) {
            list.add( toDto( shortUrl1 ) );
        }

        return list;
    }
}
