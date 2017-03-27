package wdd.mapper;

import java.util.List;


import wdd.dto.Customer;
public interface CustomerMapper {
	
	Customer findByFirstName(String firstName);
	List<Customer>  customerSelect(Customer customer);
    int  insertOneCustomer(Customer customer);
    int update(Customer customer);
	int delete(Customer customer);

}
