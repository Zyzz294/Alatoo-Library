package com.com20alatoo.webpage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class WebPageApplication {

    @Autowired
    private BooksRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(WebPageApplication.class, args);
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("Books", repo.findAll());
        return "index";
    }
}

