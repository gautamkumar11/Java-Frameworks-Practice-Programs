package in.sts.jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FifthProgram {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sts", "root", "root");
	
		PreparedStatement pstmnt = con.prepareStatement("update emp set name = 'Rakesh Kumar' where id = ?");
	
		pstmnt.setInt(1,Integer.parseInt(args[0]));
		
		int rs = pstmnt.executeUpdate();
		if(rs!=0)
		{
			System.out.println("row updated");
		}
	
	}

}
