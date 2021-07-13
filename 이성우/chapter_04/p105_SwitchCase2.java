package chapter_04;

public class p105_SwitchCase2 {

    public static void main(String[] args) {

        /*
         * <case문에 문자열 사용>
         * 
         * 자바 7부터는 case 값에 정수값 뿐만 아니라 [문자열]도 사용 가능.
         * 
         * 원래는
         * 
         * if(medal.equals("Gold")){ ~ }
         * 
         * 방식으로 문자열 비교를 해주어야 한다.
         * 
         * equals( )는 문자열을 비교하는 메서드
         * 
         */

        
        String medal = "Gold";      // String형 변수 medal을 선언과 동시에 Gold 를 대입.

        switch (medal) {                                // switch문에서 medal 변수의 값이.
        case "Gold":                                    // Gold 이면,
            System.out.println("금메달입니다.");        // "금메달입니다." 를 출력.
            break;                                      // break;로 다음 case문으로 넘어가지 않고 switch문을 빠져나옴.
        case "Silver":                                  // Silver 면,
            System.out.println("은메달입니다.");        // "은메달입니다." 를 출력.
            break;                                      // break;로 다음 case문으로 넘어가지 않고 switch문을 빠져나옴.
        case "Bronze":                                  // Bronze 면
            System.out.println("동메달입니다.");        // "동메달입니다." 를 출력.
            break;                                      // break;로 다음 case문으로 넘어가지 않고 switch문을 빠져나옴.
        default:                                        // 변수 medal의 값과 일치하는 case문이 없다면 default 수행.
            System.out.println("메달이 없습니다.");     // "메달이 없습니다." 를 출력.
            break;                                      // break;로 switch문을 빠져나옴.
        }
    }

}
