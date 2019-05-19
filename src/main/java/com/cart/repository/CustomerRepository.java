package com.cart.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cart.model.Customer;
import com.cart.model.CustomerId;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, CustomerId>, TransactionRepoCustom {

	@Query("select u from Customer u where u.name = :#{#name}")
	public Customer findCustomerByName(@Param("name") String name);
	
	@Query("select u from Customer u where u.company like :#{#company}")
	public List<Customer> findUsersByCustomersCompany(@Param("company") String company);
}