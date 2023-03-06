//Write a program to Serialize/De-Serialize selected attributes of an Employee.
import java.io.*;
class Slot12_p4Employee implements Serializable
{
    String id;
    String  name;
    String dept;

public Slot12_p4Employee(String eid,String ename,String edept)
{
	this.id=eid;
	this.name=ename;
	this.dept=edept;
}

public void disp()
{
	System.out.println("empId is " + id);
	System.out.println("Employee name is " + name);
	System.out.println("Employee dept is " + dept);
}
}