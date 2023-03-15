package Networking;

import java.io.*;
import java.net.*;
import java.net.Socket;

public class Slot13_p2Ser {
	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(1324);
			System.out.println("Waiting for the request from 1234");
			Socket as=ss.accept();
			System.out.println("Connection made");
			DataInputStream ois=new DataInputStream (as.getInputStream());
			String m=(String)ois.readUTF();
			System.out.println("The message received is "+m);
			as.close();
			ss.close();
			
		}catch(Exception e) {System.out.println(e);}

	}
}