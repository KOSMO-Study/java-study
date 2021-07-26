package chapter_06;

public class p177_Subway {

    String lineNumber;          // String 형 변수 lineNumber 선언    // 멤버변수     // 지하철 노선
    int passengerCount;         // int 형 변수 passengerCount 선언   // 멤버변수     // 지하철 승객수          
    int money;                  // int 형 변수 money 선언            // 멤버변수     // 지하철 수입
    
    public p177_Subway(String lineNumber) {     // 지하철 노선을 String 형 매개변수로 받는 생성자.
        
        this.lineNumber = lineNumber;           // this.lineNumber 는 동적 메모리에 생성된 인스턴스의 lineNumber 변수 위치를 가리키고,
                                                // 그 위치에 매개변수 lineNumber 값을 넣어준다.
        
    }
    
    public void take(int money) {               // 리턴값이 없는 int형 매개변수 money 를 받는 take() 메서드 
                                                // 요금을 매개변수로 받음
        
        this.money += money;                    // this.money 는 동적 메모리에 생성된 인스턴스의 money 변수 위치를 가리키고,
                                                // 그 위치에 매개변수 money 값을 넣어준다.
                                                // 지하철 수입 증가.
        
        passengerCount++;                       // 승객 수 증가.
    }
    
    public void showInfo() {                    // 리턴값이 없는 showInfo() 메서드
                                                // 지하철 정보를 출력.  
        
        System.out.println(lineNumber + " 의 승객은 " + passengerCount + " 명이고, 수입은 " + money + " 원 입니다.");
        // 지하철노선과 승객수, 수입액을 출력.  
    }
}
