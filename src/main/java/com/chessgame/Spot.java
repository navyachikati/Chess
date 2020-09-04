package com.chessgame;
public class Spot {
	private Coin coin;
	private int x;
	private int y;
	
	public Spot(int x,int y,Coin coin) {
		this.x = x;
		this.y = y;
		this.coin = coin;
		
	}

	public Coin getCoin() {
		return coin;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void setCoin(Coin coin) {
		this.coin = coin;
	}
}
