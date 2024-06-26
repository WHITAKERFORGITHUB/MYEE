package com.my.vo;

public class Customer {
	
	private String id;
	private String pwd;
	private	String name;
	private String zipcode;
	private String addr;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String id, String pwd, String name, String zipcode, String addr) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.zipcode = zipcode;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", pwd=" + pwd + ", name=" + name + ", zipcode=" + zipcode + ", addr=" + addr
				+ "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	

}
