package chap17;

import java.io.*;
import java.net.*;

public class EchoServerEx1 {
	public static void main(String[] args)  {
		int port = 5000;
		Socket client = null;
		ServerSocket server = null;
		try {
		server = new ServerSocket(port);
		client = server.accept();
		System.out.println("server : " + server);
		System.out.println("localport : "+ server.getLocalPort());
		System.out.println();
		System.out.println("connected ip" + client.getInetAddress());
		System.out.println("connected port : " + client.getPort());
		PrintWriter out = new PrintWriter(client.getOutputStream(),true);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
		String input;
		while((input=br.readLine())!=null) {
			out.println(input);
			out.flush();
			System.out.println("client data : "+ input);
		}
		br.close(); out.close(); client.close(); server.close();
		}catch(IOException e) {
			e.getStackTrace();
		}
	}
}
