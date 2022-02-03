package com.example.marketplace.product;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    public String product(String products) {
        return "My Products";
    }
}
