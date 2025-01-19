package com.example.springbootdemo;  

import com.example.springbootdemo.dao.entities.Product;  
import com.example.springbootdemo.dao.repositories.ProductRepository;  
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.boot.CommandLineRunner;  
import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;  

import java.util.List;  

@SpringBootApplication  
public class SpringbootdemoApplication implements CommandLineRunner {  

    private final ProductRepository productRepository;  
    private static final Logger logger = LoggerFactory.getLogger(SpringbootdemoApplication.class);  

    @Autowired  
    public SpringbootdemoApplication(ProductRepository productRepository) {  
        this.productRepository = productRepository;  
    }  

    public static void main(String[] args) {  
        SpringApplication.run(SpringbootdemoApplication.class, args);  
    }  

    @Override  
    public void run(String... args) throws Exception {  
        Product pro = new Product(1,"xproce","xxxxxxxxxxxx",13);  
        productRepository.save(pro);  
        List<Product> products = productRepository.findAll();  
        
        // Remplacement de System.out par un logger  
        logger.info("Liste des produits : {}", products);  
    }  
}
