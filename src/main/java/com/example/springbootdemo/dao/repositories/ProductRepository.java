package com.example.springbootdemo.dao.repositories;
import com.example.springbootdemo.dao.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
