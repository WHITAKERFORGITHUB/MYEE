package com.my.vo;

import java.util.Date;
import java.util.List;

public class OrderInfo {
	private int order_no;
	
	// private String order_id;
	private Customer c; 
	
	private Date order_dt;
	private List<OrderLine> lines;	
	
	public OrderInfo() {
		super();
	}
	public OrderInfo(Customer c) {
		this.c = c;
	}
	public OrderInfo(Customer c, List<OrderLine> lines) {
		this.c = c;
		this.lines = lines;
	}

	public OrderInfo(int order_no, Customer c, Date order_dt, List<OrderLine> lines) {
		super();
		this.order_no = order_no;
		this.c = c;
		this.order_dt = order_dt;
		this.lines = lines;
	}

	public int getOrder_no() {
		return order_no;
	}

	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}

	public Customer getC() {
		return c;
	}

	public void setC(Customer c) {
		this.c = c;
	}

	public Date getOrder_dt() {
		return order_dt;
	}

	public void setOrder_dt(Date order_dt) {
		this.order_dt = order_dt;
	}

	public List<OrderLine> getLines() {
		return lines;
	}

	public void setLines(List<OrderLine> lines) {
		this.lines = lines;
	}
	
	

	

}
