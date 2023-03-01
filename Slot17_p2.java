/*Write a program for displaying information in the following order:
    eno	     ename	 esal	  dname	   dloc
    101      Rani    10,000	  MCA      Kochi
    102      Vani    20,000	  MSW      Delhi*/

package JDBC;
import java.sql.*;
import java .util.Scanner;
public class Slot17_p2 {

	public static void main(String[] args) {
		try {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca2253","mca2253");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select e.eno,e.ename,e.esal,d.dname,d.dloc from dept d,emp1 e where e.dno=d.dno");
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
