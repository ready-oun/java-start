package scanner;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단 단 수를 입력해주세요: ");
        int num = scanner.nextInt();

        System.out.println(num + "단의 구구단: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(num + " X " + i + "= " + num * i);
        }
    }
}