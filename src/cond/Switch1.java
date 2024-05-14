package cond;

public class Switch1 {
    public static void main(String[] args) {
        // grade 1: 1000, 2: 2000, 3: 3000, 나머지: 500
        // 회원 등급에 따라 다른 쿠폰 발급
        int grade = 2;

        int coupon;
        if (grade == 1) {
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        } else if (grade == 3) {
            coupon = 3000;
        } else {
            coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}

// coupon == n 을 하면, "java: not a statement" 오류가 발생
// 할당 연산자는 단일 등호(=)이어야 하는데, 코드에서는 등호 두 개(==)를 사용해서임.
// = 등호 1개로 수정.