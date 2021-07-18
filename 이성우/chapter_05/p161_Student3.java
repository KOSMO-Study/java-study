package chapter_05;

public class p161_Student3 {

    
    int studentID;          // 기본자료형 int형 변수 studentID 선언
    String studentName;     // 참조자료형 Stirng 형 변수 studentName 선언
    
    p161_Subject korean;    // p161_Subject형을 사용하여 korean변수 선언.
    p161_Subject math;      // p161_Subject형을 사용하여 math 변수 선언.
    
    /*
     * p160_Student2 는 과목이름을 추가하려면
     * 
     * koeranSubjectName,
     * mathSubjectName, 이렇게 두개의 변수를 추가해야 한다.
     * 
     */
    
    /*
     * 클래스를 p161_Subject로 분리하면, 
     * subjectName은 이 클래스 안에서 선언하면 된다. 
     * 
     * 과목이름은,
     * korean.subjectName,
     * math.subjectName, 으로 사용할 수 있어 편하다.
     * 
     */
    
    /*
     * [참조자료형]은 
     * 만든클래스를 사용할 수도 있고,
     * JDK에서 제공하는 클래스를 사용 할 수도 있다.
     * 
     * 기본자료형 사용하듯
     * 클래스 자료형 변수를 선언해서 사용한다고 이해. 
     * 
     */
}
