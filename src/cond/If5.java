package cond;

public class If5 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10) {
            discount += 1000;
            System.out.println("10살 이하 어린이 1000원 할인");
        }

        System.out.println("총 할인 금액: " + discount + "원");
    }
}

// 온라인 쇼핑몰 할인 시스템 개발
// 한 사용자가 어떤 상품 구매 시, 다양한 할인 조건에 따라 총 할인금액 달라짐
// - 아이템 가격이 10000원 이상일 때, 1000원 할인
// - 나이가 10살 이하일 때 1000원 할인
// 한 사용자가 동시에 여러 할인을 받을 수 있다.

// 만약 `else if` 를 쓰면, 첫 번째로 충족하는 조건만 할인이 적용되고 나머지는 무시된다.
// 따라서 사용자는 나머지 할인을 놓칠 수 있다.

// 참고 - if문 {} 중괄호 생략
// if문 다음에 실행할 명령이 '하나'만 있을 경우 {} 중괄호 생략 가능 - else if, else도 마찬가지.
// 그러나 일반적으로 명령 하나만 있어도 가독성, 요지보수성 때문에 중괄호 사용하는 게 좋음.

