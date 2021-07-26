package chapter_06;
    
    /*
     * <생성자에서 다른생성자를 호출하는 this>
     * 
     * 클래스에 생성자가 여러개 있을 경우,
     * 생성자에서 다른 생성자를 호출하는 경우가 있다.
     * 
     * 이때 this 를 사용해 클래스의 생성자에서 다른 생성자를 호출 할 수 있다.
     * 
     */

class Person1 {     // Person 클래스.
                    // Person 클래스에 
                    // Person() 디폴트 생성자, 
                    // 매개변수를 가지는 Person(String, int) 생성자가 있다.
   
    String name;    // String형 변수 name 선언.
    int age;        // int 형 변수 age 선언.
    
    Person1() {     // 디폴트 생성자.
        
        //this.name = "noname";     
        
        /*
         * this 로 다른 생성자 호출 시,
         * 생성자를 호출하는 코드 이전에 다른 코드를 넣을 수 없다.
         * 위와 같이 다른 코드를 넣으면 오류가 난다.  
         */
        
        /*
         * 생성자는 클래스가 생성될 때 호출된다.
         * 클래스 생성이 완료되지 않은 시점에 다른 코드가 있으면 오류 발생.
         * 디폴트 생성자에서 생성이 완료되는것이 아니라 
         * this 를 사용해 다른 생성자 호출하는 형태이므로. 
         * this를 활용한 다른생성자 호출이 먼저 와야한다.
         */
        
        this("이름없음", 1);        // this를 사용해 Person(String, int) 생성자 호출
    }
    
    Person1(String name, int age){      // 매개변수를 가지는 생성자.
        
        this.name = name;               // this.name 는 동적 메모리에 생성된 인스턴스의 name 변수 위치를 가리키고,
                                        // 그 위치에 매개변수 name값을 넣어준다.
        
        this.age = age;                 // this.age 는 동적 메모리에 생성된 인스턴스의 age 변수 위치를 가리키고,
                                        // 그 위치에 매개변수 age값을 넣어준다.
        
    }
}


public class p172_CallAnotherConst {

    public static void main(String[] args) {
        
        Person noName = new Person();           // Person 클래스자료형으로 [참조변수] noName 선언하고, 
                                                // new 예약어로 Person() 생성자 호출하여 대입.
        
        System.out.println(noName.name);        // 인스턴스 변수 noName.name 값 출력.
        System.out.println(noName.age);         // 인스턴스 변수 noName.age 값 출력.
        
    }

}
