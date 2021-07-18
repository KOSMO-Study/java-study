package chapter_05;

public class p160_Student2 {

    
    int studentID;          // int형 변수 studentID 선언                     // 기본자료형
    
    String studentName;     // String형 변수 studentName 선언                // [참조자료형]
                            // String이 JDK에서 제공하는 [참조 자료형]이다.
    
    int koreaScore;         // int형 변수 koreaScore 선언                    // 기본자료형
    int mathScore;          // int형 변수 mathScore 선언                     // 기본자료형
    
    
    // 과목이름변수 추가.
    String koreaSubject;    // String형 변수 koreaSubject 선언               // [참조자료형]
    String mathSubject;     // String형 변수 mathSubject 선언                // [참조자료형]
    
    /*
     * 과목에 대한 변수가 늘어남에 따라 문제가 생김.
     * 
     * 학생에 대한 클래스가 복잡해짐.
     * 
     * 과목의 이름과 성적을  Subject 클래스로 분리하고 
     * 
     * 학생에 Subject 변수를 각 과목별로 추가해본다.
     */
    
}
