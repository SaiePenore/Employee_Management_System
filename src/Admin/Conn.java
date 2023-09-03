package Admin;

import java.sql.*;


public class Conn {
	
	Connection c;
	Statement s;
	
	public Conn() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql:///EmployeeManagementSystem","root","Mysql@09#");
			s = c.createStatement();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		

	}

}
