package lesson05;

public class Programm53 {
    public static void main(String[] args) {
        int a = 34;
        int b = 2;
        int c = 78;

        if(a > b && a > c) {
            System.out.println("a is the biggest number");

            if(b > c)
                System.out.println("c is the smallest number");
            else
                System.out.println("b is the smallest number");
        }
        else if(b > a && b > c) {
            System.out.println("b is the biggest number");

            if(a > c)
                System.out.println("c is the smallest number");
            else
                System.out.println("a is the smallest number");
        }
        else {
            System.out.println("c is the biggest number");

            if (b > a)
                System.out.println("a is the smallest number");
            else
                System.out.println("b is the smallest number");
        }

    }
}
