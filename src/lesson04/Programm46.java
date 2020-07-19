package lesson04;

public class Programm46 {
    public static void main(String[] args) {
        int a = 4; // 0000 0100
        int b = 0b11; // 3

        System.out.println("&: " + (a & b));  // only true and true returns true, otherwise false
        System.out.println("|: " + (a | b));  // true and true, true and false return true, otherwise false
        System.out.println("~a: " + (~a));    // reverse parameters 1111 1011
        System.out.println("~b: " + (~b));    // 1111 1100
        System.out.println("^: "+ (a ^ b));   // only true and false returns true, otherwise false
    }
}
