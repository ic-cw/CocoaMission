package main.java.week1.day1.mission1;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args){
        inputStartAndEnd();
    }

    private static void inputStartAndEnd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("출력할 구구단의 첫번째 단을 입력해주세요 : ");
        int startTable = scanner.nextInt();
        System.out.print("출력할 구구단의 마지막 단을 입력해주세요 : ");
        int endTable = scanner.nextInt();
        printMultiplicationTable(startTable, endTable);
    }

    private static void printMultiplicationTable(int startTable, int endTable){
        for (int j = startTable ; j < endTable + 1 ; j++){
            System.out.println("-------" + startTable + "단----------");
            for(int i = 1 ; i < 10 ; i++) {
                System.out.println(startTable + " * " + i + " = " + startTable*i);
            }
            startTable++;
        }
    }
}
