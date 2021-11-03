package main.java.week1.day3.mission2.indiannaming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IndianNaming {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        ArrayList<String> dateOfBirth = (ArrayList<String>) inputDateOfBirth();
        printIndianName(dateOfBirth);
    }

    private static List<String > inputDateOfBirth() {
        Scanner sc = new Scanner(System.in);
        System.out.println("생년월일을 입력해 주세요.");
        String birthDay = sc.nextLine();
        String[] yearMonthDate = birthDay.split(" ");
        List<String> birthdayOfClient = new ArrayList<>(Arrays.asList(yearMonthDate));
        return birthdayOfClient;
    }

    private static void printIndianName(ArrayList<String> ymd2){
        try {
            String yearName = YearNaming.getYearName(ymd2.get(0));
            String monthName = MonthNaming.getMonthName(ymd2.get(1));
            String dateName = DateNaming.getDateName(ymd2.get(2));
            System.out.println("당신의 이름은 " + yearName + " " + monthName + dateName + "입니다.");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            run();
        }
    }
}
