package chapter_04;

public class p102_SwitchCase {

    public static void main(String[] args) {

        /*
         * <조건문과 조건연산자> 100쪽
         * 
         * if - else 문은 조건 연산자로도 구현 가능.
         */

        int a = 2;      // int형 변수 a 선언과 동시에 값 2 대입.
        int b = 3;      // int형 변수 b 선언과 동시에 값 3 대입.
        int max;        // int형 변수 max 선언.

        
        // if - else 문.
        if (a > b)          // 만약 a가 b보다 크면 (true)
            max = a;        // 선언된 변수 max에 a값을 대입.
        else                // 그렇지 않을경우 (false)
            max = b;        // 선언된 변수 max에 b값을 대입.

        
        
        // 조건연산자.
        max = (a > b) ? a : b;      // a값이 b보다 크다가 참일 경우. a값을 max 변수에 대입. 거짓일경우 b값을 max변수에 대입.

        System.out.println(max);    // 변수 max값을 출력.
        System.out.println("===");  // 구분선.

        
        /*
         * <switch-case문>
         * 
         * 조건이 많아지고 중괄호{ }가 많아지면 if-else 문으로 작성하기엔 가독성이 많이 떨어진다.
         * 
         * 조건식의 결과가 정수 또는 문자열 값이고, 
         * 그 값에 따라 수행되는 경우가 각각 다른 경우, 
         * switch-case문으로 구성하는것이 가독성이 좋다. 
         * switch-case문은 여러문장이 있어도 {}를 여러번 사용하지 않는다.
         */

        // if-else문 으로 작성했을 때.
        int ranking = 1;                // int형 변수 ranking 선언과 동시에 값1을 대입.
        char medalColor;                // char형 변수 medalColor 선언만 함.

        if (ranking == 1) {             // 만약 ranking변수의 값이 1과 같다면 참. 아니면 거짓.
            medalColor = 'G';           // 참일경우. medalColor 변수에 G 값을 대입하고 다음 수행문으로 넘어감.
        } 
        else if (ranking == 2) {        // 위의 값이 거짓이고, ranking변수의 값이 2와 같다면 참. 아니면 거짓.
            medalColor = 'S';           // 참일경우. medalColor 변수에 S 값을 대입하고 다음 수행문으로 넘어감.
        } 
        else if (ranking == 3) {        // 위의 값이 거짓이고, ranking변수의 값이 3과 같다면 참. 아니면 거짓.
            medalColor = 'B';           // 참일경우. medalColor 변수에 B 값을 대입하고 다음 수행문으로 넘어감.
        } 
        else {                          // 모든 조건을 만족하지 않을 경우.
            medalColor = 'A';           // medalColor 변수에 A 값을 대입하고 다음 수행문으로 넘어감.
        }

        // switch-case문 으로 작성했을 때.
        switch (ranking) {              // switch에서 ranking 변수의 값이.
        case 1 : medalColor = 'G';           // ranking 변수의 값이 1이면, 변수 medalColor에 G 대입하고,
                 break;                      // break;로 빠져나옴.
        case 2 : medalColor = 'S';           // ranking 변수의 값이 2이면, 변수 medalColor에 S 대입하고,
                 break;                      // break;로 빠져나옴.
        case 3 : medalColor = 'B';           // ranking 변수의 값이 1이면, 변수 medalColor에 B 대입하고,
                 break;                      // break;로 빠져나옴.
        default:                             // ranking값과 일치하는 case가 없다면 default 수행.
                 medalColor = 'A';           // 변수 medalColor에 A 대입.
        }
        System.out.println(ranking + "등 메달의 색깔은 " + medalColor + "입니다.");
        // switch-case문에서 대입된 값을 가진 ranking 변수와 medalColor 변수 출력.
        
        

        // break;를 써주지 않으면 case를 만족해도 빠져나오지 않고 그 다음 case로 넘어간다.

    }

}
