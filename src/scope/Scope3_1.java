package scope;
// Why Scope is required.
public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}

// > for문이 while문보다 구조적으로 깔끔한 이유
// while문은 반복문을 작성하기 전에 변수를 선언하므로 while문 밖에 있어 범위가 더 크고,
// for문은 조건문을 for문 안에서 써서 while문보다 변수 범위가 더 짧아서 범위가 더 명확해진다.

// "좋은 프로그램은 무한한 자유가 있는 게 아니라,
//  적절한 제약이 있는 것이다. 그 제약 덕분에 할 수 있는 게 더 많아진다.
//  서로 간 약속이 있기 때문에 군더더기 없이 만들기 좋다.
//  무한한 자유가 있다면 무한한 버그가 있을 뿐."