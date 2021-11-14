package main.java.week2.day6.accountBook;

import java.util.List;

import lombok.Getter;

@Getter
public class AccountBookInfo {
    private final String date;
    private final List<String> content;
    private final int income;
    private final int expenditure;

    public AccountBookInfo(String date, List<String> content, int income, int expenditure){
        this.date = date;
        this.content = content;
        this.income = income;
        this.expenditure = expenditure;
    }
}
