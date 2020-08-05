package lesson08;

import java.util.Scanner;

public class ProgrammTask84 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        recursion(a);
    }

    public static void recursion(int a){
        if(a < 0) {
            return;
        }
        recursion(a - 1);
        System.out.println(a);
    }

    /*
    What does recursion compare to? - cycle (for, while)

    What error can the careless use of recursion cause? - Stack overflow
     */
}
