package method;

public class MethodValue1 {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1); // 5
        changeNumber(num1); // 호출 = `num1` 값 5을 읽고 복사해서 `num2`에 전달 -> 이 부분이 핵심!!!!
        System.out.println("4. changeNumber 호출 후, num1: " + num1); // 10 => 왜 5죠?
        // 아..  ;; 아 그치.. ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
        // 그냥 저건 num1 호출만 한 거고;; int num2 = changeNumber(num1); 했을 때 num2를 출력했음 10이겠지.
        // `num2`의 변경은 `num1`에 영향주지 않음. 앞서 값을 복사해서 전달했기 때문.
    }
    public static void changeNumber(int num2) {
        System.out.println("2. changeNumber 변경 전, num2: " + num2); // 실행 시작할 때 5임 !!
        num2 = num2 * 2; // 5 * 2
        System.out.println("3. changeNumber 변경 후, num2: " + num2); // 10
    }
}

