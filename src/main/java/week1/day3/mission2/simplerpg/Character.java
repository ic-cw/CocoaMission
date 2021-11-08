package main.java.week1.day3.mission2.simplerpg;

import lombok.Getter;

@Getter
public class Character {
    private final int xCoordinate;
    private final int yCoordinate;

    Character(int xCoordinate, int yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public void move(){

    }
}
