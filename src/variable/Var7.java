package variable;

public class Var7 {
    public static void main(String[] args) {
        int a = 100;
        double b = 10.5;
        boolean c = true;
        char d = 'A'; // 문자 하나
        String e = "Hello Java"; // 문자열, 문자열 다루기 위한 특별한 타입

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}

// 각 변수는 지정한 타입에 맞는 값을 사용해야 한다. 그렇지 않으면 컴파일 오류 발생함
// 코드에서 개발자가 직접 적은 `100` , `10.5` , `true` , `'A'` , `"Hello Java"` 와 같은 고정된 값을 프로그래밍 용어로 리터럴(literal)이라 한다.