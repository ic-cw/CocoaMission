package main.java.week1.day3.mission2.simplerpg;

import lombok.Getter;

@Getter
public class Monster {
    private final int xCoordinate;
    private final int yCoordinate;

    Monster(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        if (xCoordinate == 2 && yCoordinate == 2) {
            throw new IllegalArgumentException("");
        }
    }
}
