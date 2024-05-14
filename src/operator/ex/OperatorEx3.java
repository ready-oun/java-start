package operator.ex;

public class OperatorEx3 {
    public static void main(String[] args) {
        // int형 변수 score를 선언하세요.
        // score가 80점 이상이고, 100점 이하이면 true, 아니면 false를 출력
        int score = 80;
        boolean result = score >= 80 && score <= 100;
        System.out.println(result);
    }
}

// <= 는 등호가 뒤에 와야 하네용 =< 해버리면 바~로 컴파일 오류 뜸!!