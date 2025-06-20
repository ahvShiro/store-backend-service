package com.ahvshiro.store.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ahvshiro.store.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
