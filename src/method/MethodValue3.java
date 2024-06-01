package method;

public class MethodValue3 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1: " + num1); // 출력 5
        //호출 시작:changeNumber()
        num1 = changeNumber(num1); //반환 결과가 10이다.
        System.out.println("changeNumber 호출 후, num1: " + num1); // 출력 10
    }

    public static int changeNumber(int num2) {
        num2 = num2 * 2; //계산 결과: num1(5), num2(10)
        return num2; // num2의 값은 10이다.
    }
}

// 꼭 기억하자! 자바는 항상 변수의 값을 복사해서 대입한다.