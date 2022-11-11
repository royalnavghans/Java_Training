/*2.USING STATEMENT AND PREPSTATEMENT INTERFACES 

1.INSERT DATA BELOW DATA FOR CODE AND NAME

IN , BHARAT
AU , AUSTRALIA
UK , UNITED KINGDOM
EG, EGYPT*/

package jDBCCon;

import java.sql.*;

public class InsertdataUsingJDBC {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/world";
		String uname = "root";
		String pass = "admin";
		// String Query="Insert into world.country(code,name)values('IN','BHARATH'
		// ),('AU','AUSTRALIA' ),('UK','UNITED KINGDOM' ),('EG','EGYPT')";

		try {
//					Class.forName("com.mysql.cj.jdbc.Driver");
//					Connection conn =DriverManager.getConnection(url,uname,pass);
//					Statement str=conn.createStatement();
//					int i=str.executeUpdate(Query);
//					
//					System.out.println(i+" insert Successfully");
//					
			// 2.UPDATE NAME TO INDIA FOR THE CODE IN.
//					
//		String Query="update country set name='INDIA' where code='IN'";
//
//		
//	        	    Connection conn =DriverManager.getConnection(url,uname,pass);
//              	Statement str=conn.createStatement();
//           		int i=str.executeUpdate(Query);
//					System.out.println(i+"Updated Sucess");

			// 3.DELETE THE DATA FOR THE ABOVE CODE VALUES INSERTED.
			
			
			String Query="delete from country where code='IN' or code='UK'or code='AU'or code='EG';";
			Connection conn =DriverManager.getConnection(url,uname,pass);
			Statement str=conn.createStatement();
			int i=str.executeUpdate(Query);
			System.out.println(i+" Deleted Sucess");
			
			

		} catch (Exception e) {

			System.out.println(e);
		}

	}
}
