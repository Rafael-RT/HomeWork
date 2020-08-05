package lesson08;

import java.util.Scanner;

public class ProgrammTask82 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = s.nextInt();
        boolean b = method1(a);
        System.out.println(b);

        System.out.println("------------------------");
        String string = method2(b);
        System.out.println(string);

        System.out.println("------------------------");
        String string1 = method3(string,a);
        System.out.println(string1);

    }

    public static boolean method1(int a){
        if(a > 0){
            return true;
        }
        else
            return false;
    }

    public static String method2(boolean a){
        if (a)
            return "number is greater than zero";
        else
            return "number is zero or less";
    }

    public static String method3(String string, int a){
        String s = string + " and equals to " + Integer.toString(a);
        return s;
    }
}
