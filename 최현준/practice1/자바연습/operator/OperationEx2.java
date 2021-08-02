package operator;

public class OperationEx2 {

	public static void main(String[] args) {
	int gameScore = 150;
	
	int lastgameScore1 = ++gameScore;		//gameScore에 1만큼 더한 값을 lastgameScore1에 대입
	System.out.println(lastgameScore1);		//151
	
	int lastgameScore2 = --lastgameScore1;	//lastgameScore1에서 1 뺀 값을 lastgameScore2에 대입
	System.out.println(lastgameScore2);		//150
	}

}
