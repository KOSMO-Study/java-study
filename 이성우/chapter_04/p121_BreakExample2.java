package chapter_04;

public class p121_BreakExample2 {

    public static void main(String[] args) {

        /*
         * <break문>
         * 
         * switch-case문에서 조건을 만족하면 다른조건을 비교하지 않고 빠져나오도록했었다.
         * 
         * 반복문에서도 break를 사용하면,
         * 그 지점에서 더이상 수행문을 반복하지 않고 반복문을 빠져나온다.
         * 
         * [추가]
         * 반복문이 중첩된 경우 
         * break문을 사용하면 
         * 모든 반복문을 빠져나오는것이 아닌,
         * break문을 감싸고 있는 반복문만 빠져나온다.
         * 
         * <반복문안의 break문은 해당 반복문 수행만 중지한다>
         * <외부 반복문은 계속 수행>
         */
        
        
        int sum = 0;                // int형 변수 sum 선언과 동시에 값 0을 대입.        
        int num = 0;                // int형 변수 num 선언과 동시에 값 0을 대입.
        
        
        for(num = 0; ; num++) {     // 변수 num에 값 0을 대입하고, 조건식은 생략. 조건이 생략되고 for문 안 수행문 수행.
            sum += num;             // sum = sum + num; // sum = 0 + 0
                                    // if문에서 조건식을 만족하지 않으면 증감식 num++ 수행하며 수행문 계속 수행.
                                    // sum = 0 + 1
                                    // sum = 1 + 2
                                    // sum = 3 + 3
                                    // ~
                                    // sum = 55 + 11
                                    // sum = 66 + 12
                                    // sum = 78 + 13  // sum = 91
                                    // sum = 91 + 14  // 변수 sum에 105가 대입되어진다. 
                                    // sum 값이 105로 되어 if문 조건식에 true 가 된다.
            
            if(sum >= 100)          // if문 조건에서 변수sum 값이 100보다 크거나 같을때 true, if문 수행문을 수행.
                break;              // if문 조건식에서 true일 때 break; 수행. 반복문 중단. 반복문을 바로 빠져나온다. 
        }
        System.out.println("num : " + num);     // 반복문 안에서 break 후 마지막 num 값을 출력. num = 14
                                                // if문에서 바로 반복문을 빠져 나와서 증감식 num++을 수행하지 않고 나옴.
                                                // 그래서 num값이 14이다.
        
        System.out.println("sum : " + sum);     // 반복문 안에서 break 후 마지막 sum 값을 출력. sum = 105
        System.out.println("============");     // 구분선
        
        
        /*
         * 종료 조건을 for문 안에서 사용하면,
         * num값을 늘리는 증감식을 나중에 하는것이 아닌,
         * 먼저 증감식을 수행하므로 num값이 15가 된다.
         * 
         * 반복문을 중단하려면 break문을 사용해야 정확한 결과값을 얻을 수 있다.
         * 
         * 아래와 같이 사용하면 올바른 결과를 얻을 수가 없다.
         */
               

        for(num = 0, sum = 0; sum < 100; num++) {   // 위의 식 결과 때문에 다시 변수 num, sum에 0을 대입.
                                                    // 위와는 다르게 조건식 생략하지 않고 for문에서 조건식을 썼다.
            
            sum += num;                             // sum = sum + num; 
                                                    // 변수 sum 값이 100 보다 클때 false로 for반복문 종료.
                                                    // 증감식 num++ 수행하여 num값 1 증가. num = 14
                                                    // sum = 91 + 14 변수 sum에 105가 대입.
                                                    // 증감식 num++ 를 수행. num = 15
                                                    // 조건식 sum < 100 에 105가 false 되고 
                                                    // for반복문 빠져나온 후 그 다음 수행문 수행.
        }
        System.out.println("num : " + num);         // num값이 105가 될 당시의 14가 아닌,
                                                    // for반복문 마지막에 증감식 num++ 가 먼저 수행되어져서 15가 출력됨.

        System.out.println("sum : " + sum);         // 마지막 sum 값 105가 출력됨.
    }

}
