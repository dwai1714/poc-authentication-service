package com.accion.poc.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accion.poc.model.security.User;

/**
 * Created by stephan on 20.03.16.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
