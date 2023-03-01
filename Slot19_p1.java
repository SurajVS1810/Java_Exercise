//Write a JDBC program with Parametrized queries to update a given record (Rani’s salary to 15,000) in the Emp1 table.
package JDBC;
import java.sql.*;
public class Slot19_p1 {

	public static void main(String[] args) {
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca2253","mca2253");
		PreparedStatement pst=con.prepareStatement("update emp1 set esal=15000 where ename=?");
		pst.setString(1,"Rani");
		int i= pst.executeUpdate();
		System.out.println(i+" row updated");
		con.close();
		}catch(Exception e) {System.out.println(e);}

	}
}


