package chapter_06;


class Person {
    
    String name;
    int age;
    
    Person( ) {
        this("이름없음", 1);            // Person(String, int) 생성자 호출
    }
    
    Person( String name, int age ) {    // 매개변수를 가지는 생성자.
        
        this.name = name;       // this.name 는 동적 메모리에 생성된 인스턴스의 name 변수 위치를 가리키고,
                                // 그 위치에 매개변수 name값을 넣어준다.
        
        this.age =age;          // this.age 는 동적 메모리에 생성된 인스턴스의 age 변수 위치를 가리키고,
                                // 그 위치에 매개변수 age값을 넣어준다.
    }
    
    Person returnItSelf() {     // 반환형, Person 클래스 형
        return this;            // this 반환
    }
}

    /*
     * <자신의 주소를 반환하는 this>
     * 
     * this를 사용하여 생성된 클래스는 자신의 주소값을 반환 할 수 있다.
     * 
     * 인스턴스 주소값을 반환 할 때,
     * 
     * this를 사용하고, 반환형은 클래스 자료형이다. 
     */


public class p173_CallAnotherCont {
    public static void main(String[] args) {
        
        Person noName = new Person();       // Person 클래스자료형으로 [참조변수] noName 선언하고, 
                                            // new 예약어로 Person() 생성자 호출하여 대입. 
        
        System.out.println(noName.name);    // 참조변수 noName 의 멤버변수 name 출력. 
        
        System.out.println(noName.age);     // 참조변수 noName 의 멤버변수 age 출력.
        
        Person p = noName.returnItSelf();   // Person 클래스자료형으로 변수 p 선언하고,
                                            // 
        
        System.out.println(p);              // noName.returnItSelf() 의 반환값을 출력. (this 가 반환된다)
        
        System.out.println(noName);         // 참조변수 출력.  
    
        
        /*
         * 클래스 자료형과 상관없이,
         * 
         * 클래스 내에서 this를 사용하면,
         * 
         * 자신의 주소값 반환.
         * 
         */
    }
    
}
