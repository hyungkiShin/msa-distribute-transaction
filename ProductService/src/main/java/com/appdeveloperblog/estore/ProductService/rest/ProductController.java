package com.appdeveloperblog.estore.ProductService.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products") // http://localhost:8080/products
public class ProductController {

    @PostMapping
    public String createProduct() {
        return "HTTP POST Handled";
    }

    @GetMapping
    public String getProduct() {
        return "HTTP GET Handled";
    }

    @PutMapping
    public String updateProduct() {
        return "HTTP PUT Handled";
    }

    @DeleteMapping
    public String deleteProduct() {
        return "HTTP DELETE HANDLED";
    }
}
