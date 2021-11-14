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

    private void setBalance(int income, int expenditure) {
        this.balance += income;
        this.balance -= expenditure;
    }
    public void deleteAccountBookInfo(int deleteOrder) {
        accountBookInfos.remove(deleteOrder);
    }

    public void updateAccountBookInfo(int updateOrder, AccountBookInfo updatedAccountBookInfo){
        int beforeIncome = this.accountBookInfos.get(updateOrder).getIncome();
        int beforeExpenditure = this.accountBookInfos.get(updateOrder).getExpenditure();
        accountBookInfos.replace(updateOrder, updatedAccountBookInfo);
        //todo bugfix 계산로직 다시 생각해보기
        setBalance(beforeIncome + updatedAccountBookInfo.getIncome(), beforeExpenditure + updatedAccountBookInfo.getExpenditure());
    }


    public void selectAccountBookInfo(String selectedMonth){
        System.out.println("순번====날짜=======수입/지출=============내용==============");
        if (selectedMonth.equals("0")){
            for (int key :accountBookInfos.keySet()){
                AccountBookInfo accountBookInfo = accountBookInfos.get(key);
                System.out.println(key + "\t" + accountBookInfo.getDate() + "\t" + accountBookInfo.getIncome()
                        + "/\t" + accountBookInfo.getExpenditure() + "\t\t" + String.join(" ", accountBookInfo.getContent()));
            }
        }
        for (int key :accountBookInfos.keySet()){
            if (accountBookInfos.get(key).getDate().substring(0,7).equals(selectedMonth)) {
                AccountBookInfo accountBookInfoByMonth = accountBookInfos.get(key);
                System.out.println(key + "\t" + accountBookInfoByMonth.getDate() + "\t" + accountBookInfoByMonth.getIncome()
                        + "\t" + accountBookInfoByMonth.getExpenditure() + "\t\t" + String.join(" ", accountBookInfoByMonth.getContent()));
            };
            //todo 선택한 월이 없을때의 예외처리
        }
        System.out.println("============================현재 잔액 " + this.balance + "============");
    }
}
