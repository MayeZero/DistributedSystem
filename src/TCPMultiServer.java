import java.net.*;
import java.util.*;
import java.io.*;

public class TCPMultiServer {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		ServerSocket s = new ServerSocket(1230);
		while(true) {
			Socket s1 = s.accept();
			
//			OutputStream os = s1.getOutputStream();
//			DataOutputStream dos = new DataOutputStream(os);
//			dos.writeUTF("Hi there, 2025 03 18!");
			Thread T1 = new Thread(()->ServerClientOutPut(s1)) ;
			T1.start();
//			dos.close();
//			os.close();
//			s1.close();
		}
	}
	
	private static void ServerClientOutPut(Socket s1) {
		try {
			Dictionary dictionary = new Dictionary();
			List<String> meaningForWord = dictionary.getMeaningsForWord("word1");
			String csv = String.join(",", meaningForWord);
			
			PrintWriter out = new PrintWriter(s1.getOutputStream(), true);
			out.println(csv);
            System.out.println("CSV sent to client: " + csv);

            out.close();
            s1.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
