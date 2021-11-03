package main.java.week1.day3.Mission2_0;

import java.io.IOException;
import java.util.*;

public class RandomPick {
    public static void main(String[] args) {
        List<String> names = generateShuffledNames();
        int count = inputCount(names.size());


    }

    private static List<String> generateShuffledNames() {
        String[] name = {"Jarry", "Sonny", "Konda", "Hanse", "Teemo", "검봉", "Hanse", "반스", "Bart", "Ella", "Yan"};
        List<String> names = new ArrayList<>(Arrays.asList(name));
        Collections.shuffle(names);
        return names;
    }

    private static int inputCount(int maxValue) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇명인가요?  ");
        int countMembers = sc.nextInt();
        try{
            if (countMembers > maxValue){
                throw new IllegalArgumentException("코코아 멤버수보다 큰 수를 입력하였습니다. 10이하의 수를 입력해주세요.");
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return inputCount(maxValue);
        }
        return countMembers;
    }
}