package com.poo.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poo.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String Email);
}
