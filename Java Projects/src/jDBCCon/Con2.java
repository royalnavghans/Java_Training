package jDBCCon;

import java.sql.*;
public class Con2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/world";
		String uname="root";
		String pass="admin";
		
		String QUERY = "SELECT id, name FROM City where id <10";
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(url,uname,pass);
		
		Statement stmt = conn.createStatement();
		
	         System.out.println("Fetching records...");
	         ResultSet rs = stmt.executeQuery(QUERY);
	         while(rs.next()){
	            //Display values
	           // System.out.print("ID: " + rs.getInt("id"))
	        	 System.out.print("ID: " + rs.getInt(1));
	            //System.out.println(" name: " + rs.getString("name"));
	        	 System.out.println(" name: " + rs.getString(2));
	         }

	       //stmt.executeUpdate("insert into city values(5000,'kphb"));  
	       //int result=stmt.executeUpdate("update emp765 set name='Vimal',salary=10000 where id=33");  
	       //int result=stmt.executeUpdate("delete from city where id=5000");  
	       //System.out.println(result+" records affected");  
	        
	         stmt.close();
	         conn.close();
	}catch(Exception e){ System.out.println(e);}  

}
	
}

