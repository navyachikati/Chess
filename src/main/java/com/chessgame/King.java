package com.chessgame;
public class King extends Coin {

	    public King(boolean white, boolean alive) {
		super(white, alive);
		// TODO Auto-generated constructor stub
	}

		@Override
		public boolean isRoutePossible(Spot start, Spot end) {
			// TODO Auto-generated method stub
			
			int xDiff ,yDiff;
			
			 xDiff = Math.abs(start.getX()-end.getX());
			 yDiff = Math.abs(start.getY()-end.getY());

			 if ((xDiff  <= 1)  && (yDiff <=1) && (xDiff+yDiff <=2)) {
				 return true;
			 }

		    
			return false;
		}
	

}
