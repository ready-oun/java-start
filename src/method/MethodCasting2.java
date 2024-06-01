package method;
// int < long < double
// 메서드를 호출할 때 매개변수에 값을 전달하는 것도 결국 변수에 값을 대입하는 것이다.
// 따라서 앞서 배운 자동 형변환이 그대로 적용된다.
// 메서드를 호출할 때는 전달하는 인수의 타입과 매개변수의 타입이 맞아야 한다.
// 단 타입이 달라도 자동 형변환이 가능한 경우에는 호출할 수 있다
public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number); // int에서 double로 자동 형변환
    }

    public static void printNumber(double n) {
        System.out.println("숫자 : " + n);
    }
}
