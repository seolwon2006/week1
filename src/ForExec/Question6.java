package ForExec;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1번 숫자 입력: ");
        int a = sc.nextInt();

        System.out.print("2번 숫자 입력: ");
        int b = sc.nextInt();

        // 유클리드 호제법 사용
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("최대공약수는: " + a);
    }
}
