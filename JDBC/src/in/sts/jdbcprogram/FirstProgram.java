package in.sts.jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class FirstProgram {


	public static void main(String[] args) throws SQLException {
		
		Connection con = null;
		Statement stmnt = null;
		ResultSet rs = null;
		
		try {
			Driver driverref = new Driver();
			DriverManager.registerDriver(driverref);
			String url = "jdbc:mysql://localhost:3306/sts?user=root&password=root";
			
			con = DriverManager.getConnection(url);
			
			String query = "select * from emp";
			
			stmnt = con.createStatement();
			
			rs = stmnt.executeQuery(query);
			
			while(rs.next())
			{
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String designation = rs.getString("designation");
				
				System.out.println("emp Id : "+id);
				System.out.println("emp name : "+name);
				System.out.println("emp designation : "+designation);
				
			}
		
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			
			try {
				if(con!=null)
				{
					con.close();
				}
				if(stmnt!=null)
				{
					stmnt.close();
				}
				if(rs!=null)
				{
					rs.close();
				}
			}catch(SQLException e1)
			{
				e1.printStackTrace();
			}
		}
		
		
	}

}
