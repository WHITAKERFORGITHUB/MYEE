package com.my.vo;

// 상품목록, 상품상세, 주문내역
public class Product {
	private String prod_no;
	private String prod_name;
	private int prod_price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String prod_no, String prod_name, int prod_price) {
		super();
		this.prod_no = prod_no;
		this.prod_name = prod_name;
		this.prod_price = prod_price;
	}
	
	public String getProd_no() {
		return prod_no;
	}
	public void setProd_no(String prod_no) {
		this.prod_no = prod_no;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public int getProd_price() {
		return prod_price;
	}
	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}
	
	@Override
	public String toString() {
		return "Product [prod_no=" + prod_no + ", prod_name=" + prod_name + ", prod_price=" + prod_price + "]";
	}
	

}
