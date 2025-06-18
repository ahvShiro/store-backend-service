package com.ahvshiro.store.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ahvshiro.store.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
