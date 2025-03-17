import java.net.*;
import java.io.*;

public class TCPClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//		1.连接host 端口
		Socket s1 = new Socket("localhost", 1234);
		//      2.InputStream
		InputStream s1In = s1.getInputStream();
		DataInputStream dis = new DataInputStream(s1In);
		String st = new String(dis.readUTF());
		System.out.println(st);
		//		3.Perform Communication
		dis.close();
		s1In.close();
		s1.close();
		//		4.close
	}

}
