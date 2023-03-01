//Write a program to create a table Citizen( Id(Primary), Name, age, address, DOB), insert records, and display the records.
package JDBC;
import java.io.DataInputStream;
import java.sql.*;
import java.io.*;
import java.util.Scanner;
public class Slot16_p1 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca2253","mca2253");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("create table Citizen(ID varchar2(20) primary key,Name varchar2(20),age int,address varchar2(20),DOB date)");
			System.out.println("table created.");
			Scanner sc=new Scanner(System.in);
			DataInputStream dis=new DataInputStream(System.in);
			System.out.print("Enter no of records needed to be inserted : ");
			try {
			int n=Integer.parseInt(dis.readLine());
			for(int x=1;x<=n;x++) {
			System.out.println("Enter the "+x+" record");
			System.out.print("\nEnter Id : ");
			String a=sc.nextLine();
			System.out.print("Enter Name : ");
			String b=sc.nextLine();
			System.out.print("Enter age : ");
			int c=Integer.parseInt(dis.readLine());
			System.out.print("Enter address : ");
			String d=sc.nextLine();
			System.out.print("Enter DOB : ");
			String e=sc.nextLine();
			stmt.executeUpdate("insert into Citizen values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"')");
		 	}
			System.out.println("records inserted.");
			}catch(IOException e) {System.out.println(e);}
			ResultSet rs=stmt.executeQuery("select * from Citizen");
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
		}
		catch(Exception e) {System.out.println(e);
		}

	}
}









