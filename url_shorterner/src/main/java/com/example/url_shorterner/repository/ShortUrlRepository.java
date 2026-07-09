package com.example.url_shorterner.repository;

import com.example.url_shorterner.entity.ShortUrl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShortUrlRepository extends JpaRepository<ShortUrl, Long> {

    @Query("SELECT su FROM ShortUrl su LEFT JOIN FETCH su.createdBy WHERE su.isPrivate = FALSE ORDER BY su.createdAt desc")
    public List<ShortUrl> findPublicShortUrl();
}
