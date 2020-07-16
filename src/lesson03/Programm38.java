public class Programm38 {
    public static void main(String[] args) {

        int x = 123;

        StringBuilder str = new StringBuilder();

        int x1 = x;
        while(x1 != 0)
        {
            str.append(x1 % 2);
            x1 /= 2;
        }

        str.reverse();
        System.out.println("123 in binary: " + str);

        str.delete(0, str.length());

        x1 = x;
        while(x1 != 0)
        {
            str.append(x1 % 8);
            x1 /= 8;
        }

        str.reverse();
        System.out.println("123 in octal: " + str);

        str.delete(0,str.length());

        x1 = x;

        while(x1 != 0)
        {
            if(x1 % 16 > 9)
            {
                switch (x1 % 16){
                    case 10: str.append('A'); break;
                    case 11: str.append('B'); break;
                    case 12: str.append('C'); break;
                    case 13: str.append('D'); break;
                    case 14: str.append('E'); break;
                    case 15: str.append('F'); break;
                }
            }
            else {
                str.append(x1 % 16);
            }
            x1 /= 16;
        }

        str.reverse();
        System.out.println("123 in hexademical: " + str);
    }
}
