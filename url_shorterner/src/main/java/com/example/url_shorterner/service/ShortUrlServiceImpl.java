package com.example.url_shorterner.service;

import com.example.url_shorterner.entity.ShortUrl;
import com.example.url_shorterner.repository.ShortUrlRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShortUrlServiceImpl implements ShortUrlService {

    public final ShortUrlRepository repository;

    public ShortUrlServiceImpl(ShortUrlRepository repository){
        this.repository = repository;
    }

    @Override
    public List<ShortUrl> fetchPublicUrl() {
        return repository.findPublicShortUrl();
    }
}
