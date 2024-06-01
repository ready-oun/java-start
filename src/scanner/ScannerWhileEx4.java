package scanner;

import java.util.Scanner;

// 상품 구매
// productName, productPrice, productQuantity, totalPrice = productPrice * productQuantity
// 1. input 2. pay 3. exit
// int option, pay -> int totalPrice = 0;
public class ScannerWhileEx4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalCost = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();

            if (option == 1) {
                input.nextLine(); // 이전에 입력된 개행문자 제거

                System.out.print("상품명을 입력하세요: ");
                String productName = input.nextLine();
                System.out.print("상품 가격을 입력하세요: ");
                int productPrice = input.nextInt();
                System.out.print("구매 수량을 입력하세요: ");
                int productQuantity = input.nextInt();

                totalCost += productPrice * productQuantity;
                System.out.println("상품명: " + productName + " 가격: " + productPrice
                        + " 수량: " + productQuantity + " 합계: " + totalCost);

            } else if (option == 2) {
                System.out.println("총 비용: " + totalCost);
                totalCost = 0; // 결제 후 총 비용 초기화

            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택하세요.");
            }


        }


    }
}
