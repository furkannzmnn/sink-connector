package com.metro.metrosearchapp.repository;

import com.metro.metrosearchapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
