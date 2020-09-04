package com.chessgame;
public class Queen extends Coin {

	public Queen(boolean white, boolean alive) {
		super(white, alive);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean move(Spot start, Spot end) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRoutePossible(Spot start, Spot end) {

		int xDiff, yDiff;
		
		 xDiff = Math.abs(start.getX()-end.getX());
		 yDiff = Math.abs(start.getY()-end.getY());
		 
		 
		 if(((xDiff==0) && (yDiff>0)) || ((yDiff==0) && (xDiff>0)) || ((xDiff == yDiff))) {
			 
			 
			 
			 return true;
			 
		 }
		return false;
	}

}
