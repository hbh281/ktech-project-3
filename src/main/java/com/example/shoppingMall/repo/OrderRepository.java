package com.example.shoppingMall.repo;

import com.example.shoppingMall.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}