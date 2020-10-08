import java.sql.*;

public class HelloWorldDriver {

	public static void main(String[] args) {
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_web_db?"+"user=root&password=password");  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from sampletable");  
		while(rs.next())  {
		System.out.println("Student ID is: "+rs.getInt(1)+"\nName is: "+rs.getString(2)+"\nMajor is: "+rs.getString(3));  
		}
		con.close();  }

			catch(Exception e)
			{ 
				System.out.println(e);
				//test change
				
			}   
		}
		
	}