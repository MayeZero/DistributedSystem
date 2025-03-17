import java.net.*;
import java.io.*;

public class TCPMultiServer {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		ServerSocket s = new ServerSocket(1234);
		while(true) {
			Socket s1 = s.accept();
			
			OutputStream os = s1.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF("Hi there, 2025 03 18!");
			
			dos.close();
			os.close();
			s1.close();
		}
		
		
	}

}
