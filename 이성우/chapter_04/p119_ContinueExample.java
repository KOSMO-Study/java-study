package chapter_04;

public class p119_ContinueExample {

    public static void main(String[] args) {

        /*
         * <continue문>
         * contunue문은 반복문과 함께 쓰인다.
         * 반복문 안에서 continue문을 만나면 이후의 문장은 수행하지 않고,
         * for문의 처음으로 돌아가 증감식을 수행한다.
         * 
         * 특정 조건에서 수행하지 않고 건너뛰어야 할때 사용.
         * 
         */
        
        int total = 0;  // int형 변수 total 선언과 동시에 값 0 대입.
        int num;        // int형 변수 num 선언만 함.
        
        for(num = 1; num <= 100; num++) {       // for 반복문에서 선언된 변수 num에 값 1을 대입하여 초기화,
                                                // 조건식 num <= 100 에서 num값은 1이므로 참.
                                                // 조건식에서 참으로 판정되어 다음수행문 수행.
            
            if(num % 2 == 0)                    // if문에서 변수 num에 % 2 연산을 하여 나머지가 0일 경우 참. 이외에는 거짓.
                                                // 다르게 말하면 num값이 짝수인 경우를 찾는다.
                                                // num값이 1이므로 %2를 해주었을 때 나머지 값은 1이다. 거짓. 
                                                // 조건식에서 거짓이므로 조건식 안의 수행문을 수행하지 않고 다음수행문 수행.
                
                continue;                       // 짝수인 경우. 다음 수행문을 수행하지않고 num++로 바로 수행.
            
            total += num;                       // if문에서 false가 되어 넘어온 변수 num 값 1을 연산한다.
                                                // total = total + num // total = 0 + 1
                                                // continue문 때문에 짝수는 걸러지고 홀수만 들어온다.
                            
                                                // 다시 올라가 증감식 num++ 수행하여 값이 2가 된다. 
                                                // 다시 for반복문 조건식 num <= 100 을 검사했을 때 num 값은 2이므로 참. 다음 수행문 수행.
                                                // if문에서 값이 2인 변수 num 에 %2 연산결과 나머지가 0이되어 참.
                                                // 조건식이 참인결과로 수행문 continue를 수행. 
                                                // 다음수행문인 total += num;을 수행하지않고 다시 for반복문의 증감식 num++ 를 수행한다. 
      
        }
        System.out.println("1부터 100까지의 홀수의 합은: " + total + " 입니다.");
        // 최종적으로 for반복문의 조건식에서 num값이 100을 넘는순간 반복문은 종료가 되며 
        // 1부터 100까지의 홀후의 합 결과가 출력된다.
    }

}
