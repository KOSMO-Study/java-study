package chapter_06;

public class p185_StudentTest2 {

    public static void main(String[] args) {

        p184_Student1 studentLee = new p184_Student1();     // 생성자를 이용하여, 학생 인스턴스를 생성. 
        
        studentLee.setStudentName("이지원");                // setStudentName() 메서드 사용하여 "이지원" 입력.
        
        System.out.println(studentLee.serialNum);           // 참조변수 studentLee 의 serialNum 변수값 출력.
                                                           
        
        System.out.println(studentLee.studentName + " 학번 : " + studentLee.studentID);   // studentLee 학생의 이름과 학번 출력.
        
        
        
        
        
        p184_Student1 studentSon = new p184_Student1();      // 생성자를 이용하여, 학생 인스턴스를 생성. 
        
        studentSon.setStudentName("손수경");                // setStudentName() 메서드 사용하여 "손수경" 입력.
        
        System.out.println(studentSon.serialNum);           // 참조변수 studentSon 의 serialNum 변수값 출력.
        
        System.out.println(studentSon.studentName + " 학번 : " + studentSon.studentID);    // studentSon 학생의 이름과 학번 출력.
      
       
        /*
         * 학생 인스턴스를 생성할때마다 
         * 
         * p184_Student1 클래스에서 정해준 생성자에서 
         * 
         * serialNum 증가하고, 증가할 때마다 studentID 에 대입해주어
         * 
         * 두 학생의 학번이 달라지게 된다.
         * 
         * 인스턴스 들이 static 변수의 값을 공유하게 되는것이다.  
         * 
         */
        
    }

}
