package method;
// 메서드 호출과 값 전달1
// 자바는 항상 변수의 값을 복사해서 대입한다 !!!!!!!!!!!!!!

// 변수와 값 복사
public class MethodValue0 {

    public static void main(String[] args) {
        int num1 = 5; //num1의 값은 5이다. num1(5)
        // 값을 복사해서 대입한다는 부분
        int num2 = num1; //num2 변수에 대입하기 전에 num1의 값 5를 읽는다. 결과: num1(5), num2(5)
        num2 = 10; // num2에 10을 대입한다. 결과: num1(5), num2(10)
        System.out.println("num1=" + num1); // 예상: 5
        System.out.println("num2=" + num2); // 예상: 10
    }
}
