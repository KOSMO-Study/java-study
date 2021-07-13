package chapter_05;

public class p148_StudentTest1 {

    public static void main(String[] args) {
        
        /*
         * <인스턴스와 참조변수>
         * 
         * 객체, 클래스, 인스턴스
         * 
         * [객체] : 의사나 행위가 미치는 대상
         * [클래스] : 객체를 코드로 구현한 것
         * [인스턴스] : 클래스가 메모리 공간에 생성된 상태
         * 
         * 생성된 클래스의 인스턴스를 객체라고도 한다.
         * 
         * 클래스의 생성자를 호출하면 [인스턴스]가 만들어진다.
         * 
         * 클래스는 하나이지만, 이 클래스로부터 여러개의 다른 [인스턴스]를 생성 가능.
         * 클래스라는 틀에서 인스턴스를 여러개 만들어 프로그램을 구현.
         */
        
        // 생성자를 두번 사용해서 서로다른 변수 이름으로 클래스를 두개 생성.
        // 서로 다른 인스턴스 두개 생성.
        p144_Student student1 = new p144_Student();     // 첫번째 학생 생성        // new예약어를 사용하여 생성자[p144_Student();] 호출하여 새로운 클래스 생성.
                                                                                   // p144_Student 클래스 자료형 변수 student1을 선언하고 생성한 클래스 대입.
                                                                                   // =
                                                                                   // 참조변수(student2)에 new p144_Student();로 생성한 클래스 대입.
        
        student1.studentName = "안연수";                                           // 참조변수 student1를 사용하여 멤버변수 studentName에 값 "안연수"를 대입.
        System.out.println(student1.getStudentName());                             // 참조변수 student1를 사용하여 메서드 getStudentName()를 사용하여 출력.
        
        
        p144_Student student2 = new p144_Student();     // 두번째 학생 생성        // new예약어를 사용하여 생성자[p144_Student();] 호출하여 새로운 클래스 생성.
                                                                                   // p144_Student 클래스 자료형 변수 student2을 선언하고 생성한 클래스 대입.
                                                                                   // =
                                                                                   // 참조변수(student2)에 new p144_Student();로 생성한 클래스 대입.
        
        student2.studentName = "안승연";                                           // 참조변수 student2를 사용하여 멤버변수 studentName에 값 "안승연"를 대입.
        System.out.println(student2.getStudentName());                             // 참조변수 student2를 사용하여 메서드 getStudentName()를 사용하여 출력.
        
        /*
         * <인스턴스와 힙메모리>
         * 
         * new p144_Student()를 선언하면 p144_Student()가 생성되고,
         * studentID, studentName 등 [멤버변수]를 가지고 있다.
         * 
         * [멤버변수]의 저장할 공간이 [힙메모리](heap memory)이다.
         * 
         * 클래스 생성자를 하나 호출하면 인스턴스가 [힙메모리]에 생성된다.
         * 
         * 위의 코딩에서는 생성된 클래스를 student1 변수에 대입하면 인스턴스가 저장된 메모리를 student1 변수가 가리킨다.
         * student1변수는 [지역변수]이다.  
         * 
         * [지역변수]는 [스택메모리]에 생성.
         * [인스턴스]는 [힙메모리]에 생성
         * 
         * => [지역변수] student1에 생성된 [인스턴스]를 대입하는것은,
         *    student1에 [인스턴스]가 생성된 [힙메모리 주소]를 대입한다는 의미다.
         * 
         * 위의 코딩에서 생성된 두 인스턴스
         * p144_Student student1 = new p144_Student(); 
         * p144_Student student2 = new p144_Student();
         * 는 
         * 서로 각각 다른 메모리 공간을 차지한다.
         * 
         * student1.studentName 과
         * student2.studentName 는
         * 서로 다른값을 가지게 된다.
         * 
         * 이때문에 클래스에 선언한 멤버변수를 [인스턴스변수]라고도 한다.
         */
        
    }

}
