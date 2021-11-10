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
        //todo balance관련 로직 작성 필요
    }

    private void setBalance(int income, int expenditure) {
        this.balance += income;
        this.balance -= expenditure;
    }

    public void selectAccountBookInfo(String selectedMonth){
        System.out.println("==순번=======날짜=======내용=======수입=======지출=======");
        if (selectedMonth.equals("0")){
            for (int key :accountBookInfos.keySet()){
                AccountBookInfo accountBookInfo = accountBookInfos.get(key);
                System.out.println(key + "\t" + accountBookInfo.getDate() + "\t" + accountBookInfo.getContent()
                        + "\t" + accountBookInfo.getIncome() + "\t" + accountBookInfo.getExpenditure());
            }
        }
        for (int key :accountBookInfos.keySet()){
            if (accountBookInfos.get(key).getDate().substring(0,6).equals(selectedMonth)) {
                AccountBookInfo accountBookInfoByMonth = accountBookInfos.get(key);
                System.out.println(key + "\t" + accountBookInfoByMonth.getDate() + "\t" + accountBookInfoByMonth.getContent()
                        + "\t" + accountBookInfoByMonth.getIncome() + "\t" + accountBookInfoByMonth.getExpenditure());
            };
            //todo 선택한 월이 없을때의 예외처리
        }
    }
}
