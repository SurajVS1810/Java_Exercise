//Assume that login is a table which has Uname, Upass. Check whether a record with “Uname=”Bob” and “UPass=”Alice123#”is present in the table. 
package JDBC;
import java.sql.*;
public class Slot16_p2 {

	public static void main(String[] args) {
		try {
			int i=0;
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca2253","mca2253");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select Uname,Upass from login where Uname='Bob'and Upass='Alice123#'");
		while(rs.next()) {
			System.out.println("Recort is found");
			System.out.println(rs.getString(1)+"    "+rs.getString(2));
			i++;
		}
		if(i==0) {System.out.println("Recort is not found");}
		con.close();
	}catch(Exception e) {System.out.println(e);}
}
}




