//Write a program to implement connection less communication.
package Networking;
import java.io.*;
import java.lang.*;
import java.net.*;
public class Slot15_p1Cli {

	public static void main(String[] args) {
		try {
		DataInputStream dis=new DataInputStream(System.in);
		System.out.print("Enter the no :");
		int i=Integer.parseInt(dis.readLine());
		byte[] b=(String.valueOf(i).getBytes());
		DatagramSocket ds=new DatagramSocket();
		InetAddress my=InetAddress.getLocalHost();
		DatagramPacket dp=new DatagramPacket(b, b.length,my,1230);
		ds.send(dp);
		System.out.println("Data is sent");
	}catch(IOException e) {System.out.println(e);}
	}
}