package com.ahvshiro.store.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ahvshiro.store.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
