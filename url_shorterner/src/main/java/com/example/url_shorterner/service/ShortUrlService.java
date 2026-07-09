package com.example.url_shorterner.service;

import com.example.url_shorterner.entity.ShortUrl;

import java.util.List;


public interface ShortUrlService {
    public List<ShortUrl> fetchPublicUrl();
}
