package chapter_06;

public class p186_StudentTest3 {

    public static void main(String[] args) {
        
        /*
         * static 변수는 인스턴스 생성과 별개이다.
         * 
         * 인스턴스보다 먼저 생성된다.
         * 
         * 인스턴스가 아닌 클래스 이름으로도 참조하여 사용 가능.
         * 
         * static 변수 = 클래스 변수
         */

        p184_Student1 studentLee = new p184_Student1();     // 생성자를 이용하여, 학생 인스턴스를 생성. 
        
        studentLee.setStudentName("이지원");                // setStudentName() 메서드 사용하여 "이지원" 입력.
        
        System.out.println(p184_Student1.serialNum);        // 클래스 p184_Student1 이름으로 serialNum 변수를 참조.
                                                           
        
        System.out.println(studentLee.studentName + " 학번 : " + studentLee.studentID);   // studentLee 학생의 이름과 학번 출력.
        
        
        
        
        
        p184_Student1 studentSon = new p184_Student1();     // 생성자를 이용하여, 학생 인스턴스를 생성. 
        
        studentSon.setStudentName("손수경");                // setStudentName() 메서드 사용하여 "손수경" 입력.
        
        System.out.println(p184_Student1.serialNum);        // 클래스 p184_Student1 이름으로 serialNum 변수를 참조.
        
        System.out.println(studentSon.studentName + " 학번 : " + studentSon.studentID);    // studentSon 학생의 이름과 학번 출력.

    }

}
