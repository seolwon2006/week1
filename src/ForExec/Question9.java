package ForExec;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;

        // 나이가 0 이상일 때까지 반복
        do {
            System.out.print("나이를 입력하세요 (0 이상): ");
            age = sc.nextInt();
        } while (age < 0);

        System.out.println("입력한 나이: " + age);
    }
}
