package chapter_04;

public class p112_DoWhileExample {

    public static void main(String[] args) {

        /*
         * <do-while문>
         * 
         * while문은 조건을 먼저 검사. 
         * 조건식에 맞지 않으면 반복수행이 한번도 일어나지 않는다.
         * 
         * do-while문은 { } 안의 문장을 무조건 한번 수행 한 후 조건식을 검사한다. 
         * { }안의 문장을 반드시 한번 이상 수행 해야 할 때
         * do-while문을 사용한다.
         */

        /*
         * <do-while문 구조>
         * 
         * do{ 
         *      수행문1; 
         *      ~ 
         * } while(조건식); 
         *      수행문2; 
         *      ~
         */

        int num = 1;            // int형 변수 num을 선언과 동시에 값 1 대입하여 초기값을 저장.
        int sum = 0;            // int형 변수 sum을 선언과 동시에 값 0 대입하여 초기값을 저장.

        do {                    // do 안의 { } 부분을 우선적으로 수행.
            sum += num;         // sum = sum + num; => sum = 0 + 1;
            num++;              // ++가 오른쪽(피연산자 뒤)에 있을땐 문장이 끝나고 나서 num 값이 증가.

        } while (num <= 10);    // do 안의 수행문이 수행되고 나서 while 안의 조건식을 검사.
                                // num <= 10 이 true 일 경우 다시 반복해서 수행.
                                // num <= 10 이 false 일 경우 반복문 종료 후 다음 수행문 수행.

        System.out.println("1부터 10까지의 합은 " + sum + " 입니다.");    // do-while 반복문이 끝난 뒤 마지막 sum 대입값을 출력.

    }

}
