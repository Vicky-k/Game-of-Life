package com.example.gameoflife;

public class GameOfLife {


    public static Boolean nextStateOfCell(boolean cellAlive, int numberOfLiveNeighbours) {
        if(numberOfLiveNeighbours == 2 && cellAlive == false)   {
            return false;
        }
        if(numberOfLiveNeighbours == 2 || numberOfLiveNeighbours == 3) {
            return true;
        }
        return false;
    }
}
