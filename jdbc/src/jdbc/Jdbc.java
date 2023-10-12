package jdbc;

import java.sql.*;

public class Jdbc {

	public static void main(String[] args) throws SQLException {
		readRecords();
	}
	
	public static void readRecords() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String passWord = "haris";
		String query = "select * from employee";
		
		Connection con = DriverManager.getConnection(url, userName, passWord);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getInt(3));
		}
		con.close();
		
		
	}
}
