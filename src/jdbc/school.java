package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class school {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//create connection
			
			Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");
			System.out.println("connection created");
			
			//create statement
			
			Statement mystate= mycon.createStatement();
			
			//query execute
			
			ResultSet rs=mystate.executeQuery("SELECT * FROM mydatabase.employee");
			
			while(rs.next())
			{
				System.out.println(rs.getNString("name")+ ","+rs.getNString("role"));
				
				
				
			}
			
		}catch(Exception e)
		{
			
			
			e.printStackTrace();
			
			
		}

	}

}
