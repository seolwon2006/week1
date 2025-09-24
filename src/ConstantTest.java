public class ConstantTest {
    public static void main(String[] args) {
        int temperature = 20;
        final int FREEZING_POINT = 0;

        temperature = 25;  // 'temperature' 변수의 값을 25로 변경
        System.out.println("Current temperature: " + temperature);

        // 상수 값 변경
        FREEZING_POINT = 10;  // 이 코드는 컴파일 오류를 발생시킵니다.

        System.out.println("Freezing point of water: " + FREEZING_POINT);
    }
}