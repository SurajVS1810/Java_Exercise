
//Write a JDBC program with PreparedStatement to delete the records of Emp1 table which has records whose salary is less than 10,000.
package JDBC;
import java.sql.*;
public class Slot19_p3 {

	public static void main(String[] args) {
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca2253","mca2253");
		PreparedStatement pst=con.prepareStatement("delete from emp1 where esal<?");
		pst.setString(1,"10000");
		int i= pst.executeUpdate();
		System.out.println(i+" row deleted");
		con.close();
		}catch(Exception e) {System.out.println(e);}

	}
}