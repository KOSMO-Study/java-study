package chapter_06;

public class p187_Student2 {

    private static int serialNum = 1000;     // static 변수 serialNum 선언과 동시에 값 1000 대입.
                                             // private 변수로 변경.  
    
    // p187_Student2 클래스의 속성변수들 선언.  
    public int studentID;
    public String studentName;
    public int grade;
    public String address;
    
    
    public p187_Student2() {        // 생성자.
        
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
    
    /*
     * <클래스 메서드> = static 메서드
     * 
     * static 변수를 위한 메서드.
     * 
     * 외부 클래스에서 참조하지 못하도록,
     * 
     * 위의 변수 serialNum 을 private 로 바꾸어줌.  
     * 
     * 아래와 같이 get, set 메서드를 작성. 
     * 
     */
    
    
    public static int getSerialNum() {                  // serialNum의 get() 메서드
        
        int i = 10;
        
        return serialNum;
        
    }
    
    public static void setSerialNum(int serialNum) {    // serialNum의 set() 메서드
        
        p187_Student2.serialNum = serialNum;            // 클래스 p187_Student2 이름으로 serialNum 변수를 참조 후,
                                                        // 매개 변수로 받은 int형 serialNum을 대입.     
        
    }
    
    /*
     * 외부 클래스에서 serialNum 값을 사용하려면 get메서드 호출 해야하고,
     * 
     * serialNum 변수 값을 변경하려면 set 메서드를 사용하여 매개변수로 int serialNum 을 주어야
     * 
     * 변경이 가능하다.  
     */

    
}
