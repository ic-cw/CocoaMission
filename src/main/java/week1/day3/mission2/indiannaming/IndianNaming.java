package main.java.week1.day3.mission2.indiannaming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IndianNaming {
    public static void main(String[] args) {
        ArrayList<String> ymd2 = (ArrayList<String>) inputDateOfBirth();
    }

    private static List<String > inputDateOfBirth() {
        Scanner sc = new Scanner(System.in);
        System.out.println("생년월일을 입력해 주세요.");
        String birthDay = sc.nextLine();
        String[] yearMonthDate = birthDay.split(" ");
        List<String> ymd = new ArrayList<>(Arrays.asList(yearMonthDate));
        return ymd;
    }
}
