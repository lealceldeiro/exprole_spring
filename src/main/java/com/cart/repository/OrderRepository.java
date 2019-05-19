package com.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cart.model.OrderDetail;
@Repository
public interface OrderRepository extends JpaRepository<OrderDetail, Integer> {
}