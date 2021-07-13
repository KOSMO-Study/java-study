package chapter_02;

public class CharacterEx1_53p {

    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1);        // 문자출력
        System.out.println((int) ch1);  // 문자에 해당하는 정수값(ASCII) 출력

        char ch2 = 66;                  // 정수값 대입
        System.out.println(ch2);        // 정수값 해당하는 문자 출력

        int ch3 = 67;
        System.out.println(ch3);        // 대입한 정수 출력.
        System.out.println((char) ch3); // 정수값에 해당하는 문자.

        
        // 1분 복습 53쪽

        char ch4 = 'Z';
        int ch5 = 38;
        int ch6 = 97;

        System.out.println((int) ch4 + ":" + (char) ch5 + ":" + (char) ch6);

        /*
         * 형변환으로 각각의 출력값을 다르게 표현.
         */

    }

}
