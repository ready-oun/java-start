package array;
// 각각의 요소를 탐색한다는 의미로 for-each문

/*
for (변수 : 배열 또는 컬렉션) {
    배열 또는 컬렉션 요소를 순회하면서 수행할 작업
}
*/
public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for 문
        for(int i  = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }
        // iter
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
