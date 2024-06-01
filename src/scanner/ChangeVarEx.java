package scanner;
// 변수 값 교환
public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

//        temp = 20;
//        a = temp;
//        temp = 10;
//        b = temp;

        temp = a; // a = b 전에 a의 값을 temp에 보관.
        a = b; // a의 값인 10은 사라져 버린다. 둘다 20이 되어버린다.
        b = temp;



        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
