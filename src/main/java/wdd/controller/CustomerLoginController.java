package wdd.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import wdd.dto.Customer;
import wdd.service.CustomerService;

@Controller
public class CustomerLoginController {
	
	@Autowired
	private CustomerService customerService;
	
	//登录
	@RequestMapping( value="/views/goLogin", method = RequestMethod.POST)
	public String goLogin(@RequestParam(value="firstName") String firstName,
			@RequestParam(value="password") String password ){ 
		System.out.println(customerService.checkLogin(firstName,password));
		
		if(customerService.checkLogin(firstName,password) != null){
			System.out.println(customerService.checkLogin(firstName,password));
			return "index";
		}else{
			return "error";
		}
		
	}
	
	//customer列表显示
	 @RequestMapping("/customerSelect")
    public String customerSelect(Map<String, Object> map){
		Customer customer = new Customer();
		int page=1;
		customer.setCursor((page-1)*10);
		List<Customer> list =  customerService.customerSelect(customer);
    	map.put("list", customerService.customerSelect(customer));
        return "index";
    }
	 
	 //customer增加  跳转
	 @RequestMapping(value = "/insertOneCustomer",method = RequestMethod.POST)
	 public String insertOneCustomer(HttpServletRequest request,
			 HttpServletResponse response){
		 Customer customer = new Customer();

		 String firstName=request.getParameter("firstName");
	    	String lastName=request.getParameter("lastName");
	    	String email=request.getParameter("email");
		 
 
		 customer.setFirstName(firstName);
		 customer.setLastName(lastName);
		 customer.setEmail(email);
		 
		 customerService.insert(customer);

		 return "customer";
	 }
	 


}
