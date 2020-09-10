package com.chessgame;

public class Game {
	private Player[] players;
	private Board board;
	private Player currentTurn;
	private GameStatus gameStatus = GameStatus.ACTIVE;
	
	
	public Game(Player[] players, Board board, Player currentTurn) {
		this.players = players;
		this.board = board;
		this.currentTurn = currentTurn;
	}
	
	
	public Game(Player[] players) {
		this.board = new Board();
		this.players = players;
		this.currentTurn = players[0];
	}

	public boolean move(Player player, int sourceX, int sourceY, int destX, int destY) {
		
		Spot sourceSpot = board.boxes[sourceX][sourceY];
		Spot destSpot = board.boxes[destX][destY];
		
		if(player == currentTurn) {
			// check all conditions of is move possible
			
			
			return true;
			
		} 
			
		return false;
	}

}
