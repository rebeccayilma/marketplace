package com.example.marketplace.product;

import com.example.marketplace.review.Review;

import java.util.List;

public class Product {
    private Long id;
    private String name;
    private Double price;
    private Integer quantity;
    private String description;
    private List<Review> review;
}
