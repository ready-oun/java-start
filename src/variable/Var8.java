package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b =  127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억)

        //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L;

        // 실수
        float f = 10.0f;
        double d = 10.0; // 여기는 d를 따로 안 붙이네?
    }
}

// boolean: true, false (1byte)
// char: 문자 하나(2byte)
// String: 문자열 표현 -> 메모리 사용량은 문자 길이에 따라 동적으로 달라짐!!

// 정수 리터럴은 int를 기본으로 사용 -> int 범위까지 표현 가능
// 숫자가 int 범위인 약 20억을 넘어가면 L을 붙여서 long으로 변경해야 함