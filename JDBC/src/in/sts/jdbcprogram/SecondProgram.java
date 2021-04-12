package in.sts.jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class SecondProgram {
	
	public static void main(String args[]) throws SQLException, ClassNotFoundException
	{
		Driver driverref = new Driver();
		
		DriverManager.registerDriver(driverref);
		// Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/sts";
		String user = "root";
		String password = "root";
		 
		Connection con = DriverManager.getConnection(url,user,password);
		
		String query = "insert into emp values(?,?,?)";
		
		PreparedStatement pstmnt = con.prepareStatement(query);
		
		pstmnt.setInt(1, Integer.parseInt(args[0]));
		pstmnt.setString(2, args[1]);
		pstmnt.setString(3, args[2]);
		
		int rs = pstmnt.executeUpdate();
		if(rs!=0)
		{
			System.out.println("Record inerted");
		}
		
		con.close();
		pstmnt.close();
		
	}
	

}
