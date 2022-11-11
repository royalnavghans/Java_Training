package jDBCCon;

import java.sql.*;

public class Max {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/royalnavghan";
		String uname="root";
		String pass="admin";
		String query="call getout()";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection(url,uname,pass);
		CallableStatement stmt=conn.prepareCall(query);
		ResultSet str =stmt.executeQuery();
		while(str.next()) {
			System.out.println(str.getInt(1));
		}
		
		
		
		
		

	}

}
