package chapter_04;

public class p107_BasicLoop {

    public static void main(String[] args) {

        // 1부터 10까지 더하기.

        int num = 1;        // int형 변수 num선언과 동시에 값 1을 대입.
        num += 2;               // num = num + 2; 수행. // num변수에 num + 2 값을 대입. // num = 1 + 2 // 변수 num에 3이 대입된다.
        num += 3;               // num = num + 3; 수행. // num변수에 num + 3 값을 대입. // num = 3 + 3 // 변수 num에 6이 대입된다.
        num += 4;               // num = num + 4; 수행. // num변수에 num + 4 값을 대입. // num = 6 + 4 // 변수 num에 10이 대입된다.
        num += 5;               // num = num + 5; 수행. // num변수에 num + 5 값을 대입. // num = 10 + 5 // 변수 num에 15가 대입된다.
        num += 6;               // num = num + 6; 수행. // num변수에 num + 6 값을 대입. // num = 15 + 6 // 변수 num에 21이 대입된다.
        num += 7;               // num = num + 7; 수행. // num변수에 num + 7 값을 대입. // num = 21 + 7 // 변수 num에 28이 대입된다.
        num += 8;               // num = num + 8; 수행. // num변수에 num + 8 값을 대입. // num = 28 + 8 // 변수 num에 36이 대입된다.
        num += 9;               // num = num + 9; 수행. // num변수에 num + 9 값을 대입. // num = 36 + 9 // 변수 num에 45가 대입된다.
        num += 10;              // num = num + 10; 수행. // num변수에 num + 10 값을 대입. // num = 45 + 10 // 변수 num에 55가 대입된다.

        System.out.println("1부터 10까지의 합은 " + num + " 입니다.");    // 최종적으로 num변수에 55가 대입되어진것이 출력.

        // 반복된 일을 처리하기 위해 사용되는것이 [반복문].

        // 위 처럼 처리하면 효율적이지 않다.

    }

}
