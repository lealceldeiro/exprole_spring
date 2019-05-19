package com.cart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.model.OrderDetail;
import com.cart.repository.OrderRepository;

@Service
public class OrderServices {

	@Autowired
	OrderRepository orderRepository;

	public void save(OrderDetail order) {
		orderRepository.save(order);
	}

	public void deleteAll() {
		orderRepository.deleteAll();
	}
}