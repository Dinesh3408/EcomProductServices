package com.scaler.EcomProductService.controller;


import com.scaler.EcomProductService.dto.ProductListResponseDTO;
import com.scaler.EcomProductService.dto.ProductRequestDTO;
import com.scaler.EcomProductService.dto.ProductResponseDTO;
import com.scaler.EcomProductService.model.Product;
import com.scaler.EcomProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    @Qualifier("FakeStoreProductService")
    private ProductService productService;
//    private RestTemplateBuilder restTemplateBuilder;
//    public  ProductController(RestTemplateBuilder restTemplateBuilder){
//        this.restTemplateBuilder = restTemplateBuilder;
//    }
    @GetMapping("/products/1")
    public ResponseEntity getProductFromID(){
        /*
        ProductResponseDTO p1 = new ProductResponseDTO();
        p1.setId(1);
        p1.setTitle("Iphone 15 Pro");
        p1.setPrice(100000);
        p1.setImage("www.google.com/images/iPhone");
        p1.setDescription("Chala ehhuva");
        p1.setCategory("Electronics");

        ProductResponseDTO p2 = new ProductResponseDTO();
        p2.setId(2);
        p2.setTitle("MacBook");
        p2.setPrice(150000);
        p2.setImage("www.google.com/images/MacBook   ");
        p2.setDescription("Chala ehhuva 2");
        p2.setCategory("Electronics");
        List<ProductResponseDTO> products = Arrays.asList(p1,p2);
        return  ResponseEntity.ok(products);
        //What is response entity:  It is like a bucket that contains the response and http status code
        //It contains objects with status
        //It wraps the object with http status code

         */
        ProductResponseDTO response = productService.getProductByID(1);
        return ResponseEntity.ok(response);


    }


}
