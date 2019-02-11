package host;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	ServerSocket welcomeSocket;
	BufferedReader inFromClient;
	DataOutputStream outToClient;
	boolean tur;
	public Server() {
		try {
			tur = true;
			welcomeSocket = new ServerSocket(1234);
			Socket connectionSocket = welcomeSocket.accept();
			inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			outToClient = new DataOutputStream(connectionSocket.getOutputStream());
			
			System.out.println("Server: player 2 har joina.");
			
		} catch (IOException e) {
			System.out.println("TCP server: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void sendBrett(int[] brett) {
		
	}
	
	
	
}
