import java.net.*;
import java.io.*;

public class TCPServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//		1.打开Socket
		ServerSocket s = new ServerSocket(1234);
		Socket s1 = s.accept();
		//		2.Wait for Request
		OutputStream s1out = s1.getOutputStream();
		DataOutputStream dos = new DataOutputStream(s1out);
		//      3.OutputStream
		dos.writeUTF("Hi there");
		//		4.Perform Communication
		dos.close();
		s1out.close();
		s1.close();
		//      5.close
	}

}
