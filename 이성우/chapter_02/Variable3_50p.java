package chapter_02;

public class Variable3_50p {

    public static void main(String[] args) {

        // <byte형>

        byte bs1 = -128;
//      byte bs2 = 128;     // byte형 표현가능 범위는 -128~127 이여서 오류가 난것이다.  

        // 범위를 넘어선 값은 오류가 난다.

        
        // <short형>
        // (-32,768~32,767)

        
        // <int형>
        // 가장 많이 사용하는 자료형.
        // (-2,147,483,648~2,147,483,647)

        
        short sVal = 10;                // 내부적으로 int형으로 변환
        byte bVal = 20;                 // 내부적으로 int형으로 변환
        System.out.println(sVal + bVal);

    }

}
