package com.example.url_shorterner.controller;

import com.example.url_shorterner.dto.ShortUrlResponse;
import com.example.url_shorterner.entity.ShortUrl;
import com.example.url_shorterner.repository.ShortUrlRepository;
import com.example.url_shorterner.service.ShortUrlService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    private final ShortUrlService service;

    public HomeController(ShortUrlService service){
        this.service = service;
    }

    @GetMapping()
    public String home(Model model){
        List<ShortUrlResponse> shortUrls = service.fetchPublicUrl();
//        System.out.println(shortUrls);
        model.addAttribute("shortUrls", shortUrls);
        model.addAttribute("baseUrl", "http://localhost:8082/home");
        return "index";
    }

}
