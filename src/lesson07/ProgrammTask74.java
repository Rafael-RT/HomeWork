package lesson07;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ProgrammTask74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base;
        do{
            System.out.println("Enter odd the number of base");
            base = scanner.nextInt();
        }
        while (base % 2 == 0);



        for(int i = 0, t = 0; i < base; i+=2)
        {
            for (int j = t; j < base / 2; j++){
                System.out.print(" ");
            }
            t++;

            int k = i + 1;
            while(k != 0){
                System.out.print("*");
                k--;
            }
            System.out.println();
        }

    }
}
