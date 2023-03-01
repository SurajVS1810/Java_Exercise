//Construct the following tables: Dept (dno(Primary), dname, dloc), Emp1 ( eno(Primary), ename, esal ,dno(Foreign))

package JDBC;
import java.sql.*;
public class Slot17_p1 {

	public static void main(String[] args) {
		try {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca2253","mca2253");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("create table Dept(dno varchar2(20) Primary key, dname varchar2(20), dloc varchar2(20))");
		stmt.executeUpdate("create table Emp1(eno varchar2(20) Primary key, ename varchar2(20), esal int,dno varchar2(20) references Dept(dno))");
		System.out.println("tables created.");
		con.close();

	}catch(Exception e) {System.out.println(e);}
}
}



