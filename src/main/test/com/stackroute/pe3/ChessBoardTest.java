package com.stackroute.PE3;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class ChessBoardTest {

    ChessBoard  chessBoard;

    @Before
    public void setUp() {
        chessBoard = new ChessBoard();
    }

    @After
    public void tearDown() {
        chessBoard = null;
    }

    @Test
    public void returnChessBoard() { //checks whether the result matches the expected output
        int row =8, column = 8;
        boolean check = chessBoard.checkRowColumn(row, column);
        assertTrue(check);
        String[][] result = chessBoard.chessBoard(row, column);
        String[][] expected = {{"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"},
                {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"}};
        assertArrayEquals(expected,result);
    }

    @Test
    public void returnFalse() { //checks whether the result matches the expected output
        int row=2, column = 3;
        boolean check = chessBoard.checkRowColumn(row, column);
        assertFalse(check);
    }

    @Test
    public void returnAnotherChessBoard() { //checks whether the result matches the expected output
        int row =4, column = 4;
        boolean check = chessBoard.checkRowColumn(row, column);
        assertTrue(check);
        String[][] result = chessBoard.chessBoard(row, column);
        String[][] expected = {{"WW|", "BB|", "WW|", "BB|"},
                               {"BB|", "WW|", "BB|", "WW|"},
                               {"WW|", "BB|", "WW|", "BB|"},
                               {"BB|", "WW|", "BB|", "WW|"},};
        assertArrayEquals(expected,result);
    }



}