package wdd.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import wdd.dto.Customer;
import wdd.mapper.CustomerMapper;
import wdd.service.CustomerService;
@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerMapper customerMapper;
	
	public Customer  checkLogin(String firstName, String password) {

			return 	customerMapper.findByFirstName(firstName);
		
	}

	public List<Customer> customerSelect(Customer customer) {
		List<Customer> customerList=customerMapper.customerSelect( customer);
		return customerList;
	}

	public int insert(Customer customer) {
		return customerMapper.insertOneCustomer(customer);
		
	}

	public int update(Customer customer) {
		return customerMapper.update(customer);
	}

	public int delete(int customerId) {
		return customerMapper.delete(customerId);
	}

	public Customer customerById(int customerId) {
		
		
		return customerMapper.customerById(customerId);
	}
	



}
