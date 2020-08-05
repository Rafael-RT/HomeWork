package lesson08;

public class ProgrammTask83 {
    public static void main(String[] args) {

        System.out.println(method(2));
        System.out.println(method(2, 3));
        System.out.println(method(2.0, 3));
        System.out.println(method(2.0, 3.0));

        int[] a = {1,2,3,4,5,6,7};
        System.out.println(method(a));

    }

    public static int method(int a){
        return a*a;
    }

    public static int method(int a, int b){
        return a*b;
    }

    public static double method(double a, int b){
        return a*b;
    }

    public static double method(double a, double b){
        return a*b;
    }

    public static int method(int[] a){
        int multi = 1;
        for(int i: a){
            multi *= i;
        }
        return multi;
    }

    /*
    What is method overloading?
    Two or more than two methods having the same name and return data type
    but different number and data type of parameters called method overloading

    How to overload a method?
    Write 2 or more method that have the same name and return data type
    but different number and data type parameters


There is a method:

   public static double sum(int a, double b) {
      ...
   }

Is this a method overload? - not overload

   public static void sum(int a, double b) {
      ...
   }


And this? - overload

   public static double sum(double a, int b) {
      ...
   }
     */

}
