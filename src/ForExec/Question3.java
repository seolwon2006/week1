package ForExec;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        // do-while문으로 최소 입력 검사 (1 이상)
        do {
            System.out.print("1 이상의 숫자를 입력하세요: ");
            number = sc.nextInt();
        } while (number < 1);

        System.out.println("입력한 숫자: " + number);
    }
}
