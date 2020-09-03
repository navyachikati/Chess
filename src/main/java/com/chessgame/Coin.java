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
	
	public abstract boolean move(Spot start,Spot end); 
	
	public abstract boolean isRoutePossible(Spot start, Spot end );
	
	public boolean isMovePossible(Spot start, Spot end ) {
		if(end.getCoin() == null) {
			//write move logic
			return true;
			
		}
		
		
		
		
		if(start.getCoin().isWhite() == end.getCoin().isWhite()) {
		return false;
		}
	
	
		
		
		
		
		
		
		
		return false;
	}
	
	
		
		
}
