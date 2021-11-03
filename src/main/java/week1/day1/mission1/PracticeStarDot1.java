package main.java.week1.day1.mission1;

import java.util.Scanner;

public class PracticeStarDot1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int starCount = scanner.nextInt();
        for (int i = 0 ; i < starCount ; i++){
            for (int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
