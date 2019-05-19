package com.cart.service;

import java.util.HashMap;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.model.Customer;
import com.cart.model.OrderDetail;
import com.cart.repository.CustomerRepository;

@Service
public class CustomerServices {
	@Autowired
	CustomerRepository customerRepository;

	public void deleteAll() {
		customerRepository.deleteAll();
	}

	public void save(Customer customer) {
		customerRepository.save(customer);
		customerRepository.flush();
	}

	@Transactional
	public void showAll() {
		List<Customer> custs = customerRepository.findAll();
		custs.forEach(System.out::println);
	}
	
	@Transactional
	public List<Customer> getAll() {
		return customerRepository.findAll();
	}
	
	public Customer getCustomerByName(String name) {
		return customerRepository.findCustomerByName(name);
	}
	
	public List<Customer> getCustomerByCompany(String name) {
		return customerRepository.findUsersByCustomersCompany(name);
	}
	
	public String getListTransactionByCustomer (){
		return customerRepository.getAllTransaction();
	}
}