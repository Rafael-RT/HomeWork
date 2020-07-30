package lesson07;

import java.util.Scanner;

public class ProgrammTask72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("Output");
        for (int i = 1; i * i <= num; i++)
        {
                System.out.print(i*i + " ");
        }
    }
}
