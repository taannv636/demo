package com.example.demo.controller;

import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "index"; // Trỏ tới file `index.html`
    }
}

