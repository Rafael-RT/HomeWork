
public class Programm1 {
    public static void main(String[] args) {
        String hello = "Hello! My name is Rafael ", dev = "I want to be a java developer!";

        for(int i = 0 ; i < 10; i++)
        {
            if(i < 5)
                System.out.print(hello);
            else if( i == 5)
            {
                System.out.println("\n------------------------------------------");
                System.out.println(dev);
            }
            else
                System.out.println(dev);
        }
    }
}
