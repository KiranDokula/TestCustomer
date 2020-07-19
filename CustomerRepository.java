package com.kiran.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.kiran.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
}
