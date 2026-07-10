package com.example.url_shorterner.controller;

import com.example.url_shorterner.dto.CreateShortUrlForm;
import com.example.url_shorterner.dto.ShortUrlResponse;
import com.example.url_shorterner.service.ShortUrlService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
        CreateShortUrlForm c = new CreateShortUrlForm();
        model.addAttribute("shortUrls", shortUrls);
        model.addAttribute("baseUrl", "http://localhost:8082/home");
        model.addAttribute("createShortUrlForm", c);
        return "index";
    }

    @PostMapping("/short-urls")
    public String createShortUrls(@ModelAttribute("createShortUrlForm") @Valid CreateShortUrlForm form,
                                  BindingResult bindingResult,
                                  RedirectAttributes redirectAttributes,
                                  Model model){

        System.out.println("post method hit");

        if(bindingResult.hasErrors()){
            List<ShortUrlResponse> shortUrls = service.fetchPublicUrl();
            model.addAttribute("shortUrls", shortUrls);
            model.addAttribute("baseUrl", "http://localhost:8082/home");
            return "index";
        }

        redirectAttributes.addFlashAttribute("successMessage",
                "Short url created successfully");


        return "redirect:/home";
    }

}
