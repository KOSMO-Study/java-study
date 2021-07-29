package chapter_06;

public class p190_StudentTest5 {

    public static void main(String[] args) {

        System.out.println(p187_Student2.getSerialNum());   // 클래스 이름으로 getSerialNum( ) 메서드 직접호출.
        
        /*
         * 인스턴스가 생성되지 않아도 getSerialNum( ) 메서드를 호출 할 수 있다.
         * 
         * static 변수처럼 인스턴스 생성과 무관하게 메모리 공간에 할당되는것만 
         * 
         * 클래스 메서드에서 사용 할 수 있다.
         * 
         * 인스턴스가 생성되어야 메모리가 할당되는 인스턴스 변수는 
         * 
         * 클래스 메서드에서 사용할 수 없다.  
         */
    }

}
