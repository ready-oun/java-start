package scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Scanner 를 사용하기 위해 new 연산자를 사용해서 Scanner를 만든다.

        System.out.println("문자열을 입력하세요.");
        String str = scanner.nextLine(); // 입력을 String으로 가져옵니다.
        System.out.println("입력한 문자열: " + str);

        System.out.println("정수를 입력하세요:");
        int intValue = scanner.nextInt(); // 입력을 int로 가져옵니다.
        System.out.println("입력한 정수: " + intValue);

        System.out.println("실수를 입력하세요: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수: " + doubleValue);


    }
}
