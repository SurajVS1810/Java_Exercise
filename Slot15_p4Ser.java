package Networking;
import java.net.*;
import java.io.*;
public class Slot15_p4Ser {

	public static void main(String[] args) throws IOException {
		byte[] b1=new byte[2048];
		DatagramSocket ds=new DatagramSocket(1234);
		DatagramPacket dp=new DatagramPacket(b1,b1.length);
		ds.receive(dp);
		String str=new String(dp.getData());
		int i=Integer.parseInt(str.trim());
		i++;
		System.out.println("The no is : "+i);
		
		byte[] b2=(String.valueOf(i).getBytes());
		//DatagramSocket ds1=new DatagramSocket();
		InetAddress my=InetAddress.getLocalHost();
		DatagramPacket dp1=new DatagramPacket(b2,b2.length,my,1235);
		ds.send(dp1);
		System.out.println("Data is sent is "+i);
	}

}