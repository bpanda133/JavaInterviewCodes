package ResusableFunction;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class DatabaseConnector {
	
	
	
	
	public void DBConnect(String sqlQuery, String Data2,String ReturnVal)
	{
		Connection con = null;
		PreparedStatement stmt = null;
		String connectionUrl = new String();
		String Value= "";
		
		ResultSet rs = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
			
			con = DriverManager.getConnection("jdbc://mysql://localhost:3306/selenium","root", "password123");
			System.out.println("Connected to ");
			
			try{
				stmt = con.prepareStatement(sqlQuery,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
				rs = stmt.executeQuery();
				
			}catch(SQLException se){
				System.out.println("Error in SQL query: "+ sqlQuery);
			}
			
			if (Data2.contains("multi")) {
				int valcounter = 0;
				while (rs.next()) {
					try {
						GlobalData.DataElements.put(ReturnVal + valcounter, rs.getString(1).toString());
						valcounter++;
						Value = "true";
					} catch (Exception e) {
						GlobalData.DataElements.put(ReturnVal + valcounter, "0");
						valcounter++;
						Value = "true";
						continue;
					}
				}
			} else
			{
				while (rs.next()) {

					Value = rs.getString(1).toString();
					GlobalData.DataElements.put(ReturnVal,Value);
					break;
				}
			}
			
			
			
			
			/*Driver driver = new oracle.jdbc.OracleDriver();
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String URL = "jdbc:oracle:thin@localhost:1521:XE";
			String username = "username";
			String password = "password";
			
			con = DriverManager.getConnection(URL, username, password);*/
		}catch(Exception e){
			System.out.println("Class Not found");
		}
		
		
	}

}
