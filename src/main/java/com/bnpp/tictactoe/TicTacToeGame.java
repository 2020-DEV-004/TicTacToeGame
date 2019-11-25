package com.bnpp.tictactoe;

/**
 * TicTacToe Game Kata
 *
 */
public class TicTacToeGame 
{

	public Board board;
	public Seed currentPlayer;
	
	public TicTacToeGame() {
		board = new Board();
		initGame();
	}

	private void initGame() {
		board.init();
		this.currentPlayer = Seed.CROSS;
				
	}
   
}
