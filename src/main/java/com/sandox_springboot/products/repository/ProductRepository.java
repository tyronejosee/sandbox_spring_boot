package com.sandox_springboot.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sandox_springboot.products.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
