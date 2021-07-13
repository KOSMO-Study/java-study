package chapter_03;

public class OperationEx1_74p {

    public static void main(String[] args) {

        /*
         * <항과 연산자> 71쪽
         * 
         * 연산에 사용하는 기호를 연산자(operator)라고 한다.
         * 
         * 연산자는 항의 개수에 따라 
         * `단항연산자`, `이항연산자`, `삼항연산자` 로 나뉨
         * 
         * 우선순위는 단항연산자가 가장 높고, 단항->이항->삼항 순서이다.
         */

        /*
         * <대입연산자>
         * 
         * 변수에 값을 대입. 
         * 대입연산자는 이항 연산자 중 우선순위가 가장 낮다. 
         * 모든 연산을 다 끝낸 후 마지막에 연산결과를 변수에 대입하는 역할.
         * 
         * int age = 24; // age 변수에 값 24를 대입함.
         * 
         */

        /*
         * <부호연산자> 72쪽
         * 
         * +,- 두가지가 있다. 
         * 부호를 뜻하며 단항연산자로 사용.
         */

        int num = 10;               // int형 변수 num을 선언하고 10을 대입.

        System.out.println(+num);   // 값 10이 그대로 출력.
        System.out.println(-num);   // 값 10에 -가 들어가서 -10 출력. 그러나, num값이 바뀐것은 아님.
        System.out.println(num);    // 값 10이 그대로 출력.
        System.out.println("===="); // 구분선.

        num = -num;                 // num값을 음수로 바꾸어 다시 num값에 대입함.
        System.out.println(num);    // num값이 음수로 나옴. -10 출력.
        System.out.println("===="); // 구분선.

        /*
         * <산술연산자> 73쪽
         * 
         * 덧셈(+) 
         * 뺄셈(-) 
         * 곱셈(*) 
         * 나눗셈(/) 
         * 나머지(%) -- 나머지(%) 구하는 연산자 활용 예시 73쪽 읽어보기.
         * 
         * 산술연산자 우선순위. = 일반수학산술연산과 같다.
         */

        int mathScore = 90;          // int형 mathScore 변수 선언, 값 90을 대입.
        int engScore = 70;           // int형 engScore 변수 선언, 값 70을 대입.

        int totalScore = mathScore + engScore;      // mathScore 값과 engScore값을 더하고, totalScore 변수에 대입.
        System.out.println(totalScore);             // totalScore 출력.

        double avgScore = totalScore / 2.0;         // totalScore값에 2.0을 나누어 준 후. 선언된 double형 변수 avgScore에 연산 값을 대입.
        System.out.println(avgScore);               // avgScore 출력.

    }

}
