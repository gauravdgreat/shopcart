package com.shopcart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopcart.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByIsActiveTrue();

	List<Product> findByCategory(String category);

}
