package pakkeA;

import javax.swing.JOptionPane;

public class Game {
	int[] brett;
	boolean host;
	
	public Game(boolean host) {
		brett = new int[9];
		//0: ingen brikke
		//1: spelar A
		//2: spelar B
		this.host = host;
	}
	
	public void init() {
		JOptionPane.showMessageDialog(null, "Spelet starter.");
		if(!host) {
			
		}
	}
	
	public void start() {
		for(int i = 0; i < 5; i++) {
			trekk(i/2==0);
		}
	}
	public void printBrett() {
		for(int i = 0; i < 3; i++) {
			for(int ii = 0; ii < 3; ii++) {
				if(brett[i+ii] == 0) {
					System.out.print("[ ]");
				} else if (brett[i+ii] == 1) {
					System.out.print("[A]");
				} else {
					System.out.print("[B]");
				}
			}
			System.out.println("");
		}
	}
	public void trekk(boolean a) {
		printBrett();
		System.out.println("");
		int p = Integer.parseInt(JOptionPane.showInputDialog("Oppgi nummer på plass du skal legge brikke."));
		if(a) {
			brett[p] = 1;
		} else if (!a) {
			System.out.println("Venter på motstander.");
			
		}
	}
}
