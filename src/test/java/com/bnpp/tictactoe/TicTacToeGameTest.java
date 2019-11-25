package com.bnpp.tictactoe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for TicTacToeGame Class.
 */

public class TicTacToeGameTest {
	TicTacToeGame game;

	@Before
	public void init() {
		game = new TicTacToeGame();
		ByteArrayOutputStream testOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(testOut));
	}

	@After
	public void restoreSystemInputOutput() {
		InputStream systemIn = System.in;
		PrintStream systemOut = System.out;
		System.setIn(systemIn);
		System.setOut(systemOut);
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
		assertEquals(Seed.CROSS, game.currentPlayer);
	}

	@Test
	public void verifyPlayerOneHasWon() {
		game.board.cells[0][0].content = Seed.CROSS;
		game.board.cells[0][1].content = Seed.CROSS;
		game.board.cells[0][2].content = Seed.CROSS;
		assertEquals(true,game.board.hasWon(Seed.CROSS));
		
	}
	
	@Test
	public void verifyPlayerTwoHasWon() {
		game.board.cells[0][2].content = Seed.NOUGHT;
		game.board.cells[1][1].content = Seed.NOUGHT;
		game.board.cells[2][0].content = Seed.NOUGHT;
		game.board.currentRow= 2;
		game.board.currentCol = 0;
		assertEquals(true,game.board.hasWon(Seed.NOUGHT));
		
	}
}
