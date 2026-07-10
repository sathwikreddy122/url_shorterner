package com.example.url_shorterner.service;

import com.example.url_shorterner.dto.ShortUrlResponse;
import com.example.url_shorterner.entity.ShortUrl;
import com.example.url_shorterner.mapper.ShortUrlMapper;
import com.example.url_shorterner.repository.ShortUrlRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShortUrlServiceImpl implements ShortUrlService {

    public final ShortUrlRepository repository;
    private final ShortUrlMapper mapper;

    public ShortUrlServiceImpl(ShortUrlRepository repository, ShortUrlMapper mapper){
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<ShortUrlResponse> fetchPublicUrl() {
        List<ShortUrl> shortUrls = repository.findPublicShortUrl();

        List<ShortUrlResponse> shortUrlResponses = mapper.toListDto(shortUrls);

        System.out.println(shortUrlResponses);

        return shortUrlResponses;
    }
}
