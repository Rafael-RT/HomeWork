package lesson04;

public class Programm45 {
    public static void main(String[] args) {
        boolean bOne = true;
        boolean bTwo = false;

        System.out.println("&&: " + (bOne && bTwo));
        System.out.println("||: " + (bOne || bTwo));
        System.out.println("!bOne: " + (!bOne));
        System.out.println("!bTwo: " + (!bTwo));
        System.out.println("^: " + (bOne ^ bTwo));
        System.out.println("&: " + (bOne & bTwo));
        System.out.println("|: " + (bOne | bTwo));

        bTwo = true;
        System.out.println("__________________");
        System.out.println("&&: " + (bOne && bTwo));
        System.out.println("||: " + (bOne || bTwo));
        System.out.println("!bOne: " + (!bOne));
        System.out.println("!bTwo: " + (!bTwo));
        System.out.println("^: " + (bOne ^ bTwo));
        System.out.println("&: " + (bOne & bTwo));
        System.out.println("|: " + (bOne | bTwo));

        /*
        a. true || false       | true
        b. false && true       | false
        c. !true || 1 >= 0     | true
        d. false && 5          | non valid
        e. true &&! false      | true
        f. true ^! true        | false
        i. 1> = 1 || false     | true
        g. true && 5 - 5       | non valid
        */

        // Logical operations return boolean data type.
        // Operation NOT(!) is unary operation
        // Shorthand operation like && and ||, check while we get clear result.
        // When we get only one false in the && operation, we get result false
        // and don't check other parameters, in & operation we check all parameters
        // then we get result. The same for the | and ||.

    }
}
