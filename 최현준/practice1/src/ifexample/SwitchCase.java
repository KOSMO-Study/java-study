package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		
		int ranking = 2;
		
		char medalColor;
		
		switch (ranking) 	{				//switch-case 문 앞 철자 대문자로 하지 말것
			
			case 1 : medalColor = 'G';
					 break;
					 
			case 2 : medalColor = 'S';
			 		 break;
			 		 
			case 3 : medalColor = 'B';
			 		 break;
			 		 
			default : medalColor = 'A';
		}
		System.out.println(ranking + "등 메달의 색깔은" + medalColor + "입니다.");
	}
}
