package lesson04;

public class Programm43 {
    public static void main(String[] args) {
        int a = 0, b = 5;

        a++;
        b--;
        System.out.println("a: " + a + " b: " + b);

        a = --b;
        System.out.println("a: " + a + " b: " + b);

        a = b--;
        System.out.println("a: " + a + " b: " + b);

        // For the 1 equation, programm first does --b it is called pre-decrement
        // then programm does a = b;
        // For the 2 equation, programm does a = b; then b--; it is called post-decrement
        // so that's why in result we get from 1 equation a = 3, b = 3;
        // form 2 equation a = 3; b = 2;
        // same for  pre-increment and post-increment

    }
}
