//Write a program to implement one-one chatting using the TCP protocol.
package Networking;
import java.net.*;
import java.io.*;
public class Slot13_p3Cli {

	public static void main(String[] args) {
		try {
			Socket cs=new Socket("localhost",1414);
			System.out.println("Sending request for the server");
			DataInputStream dis=new DataInputStream(System.in);
			DataOutputStream cis=new DataOutputStream(cs.getOutputStream());
			DataInputStream sis=new DataInputStream(cs.getInputStream());
			while(true) {
				System.out.print("Enter the message to be sent to server : ");
				String str=dis.readLine();
				cis.writeUTF(str);
				if(str.equals("#")) break;
				
				String mes=(String)sis.readUTF();
				if(mes.equals("#")) break;
				System.out.println("The reply received from server "+mes);
			}
			cs.close();
			
		}catch(Exception e) {System.out.println(e);}
	}

}