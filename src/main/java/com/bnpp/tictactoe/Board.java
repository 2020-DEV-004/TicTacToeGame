package com.bnpp.tictactoe;

public class Board {
	
	public static final int ROWS = 3;
	public static final int COLS = 3;
	public Cell[][] cells;
	
	/** Constructor to initialize the game board */
	   public Board() {
	      cells = new Cell[ROWS][COLS]; 
	      for (int row = 0; row < ROWS; ++row) {
	         for (int col = 0; col < COLS; ++col) {
	            cells[row][col] = new Cell(row, col); 
	         }
	      }
	   }
	   public void init() {
		      for (int row = 0; row < ROWS; ++row) {
		         for (int col = 0; col < COLS; ++col) {
		            cells[row][col].clear();  // clear the cell content
		         }
		      }
		   }

}
