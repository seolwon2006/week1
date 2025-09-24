package ForExec;
public class Question5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue; // 홀수는 건너뛰기
            }
            System.out.println(i); // 짝수만 출력
        }
    }
}
