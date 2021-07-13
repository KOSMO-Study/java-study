package chapter_02;

public class Constant_61p {

    public static void main(String[] args) {

        /*
         * <상수 선언하기> 
         * 변수는 변하는 수 
         * 변하지 않는 수는 '상수(constant)'
         * 
         * 상수는 'final' 예약어를 사용해 선언.
         * 
         */

        
        final int MAX_NUM = 100;        // 선언과 동시에 초기화
        final int MIN_NUM;              // 변수 MIN_NUM 선언만.

        MIN_NUM = 0;                    // 사용하기전에 초기화. 초기화 하지 않으면 밑에서 오류 발생.

        System.out.println(MAX_NUM);    // 값을 출력
        System.out.println(MIN_NUM);    // 값을 출력

        
//      MAX_NUM = 1000;	
        // 오류남.
        // 상수는 값을 변경 할 수 없음. MAX_NUM은 위에서 선언과 동시에 값을 대입하여 초기화 했기 때문.

        /*
         * <리터럴>
         * 
         * 프로그램에서 사용하는 모든 숫자,문잦,논리값. 
         * '리터럴', '리터럴상수' 라고 함. 
         * 리터럴은 변수나 상수값으로 대입 가능. 
         * 리터럴은 프로그램이 시작할 때 시스템에 같이 로딩. 
         * 특정 메모리공간인 '상수풀(constant pool)'에 놓임.
         * 
         * int num = 3; 에서 값 3은 메모리공간에 존재하고, num 변수에 그 값을 복사해서 대입.
         * 
         */

    }

}
