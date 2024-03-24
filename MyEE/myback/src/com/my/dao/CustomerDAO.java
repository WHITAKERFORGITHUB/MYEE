package com.my.dao;

import java.util.List;

import com.my.exception.AddException;
import com.my.exception.FindException;
import com.my.exception.ModifyException;
import com.my.exception.RemoveException;
import com.my.vo.Customer;

public interface CustomerDAO {
	
	public void insert(Customer c) throws AddException;
	public List<Customer> selectAll() throws FindException;
	public Customer selectById(String id) throws FindException;
	public Customer update(Customer c) throws ModifyException;
	public Customer delete(String id) throws RemoveException;
}
