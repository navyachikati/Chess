package com.chessgame;

public class Main {

	public static void main(String[] args) {
		
		Player player1 = new Player(true, "Sai");
		Player player2 = new Player(false, "Navya");
		Player[] players = new Player[2];
		players[0] = player1;
		players[1] = player2;
		Game game = new Game(players);
		// two platers will start playing one by one. 
		
		game.move(player1, 1, 1, 1, 2);
	}

}
