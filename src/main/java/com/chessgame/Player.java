package com.chessgame;

public class Player {
	
	private boolean white;
	private String playername;
	
	public Player(boolean white, String playername) {
		this.white = white;
		this.playername = playername;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public boolean isWhite() {
		return white = true;
	}

}
