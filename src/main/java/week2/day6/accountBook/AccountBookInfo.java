package main.java.week2.day6.accountBook;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountBookInfo {
    private final String date;
    private final String content;
    private final int income;
    private final int expenditure;

    public AccountBookInfo(String date, String content, int income, int expenditure){
        this.date = date;
        this.content = content;
        this.income = income;
        this.expenditure = expenditure;
    }
}
