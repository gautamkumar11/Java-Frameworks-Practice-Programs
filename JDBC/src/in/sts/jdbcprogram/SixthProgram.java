package in.sts.jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SixthProgram {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new Driver());
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sts?user=root&password=root");
	
		Statement stmnt = con.createStatement();
		stmnt.executeUpdate("create table doctor(id int, name varchar(45), age int)");
		System.out.println("Created table in given database...");
	
	}

}
