import java.net.*;
import java.io.*;

public class UDPClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Usage: java UDPClient <message> <Host name> <Port number>
		DatagramSocket aSocket = null;
		try {
			aSocket = new DatagramSocket();
			byte[] m = args[0].getBytes();
			InetAddress aHost = InetAddress.getByName(args[1]);
			int serverPort = 6789;
			DatagramPacket request = new DatagramPacket(m, args[0].length(), aHost, serverPort);
			aSocket.send(request);
			byte[] buffer = new byte[1000];
			DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
			aSocket.receive(reply);
			System.out.println("Reply:" + new String(reply.getData()));
		}
		catch(SocketException e) {System.out.println("Socket:" + e.getMessage());}
		catch(IOException e) {System.out.println("IO:" + e.getMessage());}
		finally
		{
			if(aSocket != null) aSocket.close();
		}
	}

}
