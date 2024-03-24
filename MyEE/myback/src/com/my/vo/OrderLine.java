package com.my.vo;

// 주문상세 클래스
public class OrderLine {
	
	private int order_no;
	//private String order_prod_no;
	private Product p; // has a 관계를 표시
	private int order_quantity;
	
	// 고객이 로그인을 하고 주문을 조회
	// order_info는 주문의 기본정보가 담겨져있는 테이블
	// 고객의 입장에서 주문번호에 해당하는 주문상세내역을 보고싶은 경우가 많음
	// 클래스들 사이에서 has a 관계를 맺을 때 생각해야함
	// 
}
