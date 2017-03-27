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
//		System.out.println("我要去查找数据库的名字去啦");
//		System.out.println(customerMapper);
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

	public int delete(Customer customer) {
		return customerMapper.delete(customer);
	}
	


//	
//	@Service
//	@Transactional
//	public class FilmServiceImpl implements FilmService {
//		 @Autowired
//		 private FilmMapper filmMapper;
//
//		public List<Film> select(Film film) {
//			List<Film> filmList=filmMapper.select(film);
//			return filmList;
//		}
//		public int insert(Film film) {
//			return filmMapper.insertOneItem(film);
//		}

}
