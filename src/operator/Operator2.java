package operator;

public class Operator2 {
    public static void main(String[] args) {

        // String + String 1
        String result1 = "hello" + "world";
        System.out.println(result1);

        // String + String 2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // String + num 1
        String result3 = "a + b = " + 10; // int -> String 숫자를 문자열로 변경
        System.out.println(result3); // String + String

        // String + num 2
        int num = 20; // 변수에 담아도 문자와 숫자를 더하면 문자가 됨; num 변수에서 값 조회하고 숫자를 문자열로 변경
        String str = "a + b = ";
        String result4 = str + num; // 문자열 + 문자열
        System.out.println(result4);
    }
}
