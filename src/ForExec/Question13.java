package ForExec;
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.print("암호를 입력하세요: ");
            password = scanner.nextLine();
        } while (!password.equals("1234"));

        System.out.println("접속 성공!");
        scanner.close();
    }
}
