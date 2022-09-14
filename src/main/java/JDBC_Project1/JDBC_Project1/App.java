package JDBC_Project1.JDBC_Project1;

import java.awt.print.Printable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void print() {
		try {
  		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prod","root","root");
	        
	        Statement stm = conn.createStatement();
	        
	        String query = "Select * from prodmast";
	        
	        ResultSet rs = stm.executeQuery(query);
	        
	     while (rs.next()) {
				System.out.println(rs.getString(3)+" "+rs.getString(2));	
			}
			
	     conn.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public static void update() {
		try {
   		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
   	        
   	        Statement stm = conn.createStatement();
   	        
   	        String query = "Update myemployee set SALARY=2000 where SALARY = 1000";
   	        
   	        stm.execute(query);
   	        
   	        System.out.println("the record was update successfully");
   	        
		} catch (SQLException e) {
			System.out.println(e);
		}	
	}
	
    public static void main( String[] args )
    {
    	Scanner data=new Scanner(System.in);
    	byte menu = 0;
    	do {
			
    		System.out.println("Menu of the store");
    		System.out.println("N1, See the tables");
    		System.out.println("N2, Insert new info");
    		System.out.println("N3, Update new info");
    		System.out.println("N4, Delete info");
    		System.out.println("N5, Exit");
    		menu = data.nextByte();
    		
    		switch (menu) {
			case 1:
				print();
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Choose another option");
			}
    		
		} while (menu!=5);
    	
    }
}
