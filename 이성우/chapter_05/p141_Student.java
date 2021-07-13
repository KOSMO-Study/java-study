package chapter_05;

public class p141_Student {

    /*
     * <함수의 장점>
     * 
     * 함수를 사용하면 기능을 나누어 
     * 코드를 효율적으로 구현 할 수 있다.
     * 필요할 때마다 각 함수를 호출.
     * 기능을 분리해서 구현하면 코드의 가독성도 좋아진다.
     * 
     * 중복코드를 막을 수 있다. 
     * 오류수정작업도 편리해진다. 
     */
    
    // 이름에 맞는 하나의 기능을 구현하는것이 좋다.
    
    /*
     * <클래스 기능을 구현하는 메서드>
     *
     * 클래스 내부에서 사용하는 멤버함수 = 메서드.
     * 
     * 메서드는 멤버변수를 사용하여 클래스 기능을 구현.
     * 
     * 메서드는 함수에 객체지향 개념이 포함된 용어.
     */
    
    int studentID;              // int형 변수 studentID(학번)를 선언           // 멤버변수
    String studentName;         // String형 변수 studentName(학생이름) 선언    // 멤버변수
    int grade;                  // int형 변수 grade(학년) 선언                 // 멤버변수
    String address;             // String형 변수 address(사는곳) 선언          // 멤버변수
    
    
    public String getStudentName() {    // 학생이름을 반환하는 메서드.
                                        // studentName 자료형이 String이므로 반환형도 String
        
        return studentName;             // 자료형이 String인 studentName값 반환.
    }
    
    // 142쪽
    public void setStudentName(String name) {   // 학생이름을 매개변수로 전달.
                                                // 반환값이 없으므로 반환형은 void  
                                                // setStudentName() 메서드는 Student 클래스를 사용하는 다른코드에서 
                                                // 학생 이름을 새로 지정하거나 바꾸어준다.
    
        studentName = name;                     // 매개변수 name을 studentName에 대입. 
                                                // 학생이름이 지정된다.
    }
}
