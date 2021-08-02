package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
									//반환값이 int형이므로 결과값이 저장되는 sum변수 앞에 int
		int sum = add(num1, num2);	//add(변수1, 변수2) 함수 호출
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");
	}
	
	public static int add(int n1, int n2) {		// add( ) 함수
		int result = n1 + n2;		//결과 값이 정수이므로 반환형은 int형으로
		return result;		// 함수 수행 종료 및 결과값 반환
	}

}

// 사칙연산 활용 예시는 FunctionTest2 참조
