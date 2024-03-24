package com.my.sql;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyConnection {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("JDBC드라이버 로드 성공");
	}
	
	public static Connection getConnection() throws Exception {	
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password ="tiger";
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}
	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		close(con, pstmt);
	}
	public static void close(Connection con, PreparedStatement pstmt) {
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		close(con);
	}
	public static void close(Connection con) {
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		close(con);
	}
}
