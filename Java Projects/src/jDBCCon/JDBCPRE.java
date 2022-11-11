/*2.USING STATEMENT AND PREPSTATEMENT INTERFACES 

1.INSERT DATA BELOW DATA FOR CODE AND NAME

IN , BHARAT
AU , AUSTRALIA
UK , UNITED KINGDOM
EG, EGYPT*/



package jDBCCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCPRE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String url="jdbc:mysql://localhost:3306/world";
		String uname="root";
		String pass="admin";
		String Query="Insert into world.country(code,name)values(?,? ),(?,? ),(?,? ),(?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uname,pass);
			PreparedStatement str=con.prepareStatement(Query);
			str.setString(1, "IN2");
			str.setString(2, "INDIAA");
			str.setString(3, "UNK");
			str.setString(4, "UNITED KINGDOM1");
			str.setString(5, "A1");
			str.setString(6, "AUSTRALLIA");
			str.setString(7, "E1");
			str.setString(8, "EGYPTH");
			
			int i=str.executeUpdate(); 
			System.out.println(i+"Inserted sucessfully");
	
			
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
