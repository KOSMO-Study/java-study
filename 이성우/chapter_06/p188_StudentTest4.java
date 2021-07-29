package chapter_06;

public class p188_StudentTest4 {

    public static void main(String[] args) {
        
        /*
         * static 매서드 또한 static 변수처럼,
         * 
         * 인스턴스 참조변수가 아닌, 
         * 
         * 클래스 이름으로 직접 호출 할 수 있다.
         * 
         */
        
        
        p187_Student2 studentLee = new p187_Student2();     // 생성자를 이용하여, 학생 인스턴스를 생성. 
        
        studentLee.setStudentName("이지원");                // setStudentName() 메서드 사용하여 "이지원" 입력.
        
        System.out.println(p187_Student2.getSerialNum());        // 클래스 p187_Student2 이름으로 serialNum 변수를 참조할수 없다.
                                                                 // p187_Student2 에서 serialNum 변수를 private 로 지정하였기 때문.
                                                                 // serialNum 값을 얻으러면 getSerialNum() 메서드를 사용하여 리턴받아야 한다.  
                                                                        
        
                                                                
        System.out.println(studentLee.studentName + " 학번 : " + studentLee.studentID);   // studentLee 학생의 이름과 학번 출력.
        
        
        
        
        
        p187_Student2 studentSon = new p187_Student2();     // 생성자를 이용하여, 학생 인스턴스를 생성. 
        
        studentSon.setStudentName("손수경");                // setStudentName() 메서드 사용하여 "손수경" 입력.
        
        System.out.println(p187_Student2.getSerialNum());        // 클래스 p187_Student2 이름으로 serialNum 변수를 참조할수 없다.
                                                                 // p187_Student2 에서 serialNum 변수를 private 로 지정하였기 때문.
                                                                 // serialNum 값을 얻으러면 getSerialNum() 메서드를 사용하여 리턴받아야 한다.  
        
        System.out.println(studentSon.studentName + " 학번 : " + studentSon.studentID);    // studentSon 학생의 이름과 학번 출력.
    }

}
