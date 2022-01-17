package com.register.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class registerDao {
	String url = "jdbc:mysql://localhost:3306/prachidb1";
	String username = "root";
	String password = "1234";
	String sql = "insert into prachidb1.userdetails values (?,?,?)";
	public String insertDetails(String email, String pass, String name){
		String s = "successful";
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, email);
			st.setString(2, name);
			st.setString(3, pass);
			int rs = st.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			s = "unsuccessful";
		}
		return s;
	}

}
