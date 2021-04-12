package in.sts.jdbcprogram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class ThirdProgram {
	
	public static void main(String args[]) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("D:/workspace/Properties/MyProp.properties");
		
		//File file = new File("D:\workspace\Properties\MyProp.properties");
		//FileReader reader = new FileReader(file);
		//prop.load(reader);
		
		prop.load(file);
		
		Connection con = null;
		Statement stmnt = null;
		
		try {
			
			Driver driverref = new Driver();
			DriverManager.registerDriver(driverref);
			String dburl = prop.getProperty("url");
			
			con = DriverManager.getConnection(dburl, prop);
			
			String query = "delete from emp where id = 3";
			
			stmnt = con.createStatement();
			
			int rs = stmnt.executeUpdate(query);
			
			if(rs!=0)
			{
				System.out.println("row deleted");
				
			}
			
			
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}finally {
			
			try {
				
				if(con!=null)
				{
					con.close();
				}
				if(stmnt!=null)
				{
					stmnt.close();
				}
			}catch(SQLException e1)
			{
				e1.printStackTrace();
			}
		}
		
	}

}
