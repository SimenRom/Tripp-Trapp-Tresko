package joiner;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	Socket clientSocket;
	DataOutputStream outToServer;
	BufferedReader inFromServer;
	public Client() {
		try {
			clientSocket = new Socket("localhost", 1234);
			outToServer = new DataOutputStream(clientSocket.getOutputStream());
			   
			inFromServer = new BufferedReader(
					new InputStreamReader(clientSocket.getInputStream()));
			System.out.println("Du er tilkobla!");
		} catch (IOException e) {
			System.out.println("Host må starte før du kan koble til.");
//			System.out.println("TCP client: " + e.getMessage());
//			e.printStackTrace();
		}
		
	}
	
	public void sjekk() {
		try {
			outToServer.writeInt(3);
		} catch (IOException e) {
			System.out.println("Du har missta tilkobling.");
			e.printStackTrace();
		}
	}
	
	
}
