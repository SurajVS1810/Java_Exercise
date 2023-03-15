package Networking;
import java.net.*;
import java.io.*;
public class Slot15_p4Cli {

	public static void main(String[] args) throws IOException {
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter the no : ");
		int i=Integer.parseInt(dis.readLine());
		byte[] b=(String.valueOf(i).getBytes());
		DatagramSocket ds=new DatagramSocket();
		InetAddress my=InetAddress.getLocalHost();
		DatagramPacket dp=new DatagramPacket(b,b.length,my,1234);
		ds.send(dp);
		System.out.println("Data is sent");
		
		byte[] b1=new byte[2048];
		DatagramSocket ds1=new DatagramSocket(1235);
		DatagramPacket dp1=new DatagramPacket(b1,b1.length);
		ds1.receive(dp1);
		String str=new String(dp1.getData());
		int j=Integer.parseInt(str.trim());
		System.out.println("The square of no is : "+j*j);
	}

}