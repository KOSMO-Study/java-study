package chapter_06;

public class p183_StudentTest1 {

    public static void main(String[] args) {

        p182_Student studentLee = new p182_Student();       // studentLee 참조변수 
        studentLee.setStudentName("이지원");                // setStudentName() 메서드 사용하여 "이지원" 입력.
        
        System.out.println(studentLee.serialNum);           // serialNum 변수값 출력.
                                                            // serialNum 초기값이 출력됨.
       
        studentLee.serialNum++;             // 인스턴스에서 공통으로 사용하는 
                                            // serialNum 값 1 증가.
        
        
        p182_Student studentSon = new p182_Student();       // studentSon 참조변수
        
        studentSon.setStudentName("손수경");                // setStudentName() 메서드 사용하여 "손수경" 입력.
        
        System.out.println(studentSon.serialNum);           // 아무 연산도 수행하지 않은 serialNum 값 출력.
                                                            // 아무 연산도 하지 않았지만,
                                                            // static 변수 serialNum 을 앞선 studentLee.serialNum++ 에서
                                                            // 증가시켜서 1001 값이 출력된다.
                                                            // serialNum 변수를 공유한다는것을 알 수 있다.
        
        System.out.println(studentLee.serialNum);           // serialNum 출력. 1001 출력.
        
        /*
         * 출력을 보면,
         * 
         * 두개의 참조변수가 동일한 변수의 메모리를 
         * 
         * 가리키고 있다는것을 알 수 있다.
         */
        
        
    }

}
