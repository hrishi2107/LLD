package org.example.models;

import org.example.piece;

public class Board {
    public int length;
    public int breadth;
    public piece[][] board;

    public Board(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
        this.board = new piece[length][breadth];
    }

    public boolean putPiece(int i,int j, piece p)
    {
        if(this.board[i][j]==null) {
            this.board[i][j] = p;
            return true;
        }
        return false;
    }

    public void printBoard()
    {
        for(int i=0;i<this.length;i++)
        {
            System.out.print("| ");
            for(int j=0;j<this.breadth;j++)
            {
                if(this.board[i][j]== null)
                    System.out.print( "  | ");
                else
                    System.out.print(this.board[i][j].playingPiece.name() + " | ");
            }
            System.out.println();
        }
    }

}
