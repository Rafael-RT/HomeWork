package lesson06;

import java.util.Arrays;

public class ProgrammTask61 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for(int i = 0; i < array.length;)
        {
            array[i] = ++i;
        }

        System.out.println(Arrays.toString(array));
    }
}
