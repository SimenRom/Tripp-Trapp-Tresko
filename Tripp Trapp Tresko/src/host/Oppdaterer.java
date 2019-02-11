package host;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;

public class Oppdaterer implements Runnable {
	BufferedReader inFromClient;
	DataOutputStream outToClient;
	public Oppdaterer(BufferedReader in, DataOutputStream ut) {
		this.inFromClient = in;
		this.outToClient = ut;
	}
	@Override
	public void run() {
		try {
			int tal = inFromClient.read();
			
			if(tal == 3) {
				outToClient.writeInt(0);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
