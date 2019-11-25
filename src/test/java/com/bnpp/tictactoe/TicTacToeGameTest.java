package com.bnpp.tictactoe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bnpp.tictactoe.TicTacToeGame;

/**
 * Unit test for TicTacToeGame Class.
 */
public class TicTacToeGameTest {
	TicTacToeGame game;

	@Before
	public void init() {
		game = new TicTacToeGame();
	}

	/**
	 * Test case to verify instance is not null
	 */
	@Test
	public void newTicTacToeGameInstanceMustnotbeNull() {
		TicTacToeGame game = new TicTacToeGame();
		assertNotNull(game);
	}

	@Test
	public void verifySizeOfBoardFor3X3() {
		int rows = game.board.cells.length;
		assertEquals(3, rows);
		int cols = game.board.cells[0].length;
		assertEquals(3, cols);
	}
	
	@Test
	public void playerOneMustBeCrossWhenGameStarted() {
		assertEquals (Seed.CROSS,game.currentPlayer);
	}
}
