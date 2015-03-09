package com.doj.citypages.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doj.citypags.entities.Users;

public interface UserRepository extends JpaRepository<Users, Serializable> {
	
}