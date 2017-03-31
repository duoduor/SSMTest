package wdd.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.naming.MalformedLinkException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
	@RequestMapping( value="/goLogin", method = RequestMethod.POST)
	public String goLogin(@RequestParam(value="firstName") String firstName,
			@RequestParam(value="password") String password ){ 
		//登录判断
		if(customerService.checkLogin(firstName,password) != null){
			if(customerService.checkLogin(firstName,password).getFirstName().equals(firstName) && 
					customerService.checkLogin(firstName,password).getFirstName().equals(password)){
				return "index";
			}else{
				return "error";
			}
//			System.out.println(customerService.checkLogin(firstName,password));
		}else{
			return "error";
		}
	}
	
	//customer列表显示
	 @RequestMapping("/customerSelect")
    public String customerSelect(HttpServletRequest request,Map<String, Object> map,Model model){
		Customer customer = new Customer();
		int page=1;//????????????????????有问题
		
		customer.setCursor((page-1)*10);
		List<Customer> list =  customerService.customerSelect(customer);
    	map.put("list", customerService.customerSelect(customer));
    	model.addAttribute("page", page);
//    	request.setAttribute("page", page);
        return "index";
    }
	 
	 //customer增加  跳转
	 @RequestMapping(value = "/insertOneCustomer")
	 public String insertOneCustomer(){
		 
		 return "customer";
	 }
	 
	 
	 //customer 新增数据插入 --插入成功返回index页面
	 @RequestMapping(value = "/saveOneCustomer", method = RequestMethod.POST)
	 public String save(HttpServletRequest request,HttpServletResponse response ,
			 Model model
//			 , @PathVariable("storeId") int storeId
			 ){
		 Customer customer = new Customer();
		
		int  storeId =  Integer.parseInt(request.getParameter("storeId")); //把String类型的数转换为int类型
		 String firstName = request.getParameter("firstName");
	    String lastName = request.getParameter("lastName");
	    String email = request.getParameter("email");
	    int  addressId = Integer.parseInt(request.getParameter("addressId"));
	    int active = Integer.parseInt(request.getParameter("active"));
	    Date date = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置时间显示格式
	    String createDate = sdf.format(date);//将当前时间格式化为需要的类型
	    String lastUpdate = sdf.format(date);
 
		 customer.setFirstName(firstName);
		 customer.setLastName(lastName);
		 customer.setEmail(email);
		 customer.setAddressId(addressId);
		 customer.setActive(active);
		 customer.setCreateDate(createDate);
		 customer.setLastUpdate(lastUpdate);
		 
		 customerService.insert(customer);
		 
		 return "index";
	 }
	 
	 //新增数据的取消按钮
	 @RequestMapping("/noSaveCustomer")
	 public String noSaveCustomer(){
		 
		 return "index";
	 }
	 
	 //点击修改按钮  跳转页面
	 @RequestMapping("/update/{customerId}")//????????????????
	 public String update(@PathVariable("customerId") int customerId,Model model ){
		 Customer customer = new Customer();
		 customer= customerService.customerById(customerId);
		 model.addAttribute("customer", customer);
		 return "editCustomer";
	 }
	 
	 //更改数据---------------有问题
	 @RequestMapping(value="/edit/{id}",  method = RequestMethod.POST)
	 public String edit(HttpServletRequest request,
			 @RequestParam(value="customerId") String customerId,
			 @RequestParam(value="firstName") String  firstName,
			 @RequestParam(value="lastName") String  lastName,
			 @RequestParam(value="email") String  email)  {//这个注解什么意思
		 
		 System.out.println("方法开始的地方");
		   Customer customer = new Customer();
			
			 customer.setCustomerId(Integer.parseInt(customerId));
			 customer.setFirstName(firstName);
			 customer.setLastName(lastName);
			 customer.setEmail(email);
			 
		 customerService.update(customer);
		 
		 return "index";
	 }
	 
	 //删除数据
	 @RequestMapping("/delete/{customerId}")
	 public String delete(@PathVariable("customerId") int customerId,Map<String, Object> map
			 ,HttpServletRequest request){
		 
		 customerService.delete(customerId);    	
	    	Customer customer = new Customer();
			int page=1;
			customer.setCursor((page-1)*10);
			List<Customer> list =  customerService.customerSelect(customer);
	    	map.put("list", customerService.customerSelect(customer));
	    	request.setAttribute("page", page);
	    	
		 return "index";
	 }
	 
	 //上一页
	 @RequestMapping("/upPage/{page}")
	 public String upPage(@PathVariable("page") int page,Map<String, Object> map
			 ,HttpServletRequest request,Model model){
		 Customer customer = new Customer();
		 if(page>1){
		 page = page-1;
		 customer.setCursor((page-1)*10);
		 List<Customer> list =  customerService.customerSelect(customer);
	    map.put("list", customerService.customerSelect(customer));
	    model.addAttribute("page", page);
//	    request.setAttribute("page", page);
		 }else{
			 page =1;
			 customer.setCursor((page-1)*10);
				List<Customer> list =  customerService.customerSelect(customer);
		    	map.put("list", customerService.customerSelect(customer));
		    	model.addAttribute("page", page);
		 }
		 return "index";
	 }
	 
	 //下一页
	 @RequestMapping("/downPage/{page}")
	 public String downPage(@PathVariable("page") int page,Map<String, Object> map
			 ,HttpServletRequest request,Model  model ){
		 page = page+1;
		 Customer customer = new Customer();
		 customer.setCursor((page-1)*10);
		 List<Customer> list =  customerService.customerSelect(customer);
	    map.put("list", customerService.customerSelect(customer));
	    model.addAttribute("page", page);
//	    requsest.setAttribute("page", page);
		 return "index";
	 }
	
	 


}
