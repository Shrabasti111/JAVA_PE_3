package com.stackroute.PE3;

public class ChessBoard {


   //this function returns a square chess board
    public String[][] chessBoard(int row, int column) {

        String[][] chess = new String[row][column];

        for(int i=0; i<row; i=i+2){  //runs for even rows

            for(int j=0;j<column; j+=2) { //runs for even columns
                chess[i][j] = "WW|";
            }

            for(int k=1;k<column; k+=2) { //runs for odd columns
                chess[i][k] = "BB|";
            }

        }

        for(int i=1; i<row; i=i+2){  //runs for odd rows

            for(int j=0;j<column; j+=2) { //runs for even columns
                chess[i][j] = "BB|";
            }

            for(int k=1;k<column; k+=2) { //runs for odd columns
                chess[i][k] = "WW|";
            }

        }

        return chess; //returns the chess board


    }

    //this functions checks whether the number of rows is same as that of the number of columns
    boolean checkRowColumn(int row, int column) {
        if(row == column)
            return  true;
        else
            return false;
    }

}
