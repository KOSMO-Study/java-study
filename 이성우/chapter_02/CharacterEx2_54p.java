package chapter_02;

public class CharacterEx2_54p {

    public static void main(String[] args) {
        char ch1 = '한';
        char ch2 = '\uD55C';    // '한' 의 유니코드 값. 16진수, 4비트 사용 = 2바이트 사용.

        
        // \ 는 회피시퀀스.

        
        System.out.println(ch1);
        System.out.println(ch2);

    }

}
