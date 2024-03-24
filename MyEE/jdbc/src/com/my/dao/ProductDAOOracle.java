package com.my.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.my.exception.AddException;
import com.my.exception.FindException;
import com.my.exception.ModifyException;
import com.my.exception.RemoveException;
import com.my.sql.MyConnection;
import com.my.vo.Customer;
import com.my.vo.Product;

public class ProductDAOOracle implements ProductDAO {

	@Override
	public Product selectByNo(String prod_no) throws FindException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = MyConnection.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
			throw new FindException(e.getMessage());
		}
		
		String selectByNoSQL = "SELECT * FROM product WHERE prod_no =?";
		try {
			pstmt = con.prepareStatement(selectByNoSQL);
			pstmt.setString(1, prod_no);
			rs = pstmt.executeQuery();
			if(rs.next()) { // 결과가 한 행 이상 존재한다면
				String prod_name = rs.getString("prod_name");
				int prod_price = rs.getInt("prod_price");
				Product p = new Product(prod_no, prod_name, prod_price);
				return p;
			} else {
				throw new FindException("번호에 해당하는 상품이 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new FindException(e.getMessage());
		} finally {
			MyConnection.close(con, pstmt, rs);
		}
	}

	@Override
	public List<Product> selectAll() throws FindException {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = MyConnection.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
			throw new FindException(e.getMessage());
		}
		
		String selectAllSQL = "SELECT * FROM product ORDER BY prod_name ASC";
		List<Product> all = new ArrayList<Product>();
		try {
			pstmt = con.prepareStatement(selectAllSQL);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Product P = new Product(rs.getString("prod_no"), rs.getString("prod_name"), rs.getInt("prod_price"));
				all.add(P);
			}
			if(all.size() == 0) {
				throw new FindException("상품이 하나도 없습니다");
			} 
			return all;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new FindException(e.getMessage());
		} finally {
			MyConnection.close(con, pstmt, rs);
		}
	}

	@Override
	public void insert(Product product) throws AddException {
		// TODO Auto-generated method stub

	}

	@Override
	public Product update(Product product) throws ModifyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product delete(String prod_no) throws RemoveException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	// 테스트를 위해 메인메소드 만들기
	public static void main(String[] args) {
		ProductDAOOracle dao = new ProductDAOOracle();
		
		// 고객 삭제 테스트
//		String id = "id5";
//		try {
//			Customer c = dao.delete(id);
//			System.out.println("삭제테스트성공: " + c);
//		} catch (RemoveException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// 아이디로 고객 검색
		try {
			List<Product> list = dao.selectAll();
			System.out.println(list);
		} catch (FindException e) {
			e.printStackTrace();
		}

		// 고객전체검색 테스트
//		try {
//			List<Customer> list = dao.selectAll();
//			for(Customer c: list) {
//				System.out.println(c);
//			}
//		} catch (FindException e) {
//			e.printStackTrace();
//		}
		

	}

}
