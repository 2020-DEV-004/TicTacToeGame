package com.bnpp.tictactoe;

public class Board {
	
	public static final int ROWS = 3;
	public static final int COLS = 3;
	public Cell[][] cells;
	int currentRow;
	int currentCol;
	
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
	   
	   public boolean hasWon(Seed theSeed) {
		    return (cells[currentRow][0].content == theSeed         // 3-in-the-row
		                 && cells[currentRow][1].content == theSeed
		                 && cells[currentRow][2].content == theSeed
		            || cells[0][currentCol].content == theSeed      // 3-in-the-column
		                 && cells[1][currentCol].content == theSeed
		                 && cells[2][currentCol].content == theSeed
		            || currentRow == currentCol            // 3-in-the-diagonal
		                 && cells[0][0].content == theSeed
		                 && cells[1][1].content == theSeed
		                 && cells[2][2].content == theSeed
		            || currentRow + currentCol == 2    // 3-in-the-opposite-diagonal
		                 && cells[0][2].content == theSeed
		                 && cells[1][1].content == theSeed
		                 && cells[2][0].content == theSeed);
		 }

}
