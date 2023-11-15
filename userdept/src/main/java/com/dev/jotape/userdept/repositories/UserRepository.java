package com.dev.jotape.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.jotape.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
