package lesson07;

public class ProgrammTask77 {
    public static void main(String[] args) {
        int xyz = 10000000;
        int plus = 14;
        int minus = 8;
        int different = plus - minus;


        for(int i = 0 ; i < 10; i++){

            int add = (xyz / 1000) * different;

            xyz += add;
        }

        System.out.println("Population after 10 years " + xyz);
    }
}
