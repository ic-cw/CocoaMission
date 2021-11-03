package main.java.week1.day3.mission2.indiannaming;

import java.util.Arrays;

public enum DateNaming {
    DATE1("1", "와(과) 함께 춤을"),
    DATE2("2", "의 기상"),
    DATE3("3", "은(는) 그림자 속에"),
    DATE4("4", ""),
    DATE5("5", ""),
    DATE6("6", ""),
    DATE7("7", "의 환생"),
    DATE8("8", "의 죽음"),
    DATE9("9", "아래에서"),
    DATE10("10", "를(을) 보라"),
    DATE11("11", "이(가) 노래하다"),
    DATE12("12", "의 그림자"),
    DATE13("13", "의 일격"),
    DATE14("14", "에게 쫓기는 남자"),
    DATE15("15", "의 행진"),
    DATE16("16", "의 왕"),
    DATE17("17", "의 유령"),
    DATE18("18", "을 죽인자"),
    DATE19("19", "는(은) 맨날 잠잔다"),
    DATE20("20", "처럼"),
    DATE21("21", "의 고향"),
    DATE22("22", "의 전사"),
    DATE23("23", "은(는) 나의 친구"),
    DATE24("24", "의 노래"),
    DATE25("25", "의 정령"),
    DATE26("26", "의 파수꾼"),
    DATE27("27", "의 악마"),
    DATE28("28", "와(과) 같은 사나이"),
    DATE29("29", "를(을) 쓰러트린자"),
    DATE30("30", "의 혼"),
    DATE31("31", "은(는) 말이없다.");

    private final String dateDigit;
    private final String dateName;

    DateNaming(String dateDigit, String dateName){
        this.dateDigit = dateDigit;
        this.dateName = dateName;
    }

    public static String getMonthName(String inputDate){
        return Arrays.stream(values())
                .filter(date -> date.dateDigit.equals(inputDate))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 Date 입니다"))
                .dateName;
    }
}
