package ForExec;
public class Question4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("현재 숫자: " + i);

            if (i == 50) {
                System.out.println("숫자 50을 찾았습니다. 반복을 종료합니다.");
                break; // 숫자 50을 찾으면 반복 종료
            }
        }
    }
}
