package chapter_07;

public class p204_ArrayTest2 {  

    public static void main(String[] args) {
        
        double[] data = new double [5];             // double 형으로 길이가 5인 배열 선언.
        
        
        data[0] = 10.0;             // 첫번째 배열에 값 10.0 을 대입.
         
        data[1] = 20.0;             // 두번째 배열에 값 20.0 을 대입.
        
        data[2] = 30.9;             // 세번째 배열에 값 30.9 을 대입.
        
        /*
         * 자바에서는 정수배열과 실수 배열을 별도로 초기화 하지 않고 선언하면,
         * 
         * 배열의 요소 값은 0 으로 초기화 된다. 
         */
        
        for (int i = 0; i < data.length; i++) {         // i 가 0부터 data 배열 길이만큼 
                                                        // 1씩 증가하면서 반복문 실행.
            
            System.out.println(  data[i]  );                // 반복문 실행할때마다 data[i] 값을 출력.  
            
            /*
             * 출력 결과를 보면, 첫번째부터 세번째 입력 값이 출력되고,
             * 
             * 네번째, 다섯번째 값은 대입되지 않았지만 자동으로 0으로 초기화 되어, 0 출력.  
             * 
             */
        }

    }

}
