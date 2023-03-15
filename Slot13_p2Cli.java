//Write a program to implement communication between a client and server client, via Socket Programming
package Networking;
import java.io.*;
import java.net.*;
public class Slot13_p2Cli {

	public static void main(String[] args) {
		try {
			DataInputStream dis=new DataInputStream(System.in);
			Socket cs=new Socket("localhost",1324);
			System.out.println("Sending request to the server");
			System.out.print("Enter the message to be sent : ");
			String msg=dis.readLine();
			DataOutputStream oos=new DataOutputStream (cs.getOutputStream());
			oos.writeUTF(msg);
			cs.close();
			
		}catch(Exception e) {System.out.println(e);}

	}

}