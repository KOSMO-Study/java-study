package chapter_06;

    /*
     * <static 변수>
     * 
     * 인스턴스마다 따로 생성되는 변수가 아닌,
     * 클래스 전반에서 공통으로 사용할 수 있는 기준 변수가 필요.
     * 
     * 공통으로 사용하는 변수를 `static 변수` 로 선언한다.  
     * static 변수는 다른용어로 `정적 변수` 라고도 한다. 
     * 클래스 기반한 변수라하여 `클래스변수` 라고도 한다.
     */

    /*
     * static 변수는 클래스 내부에 선언하지만, 
     * 
     * 인스턴스가 생성될때마다 새로 생성되는것이 아니다.
     * 
     * 실행되어 메모리에 올라갔을 때 딱한번 메모리 공간 할당.
     * 
     * 그 값은 모든 인스턴스가 공유한다.
     */

public class p182_Student {
    
    public static int serialNum = 1000;     // static 변수 serialNum 선언과 동시에 값 1000 대입.
    
    // p182_Student 클래스의 속성변수들 선언.  
    public int studentID;
    public String studentName;
    public int grade;
    public String address;
    
    // String형 리턴값이 있는 getStudentName() 메서드.
    public String getStudentName() {
       
        return studentName;     // studentName 값을 리턴한다.  
        
    }
    
    // 리턴값이 없는 setStudentName() 메서드, 매개변수로 String 형 변수 name 을 받는다.
    public void setStudentName(String name) {
       
        studentName = name;     // 매개변수 name 의 값을 속성변수 studentName 에 대입.
        
    }

}
