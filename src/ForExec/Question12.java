package ForExec;
import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; // 1 이하의 수는 소수가 아님
        } else {
            int i = 2;
            while (i <= number / 2) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }

        if (isPrime) {
            System.out.println(number + "는 소수입니다.");
        } else {
            System.out.println(number + "는 소수가 아닙니다.");
        }

        scanner.close();
    }
}
