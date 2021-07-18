package chapter_05;

public class p163_StudentTest {

    public static void main(String[] args) {
        
        p162_Student studentLee = new p162_Student();
//        studentLee.studentName = "이상원";                 // p162_Student 에서 studentName 변수에 [접근제어자] private 예약어를 주어 
                                                             // 외부 클래스에서 사용 할 수 없어서 오류 발생.
        
        System.out.println(studentLee.getStudnetName());
    }

}
