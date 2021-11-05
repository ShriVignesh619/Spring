package com.insurance.auto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.auto.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
