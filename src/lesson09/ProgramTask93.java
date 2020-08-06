package lesson09;

import java.util.Scanner;

public class ProgramTask93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s;
        do{
            System.out.println("Enter 2 words consisting of an even number of letters");
            s = scanner.nextLine();
        }
        while(s.length() % 2 != 1 );

        String s2;
        int index = s.indexOf(" ");
        s2 = s.substring(0, index / 2);
        s2 += s.substring((s.length() + index + 1) / 2);

        System.out.println(s2);
    }
}
