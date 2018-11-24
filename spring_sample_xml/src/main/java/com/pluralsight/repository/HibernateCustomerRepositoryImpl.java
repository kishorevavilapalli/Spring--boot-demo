package com.pluralsight.repository;


import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;
import org.springframework.beans.factory.annotation.Value;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */

	@Value("${dbUsername}")
	private String dbUsername;

	@Override
	public List<Customer> findAll() {

	    System.out.println(dbUsername);
		List<Customer> customers = new ArrayList<Customer>();
				
				Customer customer = new Customer();
		
		customer.setFirstname("Kishore");
		customer.setLastname("Vavilapalli");
		
		customers.add(customer);
		
		return customers;
	}

}
