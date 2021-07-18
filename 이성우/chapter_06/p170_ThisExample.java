package chapter_06;

class BirthDay {            // BirthDay 클래스 
    
    int day;                // int형 변수 day 선언.      // 멤버변수
    int month;              // int형 변수 month 선언.    // 멤버변수
    int year;               // int형 변수 year 선언.     // 멤버변수
    
    public void setYear(int year) {     // set() 으로 태어난 연도를 지정하는 메서드
        
        this.year = year;               // this.year 는 동적 메모리에 생성된 인스턴스의 year 변수 위치를 가리키고,
                                        // 그 위치에 매개변수 year값을 넣어준다.
                                        // bDay.year = year; 와 같다.
    }
    
    public void printThis() {           // printThis() 메서드.
        System.out.println(this);       // this 를 출력.
                                        // 아래의 System.out.println(bDay);와 결과 값이 같다.
    }
}



public class p170_ThisExample {

    public static void main(String[] args) {
        
        BirthDay bDay = new BirthDay();     // new 예약어를 통해 BirthDay()생성자 호출,
                                            // BirthDay 클래스형 변수(참조변수) bDay에 대입.
        
        bDay.setYear(2000);                 // setYear() 메서드를 통해 멤버변수 year 에 값 2000 지정. 
        
        System.out.println(bDay);           // [참조변수] bDay 출력.
                                            // 결과값은 아래의 printThis() 메서드 호출과 같다.
        
        bDay.printThis();                   // this를 출력하는 메서드 printThis() 호출.
        
        
        
        /*
         * [참조변수]를 출력하면 
         * [클래스이름@메모리주소] 값이 나온다.  
         * 
         * 클래스 코드에서 사용하는 this는,
         * 생성된 인스턴스 자신을가리키는 역할을 한다.  
         */
        
        /*
         * 결론적으로 위 코드에서
         * 
         * main() 함수에서 bDay 변수가 가리키는 [인스턴스]와,
         * BirthDay 클래스의 setYear() 메서드에서 this 가 가리키는 [인스턴스]는,
         * 같은곳에 있는것이다. 
         * 
         */

    }

}
