package joiner;

import pakkeA.Game;

public class Main {

	public static void main(String[] args) {
		Client client = new Client();
		Game game = new Game(false);
		client.sjekk();
		game.start();
	}

}
