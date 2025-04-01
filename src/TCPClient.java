import java.net.*;
import java.io.*;
import java.util.*;

public class TCPClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//		1.Connet host port
		Socket s1 = new Socket("localhost", 1230);
//		//      2.InputStream
//		InputStream s1In = s1.getInputStream();
//		DataInputStream dis = new DataInputStream(s1In);
//		String st = new String(dis.readUTF());
//		System.out.println(st);
//		//		3.Perform Communication
//		dis.close();
//		s1In.close();
//		s1.close();
//		//		4.close
		BufferedReader in = new BufferedReader(new InputStreamReader(s1.getInputStream()));
		
		String csv = in.readLine();
		System.out.println("Received CSV: " + csv);
		
		List<String> words = Arrays.asList(csv.split(","));

        System.out.println("Converted to List: " + words);
        in.close();
	}

}
