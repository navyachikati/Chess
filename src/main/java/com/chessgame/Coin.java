package com.chessgame;

public abstract class Coin {
	private boolean white = false;
	private boolean alive = true;
	
	public Coin(boolean white,boolean alive) {
	      this.white = white;
		  this.alive = alive;
		
	}
	
	
	public boolean isWhite() {
		return white;
	}
	public void setWhite(boolean white) {
		this.white = white;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	public boolean move(Spot start, Spot end) {
		
		if(start.getCoin().isWhite() == end.getCoin().isWhite()) {
			
			return false;
			
		}
		
		if (!isRoutePossible(start, end)) {
			return false;
		}
		
		if(end.getCoin() == null) {
			
			Coin coin = start.getCoin();
			end.setCoin(coin);
			start.setCoin(null);
		}
		else {
			Coin startCoin = start.getCoin();
			Coin endCoin = end.getCoin();
			end.setCoin(startCoin);
			start.setCoin(null);
			endCoin.setAlive(false);
		}			
		
		return true;
	}
 
	
	public abstract boolean isRoutePossible(Spot start, Spot end );
		
		
}
