package loopexample;

public class ForExample1 {

	public static void main(String[] args) {
		int i;
		int sum;
		for(i=1, sum=0; i <= 10; i++) {
			sum += i;		// for문에서 가장 자주 사용되는 변수 이름은 i이다. 주로 횟수를 표현.
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}
