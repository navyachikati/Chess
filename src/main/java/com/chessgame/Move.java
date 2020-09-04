package com.chessgame;

public class Move {
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
