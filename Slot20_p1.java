//Implement a JDBC program which uses a Stored Procedure to insert records into Department table.
package JDBC;
import java.sql.*;
import java.util.Scanner;

public class Slot20_p1 {

	public static void main(String[] args) {
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter deptid : ");
		String id=sc.nextLine();
		System.out.println("Enter deptname : ");
		String name=sc.nextLine();
		CallableStatement cst=con.prepareCall("{call dep(?,?)");
		cst.setString(1,id);
		cst.setString(2,name);
		cst.executeUpdate();
		System.out.println("rows inserted");
		con.close();
		}catch(Exception e) {System.out.println(e);}

	}
}

/*
 Procedure
 
create or replace procedure dep(deptid in varchar2,deptname in varchar2)
is 
begin
insert into dept1 values(deptid,deptname);
end;
/
*/