package chapter_02;

public class TypeInference_60p {

    public static void main(String[] args) {

        /*
         * <자료형 없이 변수 선언> 
         * 자바 10 부터 생긴 문법. 
         * 자바 10 이상은 호환되지만 하위버전과 호환이 맞지 않음으로 주의. 
         * 한번 선언된 자료형 변수를 다른 자료형으로 사용할 수 없다. 
         * var로 자료형 없이 변수를 선언하는 방법은 '지역변수'만 가능. { }내에서 가능.
         */

        var i = 10;         // int i = 10 으로 컴파일
        var j = 10.0;       // double j = 10.0 으로 컴파일
        var str = "hello";  // String str = "hello"로 컴파일

        // 변수에 대입되는 자료를 보고 컴파일러가 자료형을 추측하여 컴파일.

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";       // 다른문자열 대입 가능. 변수 str이 String형으로 사용되었기 때문.

//      str = 3;            // 변수 str이 String형으로 사용되어서 정수값을 넣을수 없다. 오류남.  

    }

}
