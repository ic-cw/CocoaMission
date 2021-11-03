package main.java.week1.day3.Mission2_0;

import java.io.IOException;
import java.util.*;

public class RandomPick {
    public static void main(String[] args) {
        List<String> names = generateShuffledNames();
        int count = inputCount();
    }

    private static List<String> generateShuffledNames() {
        String[] name = {"Jarry", "Sonny", "Konda", "Hanse", "Teemo", "검봉", "Hanse", "반스", "Bart", "Ella", "Yan"};
        List<String> names = new ArrayList<>(Arrays.asList(name));
        Collections.shuffle(names);
        return names;
    }

    private static int inputCount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇명인가요?  ");
        return sc.nextInt();
    }
}