package main.java.week1.day1.mission1;

import java.util.Scanner;

public class PracticeAlarmClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        if (minute >= 45){
            minute = minute - 45;
            System.out.println(hour);
            System.out.println(minute);
        } else {
            if (hour == 0){
                hour = 23;
                minute = minute + 15;
                System.out.println(hour);
                System.out.println(minute);
            }else{
                hour -= 1;
                minute = minute + 15;
                System.out.println(hour);
                System.out.println(minute);
            }
        }
    }
}
