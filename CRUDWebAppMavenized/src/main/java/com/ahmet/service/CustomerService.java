package com.ahmet.service;

import java.util.List;

import com.ahmet.model.Customer;

public interface CustomerService {
	public void add(Customer customer);
	public void edit(Customer customer);
	public void delete(int customerId);
	public Customer getCustomer(int customerId);
	public List getAllCustomer();
}
