package com.ahvshiro.store.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ahvshiro.store.entities.OrderItem;
import com.ahvshiro.store.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
