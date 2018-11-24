package com.pluralsight.repository;


import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;
	
	/* (non-Javadoc)
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
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
