package MultiplicationTable;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(){
        inputStartAndEnd();
    }

    private static void inputStartAndEnd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("출력할 구구단의 첫번째 단을 입력해주세요 : ");
        int startTable = scanner.nextInt();
        System.out.println("출력할 구구단의 마지막 단을 입력해주세요 : ");
        int endTable = scanner.nextInt();
    }
}
