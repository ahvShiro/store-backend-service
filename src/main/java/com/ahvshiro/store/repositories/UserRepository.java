package com.ahvshiro.store.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ahvshiro.store.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
