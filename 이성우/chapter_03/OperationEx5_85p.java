package chapter_03;

public class OperationEx5_85p {

    public static void main(String[] args) {

        /*
         * <비트연산자> 83쪽
         * 
         * 변수나 상수에 대한 연산과 다른 비트값을 기반으로 하는 연산자
         * 
         * 암호화 작업처럼 임의의 숫자를 만들거나 특정비트를 꺼내보는 경우 사용.
         * 
         */

        /*
         * <비트 논리 연산자>
         * 
         * 비트단위로 &, |, ^, ~ 연산.
         */

        int num1 = 5;           // int형 변수 num1 선언과 동시에 값 5를 대입.
        int num2 = 10;          // int형 변수 num2 선언과 동시에 값 10을 대입.
        int result = num1 & num2;       // num1과 num2 & 비트연산후 선언된 int형 변수 result에 결과값 대입.
        System.out.println(result);     // result 변수 출력. 5와 10을 &연산하면 결과값 0 이 나온다.
        System.out.println("====");     // 구분선 출력.

        // 나머지 연산자는 책 84쪽 참고.

        
        int num = 0B00000101;           // 5를 8비트 2진수로 나타냄.

        System.out.println(num << 2);   // 왼쪽으로 2비트 이동   00010100(20)
        System.out.println(num >> 2);   // 오른쪽으로 2비트 이동 00000001(1)
        System.out.println(num >>> 2);  // 오른쪽으로 2비트 이동 왼쪽 채워지는 값은 무조건 0 //00000001(1)

        System.out.println(num);        // num에 직접적으로 값을 대입하지 않았으므로 int num = 0B00000101; 츌력됨.

        num = num << 2;                 // num변수에 왼쪽으로 2비트 이동한 값을 대입.

        System.out.println(num);        // 대입된 값 왼쪽으로 2비트 이동 00010100(20) 출력됨.

        /*
         * <연산자 우선순위>
         * 
         * 단항연산자가 가장 높다. 그다음은 이항, 삼항.
         * 
         * 대입연산자의 순위가 가장 낮다.
         * 
         * 산술 => 관계 => 논리 => 대입
         * 
         * 우선순위 표 참고. 책 87쪽.
         */

    }

}
