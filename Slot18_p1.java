//Program to implement database connectivity using object oriented concepts.
package JDBC;
import java.sql.*;
class jdbc
{
	public static void emp()
	{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca2253","mca2253");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from emp1");
			ResultSetMetaData rm=rs.getMetaData();
			int i,j;
			for(j=1;j<=rm.getColumnCount();j++) {
				System.out.print(rm.getColumnName(j)+"      ");
			}
			System.out.println("\n---------------------------------------------");
			while(rs.next()) {
				for(i=1;i<=rm.getColumnCount();i++) {
				System.out.print(rs.getString(i)+"      ");
				}
				System.out.println();
			}

			con.close();

		}catch(Exception e) {System.out.println(e);}
	}
}
public class Slot18_p1 {

	public static void main(String[] args) {
		jdbc s=new jdbc();
		s.emp();
	}

}
