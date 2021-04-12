package in.sts.jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import com.mysql.jdbc.Driver;

public class FourthProgram {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
	//	Driver driverref = new Driver();
	//	DriverManager.registerDriver(driverref);
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/sts";
		String user = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String query = "delete from emp where id = ?";
		

		PreparedStatement pstmnt = con.prepareStatement(query);
		
		pstmnt.setInt(1, Integer.parseInt(args[0]));
		
		int rs = pstmnt.executeUpdate();
		if(rs!=0)
		{
			System.out.println("row deleted");
		}
		
	}

}
