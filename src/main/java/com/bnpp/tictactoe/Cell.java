package com.bnpp.tictactoe;

public class Cell {

	int row, col; // row and column of this cell
	Seed content;

	/** Constructor to initialize this cell */
	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	public void clear() {
	      content = Seed.EMPTY;
	   }
	public void paint() {
	      switch (content) {
	         case CROSS:  System.out.print(" X "); break;
	         case NOUGHT: System.out.print(" O "); break;
	         case EMPTY:  System.out.print("   "); break;
	      }
	   }

}
