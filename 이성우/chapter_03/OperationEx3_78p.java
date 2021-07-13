package chapter_03;

public class OperationEx3_78p {

    public static void main(String[] args) {

        /*
         * <관계 연산자> 76쪽
         * 
         * >, <, >=, <=, ==, !=
         * 
         * 관계연산자는 항이 두개인 이항 연산자이다. 
         * 두개의 항을 비교, 그 여부를 검사. 
         * 결과 값은 참(true), 거짓(false)로 반환된다.
         */

        /*
         * <논리연산자> 77쪽
         * 
         * &&(논리곱), ||(논리합), !(부정)
         * 
         * 두명제가 참이면 논리곱은 참이고, 
         * 두명제 중 하나만 참이면 논리 합은 참이다.
         * 
         * 참의 부정은 거짓. 
         * 거짓의 부정은 참.
         * 
         * 주로 관계연산자와 함께 사용.
         * 
         * 관계연산자의 우선순위가 논리연산자보다 높다.
         * 
         * 관계연산자의 값을 기반으로 논리 연산자의 결과값을 계산.
         */

        int num1 = 10;      // int형 변수 num1을 선언과 동시에 값 10 대입.
        int i = 2;          // int형 변수 i를 선언과 동시에 값 2를 대입.

        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);    // 논리곱에서 num1부분의 결과값 false가 value에 대입된다.
        System.out.println(value);      // 위 식의 결과값 false 출력.
        System.out.println(num1);       // num1의 결과값 20 출력.
        System.out.println(i);          // i의 결과값이 2인 이유는 앞 항의 결과 값이 거짓이므로 i항부분은 실행조차 되지 않았기 때문.

        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);    // 논리 합에서 앞 항의 결과가 참이므로 value에 true 대입.
        System.out.println(value);                                  // 위 식의 결과값 true 출력.
        System.out.println(num1);                                   // 앞선 계산에서 최종적으로 num1이 20으로 되어있기 때문에 이번식에서 num1는 30이 되어 출력된다.
        System.out.println(i);                                      // i는 논리합에서 앞항이 참이면 뒷항이 실행되지 않아 i값은 여전히 2로 출력된다.

        /*
         * 논리곱 연산과 논리 합 연산을 할 때 
         * 두항을 모두 실행하지 않더라도 결과 값을 알 수 있는 경우,
         * 
         * 나머지 항은 실행되지 않는다.
         * 
         * 이것을
         * 
         * 단락 회로 평가(Short Circuit Evaluation; SCE) 라고 한다.
         */

    }

}
