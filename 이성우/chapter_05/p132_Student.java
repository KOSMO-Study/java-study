package chapter_05;

public class p132_Student {

    int studentID;              // int형 변수 studentID(학번)를 선언           // 멤버변수
    String studentName;         // String형 변수 studentName(학생이름) 선언    // 멤버변수
    int grade;                  // int형 변수 grade(학년) 선언                 // 멤버변수
    String address;             // String형 변수 address(사는곳) 선언          // 멤버변수  
    
    /*
     * <클래스 기능을 구현하는 메서드> 132쪽
     * 
     * 클래스에서 객체가 가지는 속성을 사용해 관련된 기능을 구현 할 수 있다.
     * 
     * 클래스 내부에서 `멤버변수`를 사용하여
     * 클래스 기능을 구현한 것을 [멤버함수] 또는 [메서드]라고 한다.
     * 
     */
    
    public void showStudentInfo() {                         // showStudentInfo라는 메서드 추가.
                                                            // 학생이름과 주소를 출력하는 기능.
        
        System.out.println(studentName + "," + address);    // 학생이름, 주소를 출력.
        
        
        
        /*
         * <패키지> 
         * 
         * 패키지는 클래스 파일의 묶음
         * 
         * 소스코드를 구성하는 계층구조가 된다.
         * 
         * 유지보수를 위해 잘 구성해야한다. 
         * 
         * 패키지 이름이 다르면 클래스 이름이 같아도 다른것이다.
         * 
         * 이름이 같은 클래스라도 다르패키지에 속해 있으면 서로 연관이 없다.
         * 
         */
    }
}
