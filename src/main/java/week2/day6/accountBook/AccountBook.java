package main.java.week2.day6.accountBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//키보드를 통해 데이터 입력을 받고 화면에 내용을 출력한다.
//사용자 등록: 사용자 이름 및 비밀번호를 입력받는다.
//데이터 입력: 날짜, 적요, 수입, 지출을 입력받는다.
//데이터 삭제: 특정 순번의 데이터를 삭제한다.
//데이터 수정: 특정 순번의 데이터를 수정할 수 있다.
//화면에 출력: 해당 월의 지출내역을 순번, 적요, 수입, 지출, 잔액으로 화면에 출력한다.
public class AccountBook {
    public static void main(String[] args) {
        AccountBook accountBook = new AccountBook();
        accountBook.run();
    }

    private void run() {
        registerUser();
        AccountBookInfos accountBookInfos = AccountBookInfos.getInstance();
        int todo = selectWhatToDo();
        handleAccountBook(accountBookInfos, todo);
        //스위치문 이후 다시 입력받는 로직 필요(재귀 사용)
    }

    private void handleAccountBook(AccountBookInfos accountBookInfos, int todo) {
        switch (todo){
            case 1 :
                System.out.println("가계부 입력을 선택하셨습니다.");
                System.out.println("날짜, 적요(내용), 수입, 지출을 띄어쓰기로 구분하여 입력해주세요");
                List<String> inputDaily = input();
                //적요(내용)가 띄어쓰기로 구분되지 않을 때의 로직
                AccountBookInfo accountBookInfo = new AccountBookInfo(inputDaily.get(0), inputDaily.get(1), Integer.parseInt(inputDaily.get(2)),
                        Integer.parseInt(inputDaily.get(3)));
                accountBookInfos.addAccountBookInfo(accountBookInfo);
                System.out.println("순번 : " + accountBookInfos.getOrder() + ", 날짜 : " + accountBookInfo.getDate() + ", 적요(내용) : " +
                        accountBookInfo.getContent() + ", 수입 : " + accountBookInfo.getIncome() + ", 지출 : " + accountBookInfo.getExpenditure() +
                        " 잔액 : " + accountBookInfos.getBalance());
                System.out.println("가계부 입력이 완료되었습니다.");
                handleAccountBook(accountBookInfos, selectWhatToDo());
                break;
            case 2 :
                System.out.println("가계부 삭제를 선택하셨습니다.");
                System.out.println("삭제하실 가계부의 순번을 입력해주세요.");
                int deleteOrder = Integer.parseInt(input().get(0));
                accountBookInfos.deleteAccountBookInfo(deleteOrder);
                System.out.println(deleteOrder + "번째의 자료가 삭제되었습니다.");
                handleAccountBook(accountBookInfos, selectWhatToDo());
                break;
            case 3 :
                System.out.println("가계부 수정을 선택하셨습니다.");
                System.out.println("수정을 원하시는 가계부의 순번을 입력해주세요.");
                handleAccountBook(accountBookInfos, selectWhatToDo());
                break;
            case 4 :
                System.out.println("가계부 조회를 선택하셨습니다.");

                handleAccountBook(accountBookInfos, selectWhatToDo());
                break;
            case 5 :
                System.out.println("가계부 서비스를 종료합니다.");
                System.exit(0);
        }
    }

    private void registerUser() {
        System.out.println("사용자 등록을 위해 이름과 비밀번호를 띄어쓰기로 구분하여 입력해주세요.");
        List<String> userEnrollment = input();
        User user = new User(userEnrollment.get(0), userEnrollment.get(1));
        System.out.println("환영합니다 " + user.getName() + "님 ^^");
    }

    private int selectWhatToDo() {
        System.out.println("가계부를 입력, 삭제, 수정, 조회할 수 있습니다.");
        System.out.println("가계부 입력을 원하시면 1 을");
        System.out.println("가계부 삭제를 원하시면 2 을");
        System.out.println("가계부 수정을 원하시면 3 을");
        System.out.println("가계부 조회를 원하시면 4 를 눌러주세요.");
        System.out.println("가계부 서비스를 종료하려면 5 를 눌러주세요");
        return Integer.parseInt(input().get(0));
    }

    private List<String> input() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            List<String> input = new ArrayList<>();
            while (st.hasMoreTokens()){
                input.add(st.nextToken());
            }
            return input;
        } catch(IOException e){
            System.out.println("잘못된 입력입니다.");
            return input();
        }
    }
}
