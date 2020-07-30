package lesson07;

public class ProgrammTask73 {
    public static void main(String[] args) {
        int[] array = {10, 20, 15, 17, 24, 35};
        int mul = 1;

        for (int i : array)
        {
            mul *= i;
        }
        System.out.println(mul);
    }
}
