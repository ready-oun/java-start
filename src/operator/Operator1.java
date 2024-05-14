package operator;

import java.sql.SQLOutput;

public class Operator1 {
    public static void main(String[] args) {
        // var init
        int a = 5;
        int b = 2;

        // +
        int sum = a + b;
        System.out.println("a + b = " + sum);

        // -
        int diff = a - b;
        System.out.println("a - b = " + diff);

        int multi = a * b;
        System.out.println("a * b = " + multi);

        int div = a / b;
        System.out.println("a / b = " + div);

        int mod = a % b;
        System.out.println("a % b = " + mod);
    }

}
