package org.example;

import org.example.models.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PlayGame {
    public Player playerX = new Player.playerBuilder()
                                .setName("Hrishi")
                                .setMyPiece(new pieceX(signs.X))
                                .build();
    public Player playerO = new Player.playerBuilder()
                                .setName("Prakrati")
                                .setMyPiece(new pieceO(signs.O))
                                .build();

    public int rows = 3;
    public int cols = 3;
    public Board playingBoard = new Board(rows,cols);
    Deque<Player> players;


    public void play()
    {
        System.out.println("LET'S START THE GAME!!!");

        int freeSpace = rows*cols;
        boolean noWinner = true;
        players = new LinkedList<>();
        players.add(playerX);
        players.add(playerO);
        while(noWinner)
        {
            playingBoard.printBoard();
            Player currentPlayer = players.removeFirst();
            if(freeSpace == 0)
            {
                System.out.println("Game ends in a draw!!");
                break;
            }

            System.out.println("Player: "+ currentPlayer.name+ " enter the row and col positions: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String values[] = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputCol = Integer.valueOf(values[1]);
            boolean chance = playingBoard.putPiece(inputRow,inputCol,currentPlayer.myPiece);
            if(chance){
                freeSpace--;
                players.addLast(currentPlayer);
            }
            else {
                System.out.println("Incorrect position selected. Try again!");
                players.addFirst(currentPlayer);
            }
            boolean winner = checkWinner(inputRow,inputCol,currentPlayer.myPiece);
            if(winner)
            {
                playingBoard.printBoard();
                System.out.println(currentPlayer.name + " won!!");
                noWinner = false;
                break;
            }
        }



    }

    boolean checkWinner(int row, int col, piece p)
    {
        boolean res = false;
        boolean checkRow = true;
        boolean checkCol = true;
        boolean checkDiag = true;
        boolean checkAntiDiag = true;
        //check row
        for(int j=0;j<this.cols;j++)
        {
            if(playingBoard.board[row][j]!=p)
                checkRow = false;
        }
        if(checkRow)
            return checkRow;

        //check col
        for(int i=0;i<this.rows;i++)
        {
            if(playingBoard.board[i][col]!=p)
                checkCol = false;
        }
        if(checkCol)
            return checkCol;

        //check diag
        for(int i=0, j=0; i<rows;i++,j++)
        {
            if(playingBoard.board[i][j]!=p)
                checkDiag = false;
        }
        if(checkDiag)
            return checkDiag;

        //check anti-diag
        for(int i=0,j=cols -1;i<rows;i++,j--)
        {
            if(playingBoard.board[i][j]!=p)
                checkAntiDiag = false;
        }
        if( checkAntiDiag )
            return checkAntiDiag ;

        return res;
    }





}
