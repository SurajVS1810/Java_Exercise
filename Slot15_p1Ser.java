package Networking;

import java.io.IOException;
import java.net.*;

public class Slot15_p1Ser {

	public static void main(String[] args) throws IOException {
		byte[] b1=new byte[2048];
		DatagramSocket ds=new DatagramSocket(1230);
		DatagramPacket dp=new DatagramPacket(b1, b1.length);
		ds.receive(dp);
		String str=new String(dp.getData());
		int num=Integer.parseInt(str.trim());
		num++;
		System.out.println("The no is "+num);

	}

}