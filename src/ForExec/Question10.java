package ForExec;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n 값을 입력하세요: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; ; i++) {
            sum += i;

            if (i >= n) {
                if (n >= 100) {
                    System.out.println("1부터 " + n + "까지의 합: " + sum);
                } else {
                    System.out.println("입력한 값이 100보다 작아서 합을 출력하지 않습니다.");
                }
                break;
            }
        }
    }
}
