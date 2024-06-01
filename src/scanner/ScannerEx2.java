package scanner;
// 사용자로부터 하나의 정수를 입력받고, 이 정수가 홀수인지 짝수인지 판별하는 프로그램을 작성하세요.
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요: ");
        int num = input.nextInt();
        String result = "";

        if (num % 2 == 0) {
            result = "짝수";
        } else {
            result = "홀수";
        }
        System.out.print("입력한 숫자 " + num + "은 " + result + "입니다.");
    }
}
