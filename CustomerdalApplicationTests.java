package com.kiran.customer.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.kiran.customer.dal.entities.Customer;
import com.kiran.customer.dal.repos.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;


@RunWith(SpringRunner.class)
@SpringBootTest


public class CustomerdalApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;
	
	
	@Test
	public void testCreateCustomer() {
		
		Customer customer = new Customer();
		customer.setName("John");
		customer.setEmail("John@xyz.com");
		
		customerRepository.save(customer);
	}
	
	@Test
	public void testFindCustomerByID() {
		Optional<Customer> customerOptional = customerRepository.findById(1l);
				if (customerOptional.isPresent()) {
					Customer customer = customerOptional.get();
					System.out.println(customer);
			
				}
				else {
					System.out.println("No Record Present");
				}
					
		
	}
	
	@Test
	public void testUpdateCustomer() {
		Customer customer = customerRepository.findById(1l).get();
		customer.setEmail("John@abc.com");
		
		customerRepository.save(customer);
		
	}
	
	@Test
	public void testDeleteCustomer() {
		Customer customer = new Customer();
		customer.setId(1l);
		customerRepository.delete(customer);
		
	}
	

}
