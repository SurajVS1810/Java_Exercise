package Networking;
import java.io.*;
import java.net.*;
public class Slot13_p3Ser {

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(1414);
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("Waiting for the request");
			Socket as=ss.accept();
			System.out.println("Connection made");
			DataInputStream sis=new DataInputStream(as.getInputStream());
			DataOutputStream dou=new DataOutputStream(as.getOutputStream());
			while(true)
			{
				String m=(String)sis.readUTF();
				if(m.equals("#"))break;
				System.out.println("Message received from client "+m);
				System.out.print("Enter the reply to client : ");
				String msg=dis.readLine();
				dou.writeUTF(msg);
				if(msg.equals("#"))break;
			}
			ss.close();
			as.close();
		}catch(Exception e) {System.out.println(e);}

	}

}