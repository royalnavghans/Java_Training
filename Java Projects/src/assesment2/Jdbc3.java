package assesment2;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Jdbc3 {

	private static final int SEP = 0;

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/royalnavghan";;
		String uname="root";
		String pass="admin";
		String query="insert into Orders(OrderId,Name,size,price,quantity,date) values (?,?,?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uname,pass);
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, 1);
			pstmt.setString(2, "RAJESH");
			pstmt.setInt(3, 19);
			pstmt.setDouble(4, 150.00);
			pstmt.setInt(5,2 );
			pstmt.setString(6, ("10-SEP-2022"));
			pstmt.setInt(1, 2);
			pstmt.setString(2, "NARESH");
			pstmt.setInt(3, 15);
			pstmt.setDouble(4, 150.00);
			pstmt.setInt(5,1);
			pstmt.setString(6, ("05-SEP-2022"));
			pstmt.setInt(1, 3);
			pstmt.setString(2, "MAHESH");
			pstmt.setInt(3, 18);
			pstmt.setDouble(4, 180.00);
			pstmt.setInt(5,3 );
			pstmt.setString(6, ("12-SEP-2022"));
			pstmt.setInt(1, 4);
			pstmt.setString(2, "VEERESH");
			pstmt.setInt(3, 16);
			pstmt.setDouble(4, 140.00);
			pstmt.setInt(5,4 );
			pstmt.setString(6, ("20-SEP-2022"));
			pstmt.setInt(1, 5);
			pstmt.setString(2, "MANOJ");
			pstmt.setInt(3, 14);
			pstmt.setDouble(4, 190.00);
			pstmt.setInt(5,4);
			pstmt.setString(6, ("18-SEP-2022"));
			int t=pstmt.executeUpdate();
			System.out.println(t+"executed");
			}catch(Exception e) {
			System.out.println(e);
		}

		

}}