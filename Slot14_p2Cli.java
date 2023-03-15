//Accept a number from the client, and print its factorial in the server.
package Networking;
import java.io.*;
import java.net.*;
public class Slot14_p2Cli {

	public static void main(String[] args) {
		try {
			DataInputStream dis=new DataInputStream(System.in);
			Socket cs=new Socket("localhost",1321);
			System.out.println("Sending request to the server");
			System.out.print("Enter the no needed to find factorial : ");
			String n=dis.readLine();
			DataOutputStream oos=new DataOutputStream (cs.getOutputStream());
			oos.writeUTF(n);
			cs.close();
			
		}catch(Exception e) {System.out.println(e);}

	}

}