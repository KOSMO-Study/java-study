package ifexample;

public class IfExampleTest {

	public static void main(String[] args) {
		int Score = 55;
		char grade;
		
		if(Score <= 100 && Score >90) {
			grade = 'A';
			System.out.println("A 입니다.");
		}
		else if(Score <= 89 && Score >80) {
			grade = 'B';
			System.out.println("B 입니다.");
		}
		else if(Score <= 79 && Score >70) {
			grade = 'C';
			System.out.println("C 입니다.");
		}
		else if(Score <= 69 && Score >60) {
			grade = 'D';
			System.out.println("D 입니다.");
		}
		else {
			grade = 'F';
			System.out.println("F 입니다.");
		}
		System.out.println("수고하셨습니다");
	}

}
