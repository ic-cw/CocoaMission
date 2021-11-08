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
    public static void main(String[] args) throws IOException {
        AccountBook accountBook = new AccountBook();
        accountBook.run();
    }

    private void run() throws IOException {
        System.out.println("사용자 등록을 위해 이름과 비밀번호를 띄어쓰기로 구분하여 입력해주세요.");
        //try catch 해야하나?
        List<String> userEnrollment = input();
        //이부분 로직 수정해야할지도?
        User user = new User(userEnrollment.get(0), userEnrollment.get(1));
        System.out.println("환영합니다 " + user.getName() + "님 ^^");
        int todo = selectWhatToDo();
        System.out.println(todo);
    }

    private int selectWhatToDo() throws IOException {
        System.out.println("가계부를 입력, 삭제, 수정, 조회할 수 있습니다.");
        System.out.println("가계부 입력을 원하시면 1 을");
        System.out.println("가계부 삭제를 원하시면 2 을");
        System.out.println("가계부 수정을 원하시면 3 을");
        System.out.println("가계부 조회를 원하시면 4 를 눌러주세요.");
        int todo = Integer.parseInt(input().get(0));
        return todo;
    }

    private List<String> input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        List<String> input = new ArrayList<>();
        while (st.hasMoreTokens()){
            input.add(st.nextToken());
        }
        return input;
    }
}
