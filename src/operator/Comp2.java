package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "String1";
        String str2 = "String2";

        boolean result1 = "hello".equals("hello"); // literal Comp
        boolean result2 = str1.equals("String1"); // String var vs literal Comp
        boolean result3 = str1.equals(str2); // String vars Comp

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}
