package car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UtilityCon {
	public Connection getConnection() {
		//cant create con directly inside calss block
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdbname", "root", "root");
		return con;
		}catch(Exception e) {
			e.printStackTrace();
		}
		//if execption occurs return null
		return null;
		
	}
	public boolean saveCar(String name,double price,String color) {
		try {
			Connection con=getConnection();
			Statement statement=con.createStatement();
			String sql="INSERT INTO car(name,price,color) VALUES('"+name+"',+price+,'"+color+"')";
			//if everything executes successfully return truue
					return true;
		}catch(Exception e) {
			//if any execption occur first got to catch and then return false
			e.printStackTrace();
		}
		return false;
	}

}
