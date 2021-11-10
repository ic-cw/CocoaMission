package main.java.week2.day6.accountBook;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

@Getter
public class AccountBookInfos {
    private static final AccountBookInfos instance = new AccountBookInfos();
    private final Map<Integer, AccountBookInfo> accountBookInfos = new HashMap<>();
    private int order = 0;
    private int balance = 0;

    private AccountBookInfos() {
    }

    public static AccountBookInfos getInstance() {
        return instance;
    }

    public void addAccountBookInfo(AccountBookInfo accountBookInfo) {
        this.accountBookInfos.put(++order, accountBookInfo);
        setBalance(accountBookInfo.getIncome(), accountBookInfo.getExpenditure());
    }

    public void deleteAccountBookInfo(int deleteOrder) {
        accountBookInfos.remove(deleteOrder);
    }

    public void updateAccountBookInfo(int updateOrder, AccountBookInfo updatedAccountBookInfo){
        accountBookInfos.replace(updateOrder, updatedAccountBookInfo);
    }

    private void setBalance(int income, int expenditure) {
        this.balance += income;
        this.balance -= expenditure;
    }
}
