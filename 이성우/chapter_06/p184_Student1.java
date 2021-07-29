package chapter_06;

public class p184_Student1 {

     
    public static int serialNum = 1000;     // static 변수 serialNum 선언과 동시에 값 1000 대입.
    
    // p184_Student1 클래스의 속성변수들 선언.  
    public int studentID;
    public String studentName;
    public int grade;
    public String address;
    
    
    public p184_Student1() {        // 생성자.
        
        serialNum++;                // 생성자를 이용하여,
                                    // 학생이 생성될 때마다 증가.
        
        studentID = serialNum;      // 증가된 serialNum 을 인스턴스 변수 studentID 에 대입하여 학번을 부여.
    }
    
    
    
    
    // String형 리턴값이 있는 getStudentName() 메서드.
    public String getStudentName() {
       
        return studentName;     // studentName 값을 리턴한다.  
        
    }
    
    // 리턴값이 없는 setStudentName() 메서드, 매개변수로 String 형 변수 name 을 받는다.
    public void setStudentName(String name) {
       
        studentName = name;     // 매개변수 name 의 값을 속성변수 studentName 에 대입.
        
    }

   
    
    
}
