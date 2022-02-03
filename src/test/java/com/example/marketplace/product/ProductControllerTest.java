package com.example.marketplace.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductControllerTest {

    @Test
    void product(){
        ProductController productController = new ProductController();
        String response = productController.product("Products");
        assertEquals("My Products",response);
    }

}