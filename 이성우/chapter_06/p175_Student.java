package chapter_06;

public class p175_Student {         // 학생 클래스 구현하기.

    public String studentName;      // String 형 변수 studentName 선언    // 학생이름    // 멤버(속성)변수
    public int grade;               // int 형 변수 grade 선언             // 학년        // 멤버(속성)변수
    public int money;               // int 형 변수 money 선언             // 가진 돈     // 멤버(속성)변수
    
    public p175_Student(String studentName, int money) {        // 학생이름과 가진돈을 매개변수로 받는 생성자
                                                                // 생성자로 클래스 생성하면 이름과 가진돈을 초기화.  
        
        this.studentName = studentName;                         // this.studentName 는 동적 메모리에 생성된 인스턴스의 studentName 변수 위치를 가리키고,
                                                                // 그 위치에 매개변수 studentName 값을 넣어준다.
        
        this.money = money;                                     // this.money 는 동적 메모리에 생성된 인스턴스의 money 변수 위치를 가리키고,
                                                                // 그 위치에 매개변수 money 값을 넣어준다.
    }
    
    public void takeBus(p177_Bus bus) {             // 메서드 구현,
                                                    // 버스를 타면 요금을 지불하는 기능구현.
                                                    // takeBus() 메서드를 수행하면 p177_Bus 클래스의 메서드 take(1000)를 수행함과 동시에
                                                    // this.money -= 1000; 로 인스턴스의 money 변수에 1000원을 줄어들게 한다.
        
        bus.take(1000);                             // bus 의 메서드 take() 에 매개변수 값 1000 대입하고 수행.
        
        this.money -= 1000;                         // this.money = this.money - 1000 
                                                    // 학생이 가진 돈이 1000원 만큼 줄어든다.
                                                    
    }
    
    public void takeSubway(p177_Subway subway) {    // 메서드 구현,
                                                    // 지하철을 타면 요금을 지불하는 기능구현.
                                                    // takeSubway() 메서드를 수행하면 p177_Subway 클래스의 메서드 take(1500) 수행함과 동시에
                                                    // this.money -= 1500; 로 인스턴스 money 변수에 1500원을 줄어들게 한다.
        
        subway.take(1500);                          // subway의 메서드 take() 에 매개변수 값 1500을 대입하고 수행.
        
        this.money -= 1500;                         // this.money = this.money - 1500 
                                                    // 학생이 가진 돈이 1500원 만큼 줄어든다.
    }
    
    public void showInfo() {                        // 메서드 구현,
                                                    // 학생 정보를 출력해준다.  
        
        System.out.println(studentName + " 님의 남은돈은 " + money + " 원 입니다.");  // 학생 이름과 잔액을 출력.  
    }
    
    
}
