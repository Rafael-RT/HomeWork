package lesson09;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramTask94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        String reversestring = reverse(string);

        System.out.println(reversestring);
    }

    static String reverse(String string){
        char[] str = string.toCharArray();
        char[] newchar = new char[string.length()];

        for(int i = string.length() - 1, j = 0; i >= 0; i--){
            newchar[j++] = str[i];
        }

        String newstring = new String(newchar);
        return newstring;
    }
}
