package com;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClient {
	public static void main(String[] args) {

		try {
			DatagramSocket dsoc = new DatagramSocket();//Socket for client
			
			/* For sending */
			String dataSend = "I am Client";//data
			
			byte[] b1 = dataSend.getBytes();
			InetAddress add1 = InetAddress.getLocalHost();
			DatagramPacket dp1 = new DatagramPacket(b1,b1.length,add1,9876);//Packet for sending
			//sending packet to Server
			dsoc.send(dp1);
			/* ####################################################### */
			
			
			/* For Receiving */
			byte[] b2 = new byte[1024];
			DatagramPacket dp2 = new DatagramPacket(b2,b2.length);
			//receiving packet from server
			dsoc.receive(dp2);
			
			String dataReceive = new String(dp2.getData());
			System.out.println("From server:> "+dataReceive);
			/* ####################################################### */
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
