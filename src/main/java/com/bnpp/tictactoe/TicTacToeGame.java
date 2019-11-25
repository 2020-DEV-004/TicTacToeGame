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
	public GameState currentState;
	private static Scanner in = new Scanner(System.in); 
	
	public TicTacToeGame() {
		board = new Board();
		initGame();
	}

	private void initGame() {
		board.init();
		this.currentPlayer = Seed.CROSS;
		this.currentState = GameState.PLAYING;		
	}

	public void startGame() {
		  do {
		 playerMove(currentPlayer);
		 updateGame(currentPlayer);
		 if (currentState == GameState.CROSS_WON) {
	            System.out.println("'X' won! Bye!");
	         } else if (currentState == GameState.NOUGHT_WON) {
	            System.out.println("'O' won! Bye!");
	         } else if (currentState == GameState.DRAW) {
	            System.out.println("It's Draw! Bye!");
	         }
	      // Switch player
	         currentPlayer = (currentPlayer == Seed.CROSS) ? Seed.NOUGHT : Seed.CROSS;
	}  while (currentState == GameState.PLAYING); 
	}
		  
	
	private void playerMove(Seed theSeed) {
		// TODO Auto-generated method stub
		boolean validInput = false;
		 do {
		 if (theSeed == Seed.CROSS) {
	            System.out.print("Player 'X', enter your move (row[1-3] column[1-3]): ");
	         } else {
	            System.out.print("Player 'O', enter your move (row[1-3] column[1-3]): ");
	         }
	         int row = in.nextInt() - 1;
	         int col = in.nextInt() - 1;
	         if (row >= 0 && row < Board.ROWS && col >= 0 && col < Board.COLS
	               && board.cells[row][col].content == Seed.EMPTY) {
	            board.cells[row][col].content = theSeed;
	            board.currentRow = row;
	            board.currentCol = col;	
	            validInput = true; 
	         } 
	         else {
	            System.out.println("This move at (" + (row + 1) + "," + (col + 1)
	                  + ") is not valid. Try again...");
	         }
		 } while (!validInput);  
	}
	
	 public void updateGame(Seed theSeed) {
	      if (board.hasWon(theSeed)) {  // check for win
	         currentState = (theSeed == Seed.CROSS) ? GameState.CROSS_WON : GameState.NOUGHT_WON;
	      }
	      else if (board.isDraw()) {  // check for draw
		         currentState = GameState.DRAW;
		      }
	      // Otherwise, no change to current state (still GameState.PLAYING).
	   }
   public static void main(String[] args) {
	   new TicTacToeGame().startGame();
   }
}
