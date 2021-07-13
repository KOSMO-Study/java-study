package chapter_04;

public class p109_WhileExmaple1 {

    public static void main(String[] args) {

        /*
         * <반복문>
         * 
         * 자바에서 반복문의 종류에는
         * 
         * while문 
         * do-while문 
         * for문
         * 
         * 세가지 이다.
         */

        /*
         * <while문>
         * 
         * 조건식을 만족하는 동안 { } 안의 수행문을 반복해서 처리. 
         * 수행문이 하나인 경우 { } 생략 가능.
         */

        
        int num = 1;            // int형 변수 num 선언과 동시에 값 1 대입.
        int sum = 0;            // int형 변수 sum 선언과 동시에 값 0 대입.

        while (num <= 10) {     // while문에 조건식 num <= 10 부여.
            sum += num;         // sum = sum + num 수행문 수행.

                                // 0 = 0 + 1
                                // while문 한번 돌고나서 num++ => num = 1 에서 1증가.
                                // sum = 1 + 2
                                // while문 한번 돌고나서 num++ => num = 2 에서 1증가.
                                // sum = 3 + 3
                                // while문 한번 돌고나서 num++ => num = 3 에서 1증가.
                                // sum = 6 + 4
                                // while문 한번 돌고나서 num++ => num = 4 에서 1증가.
                                // sum = 10 + 5
                    
                                // ~~
                    
                                // while문 한번 돌고나서 num++ => num = 9 에서 1증가.
                                // sum = 45 + 10
                                // while문 한번 돌고나서 num++ => num = 10 에서 1증가.
                    
                                // while문 조건식 num <= 10 에 부합되지 않아서 false.
                                // 조건식이 참(true)인동안만 반복수행되기때문에.
                                // 조건식을 만족하지 않게 되어서 반복문 종료.
                                // 최종적 sum 값은 55가 대입된다.

            
            num++;              // ++가 오른쪽(피연산자 뒤)에 있을땐 문장이 끝나고 나서 num 값이 증가.
        }

        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");     // 최종적으로 while문이 끝나고난 후의 sum 값을 출력.

        
        /*
         * <while문이 무한히 반복되는 경우>
         * 
         * 필요에 따라서 while문이 무한히 반복되게 하려면 
         * 아래와 같이 해주면 된다.
         * 
         * while(true) { 
         *      수행문; 
         * }
         * 
         * 위와같이 조건식에 true를 넣어주면 조건이 
         * 항상 참이 되어서 무한반복을 하게 된다.
         */

    }

}
