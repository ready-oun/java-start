package scanner;

import java.util.Scanner;

// 사용자로부터 두 개의 정수를 입력받고,
// 이 두 정수 사이의 모든 정수를 출력하는 프로그램을 작성하세요.
public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요:");
        int num1 = input.nextInt();
        System.out.print("두 번째 숫자를 입력하세요:");
        int num2 = input.nextInt();

        if (num1 > num2) {
           int temp = num1;
           num1 = num2;
           num2 = temp;
        }

        System.out.print("두 수자 사이의 모든 정수: ");
        for (int i = num1 + 1; i < num2; i++) {
            System.out.print(i);
            if (i != num2 - 1) {
                System.out.print(", ");
            }

        }
    }
}