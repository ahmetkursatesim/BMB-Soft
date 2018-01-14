package com.ahmet.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ahmet.model.Customer;
import com.ahmet.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@RequestMapping("/")
	public String setForm(Map<String, Object> map){
	Customer customer = new Customer();
		map.put("customer", customer);
		map.put("customerList", customerService.getAllCustomer());
		return "customer";
	}
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
	Customer customer = new Customer();
		map.put("customer", customer);
		map.put("customerList", customerService.getAllCustomer());
		return "customer";
	}
	@RequestMapping(value="/crudOperaton", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Customer customer, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Customer custResult = new Customer();
		switch(action.toLowerCase()){	
		case "add":
		    customerService.add(customer);
			custResult = customer;
			break;
		case "edit":
			customerService.edit(customer);
			custResult = customer;
			break;
		case "delete":
		  customerService.delete(customer.getCustomerId());
			custResult = new Customer();
			break;
		case "search":
			Customer searchedCustomer = customerService.getCustomer(customer.getCustomerId());
		custResult = searchedCustomer!=null ? searchedCustomer : new Customer();
			break;
		}
		map.put("customer",custResult);
		map.put("customerList", customerService.getAllCustomer());
		return "customer";
	}
	
}
