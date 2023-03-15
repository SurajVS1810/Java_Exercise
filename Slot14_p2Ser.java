package Networking;

import java.io.*;
import java.net.*;
import java.net.Socket;

public class Slot14_p2Ser {
	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(1321);
			System.out.println("Waiting for the request from 1234");
			Socket as=ss.accept();
			System.out.println("Connection made");
			DataInputStream ois=new DataInputStream (as.getInputStream());
			String m=(String)ois.readUTF();
			int f=Integer.parseInt(m);
			int fact=1;
			for(int i=1;i<=f;i++)
			{
				fact=fact*i;
			}
			System.out.println("The fact of "+f+" is "+fact);
			as.close();
			ss.close();
			
		}catch(Exception e) {System.out.println(e);}

	}
}