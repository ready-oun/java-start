package overloading;
// 여기서 만약 다음 첫 번째 메서드를 삭제하면 어떻게 될까?
// int -> double 로 자동 형변환됨
public class Overloading1 {
    public static void main(String[] args) {
        // System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1, 2, 3));
    }

//    // 1st add method : 2 ints
//    public static int add(int a, int b) {
//        System.out.println("1번 호출");
//        return a + b;
//    }

    // 2nd add method : 3 double
    public static double add(double a, double b, double c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}
