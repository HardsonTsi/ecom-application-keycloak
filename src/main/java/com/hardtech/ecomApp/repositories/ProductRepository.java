package com.hardtech.ecomApp.repositories;

import com.hardtech.ecomApp.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}