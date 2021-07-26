package chapter_06;

public class p177_Bus {

    int busNumber;              // int 형 변수 busNumber 선언        // 멤버변수.    // 버스번호
    int passengerCount;         // int 형 변수 passengerCount 선언   // 멤버변수.    // 버스 승객 수
    int money;                  // int 형 변수 money 선언            // 멤버변수.    // 버스 수입 
    
    
    public p177_Bus(int busNumber) {        // int형 매개변수 busNumber 를 받는 생성자.
                                            // 생성자에서 버스번호를 매개변수로 받아 버스가 생성될 때 
                                            // 버스번호 초기화.
        
        this.busNumber = busNumber;         // this.busNumber 는 동적 메모리에 생성된 인스턴스의 busNumber 변수 위치를 가리키고,
                                            // 그 위치에 매개변수 busNumber 값을 넣어준다.
        
    }
    
    public void take(int money) {           // 리턴값이 없는 int형 매개변수 money 를 받는 take() 메서드 
                                            // 승객 한명이 버스를 탄경우를 구현.
                                            // 요금을 매개변수로 받음. 
                                         
        
        this.money += money;                // this.money 는 동적 메모리에 생성된 인스턴스의 money 변수 위치를 가리키고,
                                            // 그 위치에 매개변수 money 값을 넣어준다.
                                            // 버스 수입 증가.
        
        passengerCount++;                   // 승객 수 증가.  
    }
    
    public void showInfo() {                // 리턴값이 없는 showInfo() 메서드
                                            // 버스정보를 출력.  
        
        System.out.println("버스 " + busNumber + " 번의 승객은 " + passengerCount + " 명이고, 수입은 " + money + " 원 입니다.");
        // 버스번호와 승객수, 수입금액을 출력.  
    }
}
