package com.bnpp.tictactoe;

import java.util.Scanner;

/**
 * TicTacToe Game Kata
 *
 */
public class TicTacToeGame 
{

	public Board board;
	public Seed currentPlayer;
	private static Scanner in = new Scanner(System.in); 
	
	public TicTacToeGame() {
		board = new Board();
		initGame();
	}

	private void initGame() {
		board.init();
		this.currentPlayer = Seed.CROSS;
				
	}

	public void startGame() {
		 if (currentPlayer == Seed.CROSS) {
	            System.out.print("Player 'X', enter your move (row[1-3] column[1-3]): ");
	         } else {
	            System.out.print("Player 'O', enter your move (row[1-3] column[1-3]): ");
	         }
	         int row = in.nextInt() - 1;
	         int col = in.nextInt() - 1;
	         if (row >= 0 && row < Board.ROWS && col >= 0 && col < Board.COLS
	               && board.cells[row][col].content == Seed.EMPTY) {
	            board.cells[row][col].content = currentPlayer;

	         } 
	         else {
	            System.out.println("This move at (" + (row + 1) + "," + (col + 1)
	                  + ") is not valid. Try again...");
	         }
	      // Switch player
	         currentPlayer = (currentPlayer == Seed.CROSS) ? Seed.NOUGHT : Seed.CROSS;
	}
   
}
