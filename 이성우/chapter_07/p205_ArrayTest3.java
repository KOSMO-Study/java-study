package chapter_07;

public class p205_ArrayTest3 {  

    public static void main(String[] args) {
        
        double[] data = new double [5];             // double 형으로 길이가 5인 배열 선언.
        
        
        int size = 0;               // int 형 변수 size 선언하고 0 대입.
                                    // 값이 저장된 배열 요소 개수를 저장할 변수.
        
        
        data[0] = 10.0; size++;            // 첫번째 배열에 값 10.0 을 대입.
                                           // 값을 저장 후, size 변수 증가. 
         
        data[1] = 20.0; size++;            // 두번째 배열에 값 20.0 을 대입.
                                           // 값을 저장 후, size 변수 증가.                             
        
        data[2] = 30.9; size++;            // 세번째 배열에 값 30.9 을 대입.
                                           // 값을 저장 후, size 변수 증가. 
        
        /*
         * 저장된 배열 요소 개수를 size 변수에 저장하고,
         * 저장할때 마다 size 변수값을 증가.
         */
        
        
        
        for (int i = 0; i < size; i++) {         // i 가 0부터 size 변수의 크기만큼.
                                                 // 1씩 증가하면서 반복문 실행.
            
            
            
                                                 /* 실질적으로 저장된 배열만큼만 반복문을 돌리도록 됨.
                                                  * 아래 출력 코드에서 전체 배열 길이가 반복되어 출력되는것이 아니라,
                                                  * 유효한 값을 저장하는 요소개수만큼만 반복해서 출력.
                                                  * 
                                                  *  네번째, 다섯번째 배열요소 0 (은)는 출력되지 않는다. 
                                                  */
            
            
            
            System.out.println(  data[i]  );     // 반복문 실행할때마다 data[i] 값을 출력.  

        }

    }
}