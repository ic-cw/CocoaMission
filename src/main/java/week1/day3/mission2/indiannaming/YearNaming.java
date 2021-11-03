package main.java.week1.day3.mission2.indiannaming;

import java.util.Arrays;

public enum YearNaming {
    FIRST("1", "푸른"),
    SECOND("2", "어두운"),
    THIRD("3", "조용한"),
    FOURTH("4", "웅크린"),
    FIFTH("5", "백색"),
    SIXTH("6", "지혜로운"),
    SEVENTH("7", "용감한"),
    EIGHT("8", "날카로운"),
    NINTH("9", "욕심많은"),
    TENTH("0", "시끄러운");

    private final String yearDigit;
    private final String yearName;

    YearNaming(String yearDigit, String yearName){
        this.yearDigit = yearDigit;
        this.yearName = yearName;
    }

    public static String getYearName(String inputYear){
        String inputYearDigit = inputYear.substring(3);
        return Arrays.stream(values())
                     .filter(year -> year.yearDigit.equals(inputYearDigit))
                     .findAny()
                     .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 Year 입니다."))
                .yearName;
    }
}
