package com.hardtech.ecomApp.controllers;

import com.hardtech.ecomApp.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping("/products")
    public String getProducts(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "products";
    }

    @GetMapping({"", "/", "/index"})
    public String index() {
        return "index";
    }


}
