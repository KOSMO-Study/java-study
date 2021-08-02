package operator;

public class OperationEx1 {

	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		int korScore = 80;
		
		int totalScore = korScore + mathScore + engScore;		// 총점 구하기
		System.out.println(totalScore);
		
		double avgScore = totalScore / 3.0;			// 평균 구하기
		System.out.println(avgScore);
		
	}

}
