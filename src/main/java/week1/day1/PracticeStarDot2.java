package main.java.week1.day1;

import java.util.Scanner;

public class PracticeStarDot2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stars = scanner.nextInt();

        for (int i = 0 ; i < stars ; i++){
            for(int j = stars ; j > 0 ; j--){
                System.out.println("*");
            }
        }
    }
}
