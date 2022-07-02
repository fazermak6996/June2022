package base_Orange;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("ServerName"+" ","userName","passWord");
		Statement createStatement = connection.createStatement();
		ResultSet executeQuery = createStatement.executeQuery(null);
		while(executeQuery.next()) {
			
		}
		
		
		
	}

}
