package wdd.service;

import java.util.List;


import wdd.dto.Customer;

public interface CustomerService {
	
	Customer checkLogin(String name,String password);
	 List<Customer> customerSelect(Customer customer);
	int insert(Customer customer);
	int update(Customer customer);
	int delete(int customerId);
	Customer customerById(int customerId);

}
