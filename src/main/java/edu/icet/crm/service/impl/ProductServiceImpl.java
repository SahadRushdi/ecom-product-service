package edu.icet.crm.service.impl;

import edu.icet.crm.model.Product;
import edu.icet.crm.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> allProduct() {
        return Arrays.asList(
                new Product("Bun", "A Tasty Bun", "BUN"),
                new Product("Cheeseburger", "A Tasty Cheeseburger", "CHEESEBURGER"),
                new Product("French Fries", "A Tasty French Fries", "FRIES"),
                new Product("Pizza", "A Tasty Pizza", "PIZZA"),
                new Product("Soup", "A Tasty Soup", "SOUP")
        );
    }
}
