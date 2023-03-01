//2.	Write a JDBC program with Parametrized queries to list the records of Emp1 table which has records whose names start with the alphabet “R”.
package JDBC;

import java.sql.*;
public class Slot19_p2 {

	public static void main(String[] args) {
		try
		{
		int j=0;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca2253","mca2253");
		PreparedStatement pst=con.prepareStatement("select * from emp1 where ename like ?");
		pst.setString(1,"R%");
		ResultSet rs=pst.executeQuery();
		ResultSetMetaData rm=rs.getMetaData();
		while(rs.next()) {
			for(int i=1;i<=rm.getColumnCount();i++) {
			System.out.print(rs.getString(i)+"      ");
			}
			System.out.println();
			j++;
		}
		if(j==0) {System.out.println("Record not found");}
		con.close();
		}catch(Exception e) {System.out.println(e);}

	}
}
