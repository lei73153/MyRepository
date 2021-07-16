package com.demo.dao;

import com.demo.domain.Product;
import com.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {
}
