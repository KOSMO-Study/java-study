package chapter_05;

public class p137_FunctionTest {

    public static void main(String[] args) {
        
        /*
         * <메서드>
         * 
         * 메서드는 함수(function)의 한 종류이다.
         */
        
        /*
         * <함수란?>
         * 
         * 하나의 기능을 수행하는 일련의 코드.
         * 
         * 함수는 어떤 기능을 수행하도록 미리 구현해 놓고
         * 필요할때마다 호출하여 사용할 수 있다.
         * 
         * 함수는 이름이 있고, 입력값과 결과값을 갖는다.
         * 
         * 함수 이름은 기능과 관련있게 만들어야 좋다.
         */
        
        /*
         * <매개변수>
         * 
         * 함수에 값이 입력되어야 수행된다.
         * 
         * 함수는 넘겨받는 값으로 수행한다.
         * 
         * 함수 내부에서 사용할 괄호 안의 변수를 [매개변수]라고 한다.
         */
        
        /*
         * <지역변수> 139쪽
         * 
         * 함수 내부에만 사용하는 변수.
         * 
         * 지역변수는 스택 메모리에 생성된다.
         */

        int num1 = 10;      // int형 변수 num1 선언과 동시에 값 10 대입.
        int num2 = 20;      // int형 변수 num2 선언과 동시에 값 20 대입.
        
        int sum = add(num1, num2);  //int형 변수 sum에 함수add를 호출하여 대입.
                                    // add() 함수 반환형이 int이므로 
                                    // 변수 sum도 int형으로 맞추어주어야 한다.  
        
        System.out.println(num1 + " + " + num2 + " = " + sum + " 입니다.");    // 변수 num1, num2, sum 출력.
    }
    
    public static int add(int n1, int n2) {     // add 함수를 구현.
                                                // 함수 [반환형] int,
                                                // 함수 이름 add 
                                                // int형 [매개변수] n1, n2 
        
        int result = n1 + n2;                   // int형 변수 result를 선언하고, 매개변수 n1 + n2 를 대입.
       
        return result;                          // return 예약어를 통해,
                                                // 결과값을 result 변수에 저장하여 [결과를 반환] = 반환 값.
        
        
        // return 예약어는 함수 수행을 종료를 목적으로 하면 return 뒤에 반환값을 적지 않는다.
        
        /*
         * 반환값이 없는 함수.
         * 반환값이 없다고해서 [반환형] 위치를 비워두면 오류가 발생한다.
         * 반환값이 없을땐 void 를 쓴다.
         * 반환할 값이 없다는 예약어. => void
         */
    }

}
