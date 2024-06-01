package scope;

public class Scope2 {

    public static void main(String[] args) {
        int m = 10; // m scope
        for (int i = 0; i < 2; i++) { // i scope
            System.out.println("for m = " + m);
            System.out.println("for i = " + i);
        } // i scope
        System.out.println("for m = " + m);
//        System.out.println("for i = " + i);
    } // m scope

}
