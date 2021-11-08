package main.java.week1.day3.mission2.simplerpg;

import lombok.Getter;

@Getter
public class Bomb {
    private final int xCoordinate;
    private final int yCoordinate;

    Bomb(int xCoordinate, int yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        if (xCoordinate == 2 && yCoordinate == 2){
            throw new IllegalArgumentException("");
        }
    }
}
