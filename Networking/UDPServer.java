package com;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
	public static void main(String[] args) {

		try {
			DatagramSocket dsoc = new DatagramSocket(9876);// Socket for Server

			/* For Receiving */
			byte[] b1 = new byte[1024];
			DatagramPacket dp1 = new DatagramPacket(b1, b1.length);
			// receiving packet from client
			dsoc.receive(dp1);

			String dataClient = new String(dp1.getData());
			System.out.println("From clien:> " + dataClient);
			/* ####################################################### */
			
			
			/* For sending */
			String dataServer = "Hello I'm Server";
			byte[] b2 = dataServer.getBytes();

			DatagramPacket dp2 = new DatagramPacket(b2, b2.length, dp1.getAddress(), dp1.getPort());
			// sending packet to client
			dsoc.send(dp2);
			/* ####################################################### */

		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}