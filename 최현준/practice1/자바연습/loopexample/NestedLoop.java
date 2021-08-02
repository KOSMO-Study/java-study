package loopexample;

public class NestedLoop {

	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++) {		// 2단부터 9단까지 반복하는 외부 반복문
			for(times = 1; times <= 9; times++) {	// 각 단에 1~9를 곱하는 내부 반복문
				System.out.println(dan + "X" + times + "=" + dan * times);
			}
			System.out.println();		// 한 칸 띄워서 출력하려는 목적
		}
	}

}
		// 내부 반복문이 완료될 때 까지 진행된 후 외부 반복분을 실행후 다시 내부 반복문이 실행. 완료되는
		// 과정을 외부 반복문이 완료될 때 까지 진행한다.

