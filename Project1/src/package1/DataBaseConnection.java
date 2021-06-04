package package1;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium ","root", "selenium");
	System.out.println("Connection To Mysql DB");
	Statement smt=(Statement) con.createStatement();
		ResultSet rs =((java.sql.Statement) smt).executeQuery("Select* from seleniumuser");
	while(rs.next())
	{
		String username = rs.getString("username");
		System.out.println("Database is record is "+username);	
		
		String password = rs.getString("password");
		System.out.println("Database is record is "+password);
	}

}
}