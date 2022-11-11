/*USING JDBC FTECH DATA FROM COUNTRIES NLD AND AFG WHERE POULATION MORE THAN  200000*/


package jDBCCon;

import java.sql.*;


public class JDBCCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url="jdbc:mysql://localhost:3306/world";
		String uname="root";
		String pass="admin";
		 String Que="SELECT *from city where countrycode='AFG' or Countrycode='NLD' and population>200000";
		 
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection(url,uname,pass);
			 Statement str=con.createStatement();
			 System.out.println("hi hello Here your fetching data !!");
			 ResultSet rst=str.executeQuery(Que);
			 
			 while(rst.next()) {
				 System.out.println("ID of the country  : "+rst.getInt("id"));
				 System.out.println("Name of the the States in AFG and NDL is : "+rst.getString("name"));
				 System.out.println("Name of the Districts in NDL or AFG : "+rst.getString("District"));
				 System.out.println("Population of the these countries : "+rst.getString("Population"));
			 }
			 con.close();
			 str.close();
			 
		 }catch(Exception e) {
			 System.out.println(e);
		 }
		
		
	}

}
