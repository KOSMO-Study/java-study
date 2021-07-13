package chapter_05;

public class p146_StudentTest {                         // main()함수가 포함된 테스트용 클래스를 따로 만들어 실행.
                                                        // main()함수가 포함된 클래스부터 프로그램이 시작한다.

    public static void main(String[] args) {
        
        p144_Student studentAhn = new p144_Student();       // 새로운 클래스를 생성. 
                                                            // new 예약어로 생성자 p144_Student 를 호출하여 새로운 클래스 생성
                                                            // 실제로 사용할 수 있도록 생성된 클래스를 [인스턴스]라고 한다.
                                                            // 클래스형 변수이름 studentAhn 선언 하여 new예약어로 생성자를 호출하여 대입.
                                                            //  =
                                                            // p144_Student 클래스 자료형으로 studentAhn 변수를 선언하고,
                                                            // new p144_Student(); 로 p144_Student 클래스를 생성하여 [참조변수] studentAhn에 대입.
                                                            // studentAhn은 클래스형 변수이름이며, [참조변수], 이 변수가 생성된 인스턴스를 가리킨다.
        

        studentAhn.studentName = "안연수";                  // 클래스형 변수 studentAhn 의 멤버변수(studentName)에 "안연수" 값을 대입.
        
        System.out.println(studentAhn.studentName);         // 클래스형 변수 studentAhn 의 멤버변수(studentName) 출력.
        System.out.println(studentAhn.getStudentName());    // 클래스형 변수 studentAhn 의 메서드 getStudentName() 를 사용하여 멤버변수 studentName 출력.
    }

}
