package com.shopcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopcart.model.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls, Integer> {

}