package lesson04;

public class Programm44 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println( a < b);
        System.out.println( a >= b);
        System.out.println( a <= b);
        System.out.println( a == b);
        System.out.println( a != b);

        System.out.println("--------------------");
        a = 5;
        System.out.println( a < b);
        System.out.println( a >= b);
        System.out.println( a <= b);
        System.out.println( a == b);
        System.out.println( a != b);

        //for a = 5, 3 comparison has changed, because a equals b
        //The comparison returns boolean data type

        System.out.println("--------------------");
        // a != b return false, this is equals 0
        a = 0;
        System.out.println("a: " + a);
    }
}
