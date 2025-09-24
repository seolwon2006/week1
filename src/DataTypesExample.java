public class DataTypesExample {
    public static void main(String[] args) {
        int x = 10;
        int y = x;
        y = 20;

        String a = "hello";
        String b = a;
        b = "world";

        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        arr2[0] = 100;

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("arr1[0]: " + arr1[0]);

        int age = 25;
        String name = "MinQ";
    }
}