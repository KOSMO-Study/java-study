package chapter_03;

public class OperationEx4_81p {

    public static void main(String[] args) {

        /*
         * <복합대입연산자> 80쪽
         * 
         * 연산자 종류 80쪽 참고.
         */

        /*
         * <조건 연산자> 81쪽
         * 
         * 조건 연산자는 삼항연산자이다.
         * 
         * 주어진 조건식이 참인경우, 거짓인 경우에 따라 다른 결과값이 나온다.
         * 
         * (조건식 ? 결과1 : 결과2;) 
         * 조건식이 참이면 결과1. 
         * 조건식이 거짓이면 결과2 선택됨.
         * 
         * ex) int num = (5 > 3) ? 10 : 20; 
         * 위의 조건식이 참이여서 num값은 10이 된다.
         * 
         */

        int fatherAge = 45;                 // int형 변수 fatherAge 선언하고 값 45 대입.
        int motherAge = 47;                 // int형 변수 motherAge 선언하고 값 47 대입.

        char ch;                                    // char형 변수 ch 선언.
        ch = (fatherAge > motherAge) ? 'T' : 'F';   // 조건식에서 fatherAge 가 motherAge 보다 크다는 조건에서 거짓이므로. 'F'가 ch에 대입.

        System.out.println(ch);                     // ch에 대입된 결과값 'F' 출력.

    }

}
