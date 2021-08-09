package chapter_07;

public class p202_ArrayTest {

    public static void main(String[] args) {

        int sum = 0;
        
        int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};       // int 형 요소 로 선언한 변수 num 에,
                                                            // new 예약어로 배열생성. 배열개수 생략,
                                                            // int 형 요소 10개인 배열 생성.  
                                                            // new int[] 생략 가능.  // but, 배열 자료형 따로 먼저 선언하면 생략 불가.  
        
                                                            // 정수 10개를 저장할 배열 선언하고, 각 요소를 값1~ 값10 까지의 값으로 초기화.
        
        for(int i = 0; i < num.length; i++) {               // for 반복문으로 배열 요소값 하나씩 출력.
                                                            // int형 변수 i 를 0부터 num 변수 배열길이 까지 1씩 증가하여 반복.
            
            System.out.println(num[i]);                     // num[i] 를 출력.  
            
            sum += num[i] ;
            
        }
        
        // 1분 복습. 배열 모든요소 합 계산.  
        System.out.println("반복문의 총 합은 : " + sum);
        
    }

}
