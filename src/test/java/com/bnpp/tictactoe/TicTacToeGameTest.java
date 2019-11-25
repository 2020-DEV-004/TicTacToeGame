package com.bnpp.tictactoe;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import com.bnpp.tictactoe.TicTacToeGame;

/**
 * Unit test for TicTacToeGame Class.
 */
public class TicTacToeGameTest 
{
    /**
     *  Test case to verify instance is not null
     */
    @Test
    public void newTicTacToeGameInstanceMustnotbeNull()
    {
    	TicTacToeGame game = new TicTacToeGame();
        assertNotNull( game );
    }
}
