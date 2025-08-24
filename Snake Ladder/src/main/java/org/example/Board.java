package org.example;

import java.util.Random;

public class Board {

    Cell[][] cells;
    Random random = new Random();

    Board(Integer dimension, Integer noOfSnakes, Integer noOfLadder ){
        initializeGame(dimension);
        addJumps(cells, noOfSnakes,noOfLadder);
    }
    public void initializeGame(int dimension){
        cells = new Cell[dimension][dimension];
        for(int i=0;i< dimension;i++)
        {
            for(int j=0;j<dimension;j++)
            {
                Cell obj = new Cell(null);
                cells[i][j]=obj;
            }
        }
    }

    public void addJumps(Cell[][] cells, Integer noOfSnakes, Integer noOfLadders)
    {
        while(noOfSnakes > 0 ) {
            int start = random.nextInt(cells.length * cells.length - 1);
            int end = random.nextInt(cells.length * cells.length - 1);
            if(start<end)
                continue;
            Jump snake = new Jump(start,end);
            Cell cell = getCell(start);
            cell.jump = snake;
            noOfSnakes--;
        }
        while(noOfLadders > 0)
        {
            int start = random.nextInt(cells.length * cells.length - 1);
            int end = random.nextInt(cells.length * cells.length - 1);
            if(start>end)
                continue;
            Jump ladder = new Jump(start,end);
            Cell cell = getCell(start);
            cell.jump = ladder;
            noOfLadders--;
        }
    }

    Cell getCell(int playerPosition) {
        int boardRow = playerPosition / cells.length;
        int boardColumn = (playerPosition % cells.length);
        return cells[boardRow][boardColumn];
    }


}
