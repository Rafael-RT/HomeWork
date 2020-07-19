package lesson04;

public class Programm47 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a: " + a);

        a = a << 1;
        System.out.println("a: " + a);

        a = a >> 2;
        System.out.println("a: " + a);

        a = -5;
        a = a >>> 1;
        System.out.println("a: " + a);

        // Unsigned operators add 0 in the begin, if we use >>>
        // For ex:  -5 = 1111 1001, if the first number equals 1 it will be negative number
        // after ">>> 1" we get 0111 1100, first number 0, so number is positive
        // in case ">> 1" it would be 1111 1100
        // operator ">>" saves the sign of number
    }
}
