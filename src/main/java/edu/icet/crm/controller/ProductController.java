package edu.icet.crm.controller;

import edu.icet.crm.model.Product;
import edu.icet.crm.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/all")
    List<Product> allProducts() {
        System.out.println("Requesting all products");
        return productService.allProduct();
    }

//    @PostMapping
//    Product persists(Product product) {
//        return product;
//    }
}
