package host;


import pakkeA.Game;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Starter host. Venter på at motstander skal koble til.");
		Server server = new Server();
//		String minIp = "localhost";
//		JOptionPane.showMessageDialog(null, "Din IP er " + minIp + ". Gi den til motstanderen din.");
		Game spel = new Game(true);
		spel.start();
	}

}
