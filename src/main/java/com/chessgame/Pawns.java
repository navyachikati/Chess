package com.chessgame;
public class Pawns extends Coin {
	
	Boolean isFirstStep = true;
	
	
	public Pawns(boolean white, boolean alive) {
		super(white, alive);
	}

	@Override
	public boolean move(Spot start, Spot end) {
		if (isRoutePossible(start, end)) {
			isFirstStep = false;
			Coin destCoin = end.getCoin();
			if (destCoin != null) {
				destCoin.setAlive(false);
			}
			end.setCoin(start.getCoin());
			start.setCoin(null);
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRoutePossible(Spot start, Spot end) {
		
		if (isFirstStep) {
			
			if(start.getX() == end.getX()) {
				
				if((isWhite()) && ((end.getY() - start.getY()) == 2)) {
					// TODO: check if there is any coin in between
					return true;
				}
			}
		}

		if(start.getX() == end.getX()) {
			
			if((isWhite()) && ((end.getY() - start.getY()) == 1)) {
				// TODO: check if there is any coin in between
				return true;
			}
		}
		
		if(Math.abs(start.getX()-end.getX()) ==1) {
			
			if((isWhite()) && ((end.getY() - start.getY()) == 1)) {
				// TODO: check if there is any coin in between
				Coin coinAtDest = end.getCoin();
				if (coinAtDest == null || coinAtDest.isWhite()) {
					return false;
				}
				return true;
			}
			if((!isWhite()) && ((end.getY() - start.getY()) == -1)) {
				// TODO: check if there is any coin in between
				Coin coinAtDest = end.getCoin();
				if (coinAtDest == null || !coinAtDest.isWhite()) {
					return false;
				}
				return true;
			}
		}
		return false;
		}

}
