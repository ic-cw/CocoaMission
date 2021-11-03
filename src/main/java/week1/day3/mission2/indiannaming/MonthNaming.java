package main.java.week1.day3.mission2.indiannaming;

import java.util.Arrays;

public enum MonthNaming {
    JAN("1", "늑대"),
    FEB("2", "태양"),
    MAR("3", "양"),
    APR("4", "매"),
    MAY("5", "황소"),
    JUN("6", "불꽃"),
    JUL("7", "나무"),
    AUG("8", "달빛"),
    SEP("9", "말"),
    OCT("10", "돼지"),
    NOV("11", "하늘"),
    DEC("12", "바람");

    private final String monthDigit;
    private final String monthName;

    MonthNaming(String month, String monthName){
        this.monthDigit = month;
        this.monthName = monthName;
    }

    public static String getMonthName(String inputMonth){
        return Arrays.stream(values())
                     .filter(month -> month.monthDigit.equals(inputMonth))
                     .findAny()
                     .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 Month 입니다."))
                .monthName;
    }
}
