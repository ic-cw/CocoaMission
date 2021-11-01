package main.java.Day1;

import java.util.Scanner;

public class PracticeQuadrant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xCoordinate = scanner.nextInt();
        int yCoordinate = scanner.nextInt();

        if (xCoordinate > 0){
            if (yCoordinate > 0){
                System.out.println("1");
            }else {
                System.out.println("4");
            }
        }else if(yCoordinate > 0){
            System.out.println("2");
        }else {
            System.out.println("3");
        }
    }
}
