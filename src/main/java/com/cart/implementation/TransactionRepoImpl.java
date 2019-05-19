package com.cart.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.cart.model.Customer;
import com.cart.repository.TransactionRepoCustom;

@Transactional(readOnly = true)
public class TransactionRepoImpl implements TransactionRepoCustom {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public String getAllTransaction() {
//		HashMap<Customer, List<OrderDetail>> result = new HashMap<Customer, List<OrderDetail>>();
//		for (Iterator<Customer> iterator = dataCustomer.iterator(); iterator.hasNext();) {
//			Customer customer = iterator.next();
//			Query dataOrders = entityManager.createQuery("select a from OrderDetail a where a.customer_id = ?1")
//					.setParameter(1, customer.getCustomerId());
//			List<OrderDetail> temp = dataOrders.getResultList();
//			result.put(customer, temp);	
//		}
//		return result;
//		System.out.println(dataCustomer);
		return "berhasil";
	}

}
