package main.java.week2.day6.accountBook;

import lombok.Getter;

@Getter
public class AccountBookInfo {
    private String date;
    private String content;
    private String income;
    private String expenditure;
    private String balance;

    public AccountBookInfo(String date, String content, String income, String expenditure, String balance){
        this.date = date;
        this.content = content;
        this.income = income;
        this.expenditure = expenditure;
        this.balance = balance;
    }
}
