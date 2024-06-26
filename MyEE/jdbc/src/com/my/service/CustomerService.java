package com.my.service;

import java.util.List;

import com.my.dao.CustomerDAO;
import com.my.dao.CustomerDAOOracle;
import com.my.exception.AddException;
import com.my.exception.FindException;
import com.my.exception.ModifyException;
import com.my.exception.RemoveException;
import com.my.vo.Customer;

public class CustomerService {
	
	private CustomerDAO dao = new CustomerDAOOracle();
	
	public List<Customer> findAll() throws FindException {
		List<Customer> cAll = dao.selectAll();
		return cAll;
	}
	public void add(Customer c) throws AddException {
		dao.insert(c);
	}
	public Customer findById(String id) throws FindException {
		return dao.selectById(id);
	}
	public Customer modify(Customer c) throws ModifyException {
		return dao.update(c);
	}
	public Customer remove(String id) throws RemoveException {
		return dao.delete(id);
	}
}
