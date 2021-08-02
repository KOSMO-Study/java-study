package constructor;

public class PersonTest {

	public static void main(String[] args) {
		
    	//Person personLee = new Person();  // 오류 발생(생성자를 직접 구현하여
  										  // 디폵트 생성자가 없기 때문
			
		
		Person personLee = new Person("이순신", 175, 75);
		// 인스턴스 변수 초기와화 함께 클래스를 생성함
		
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.height = 180.5F;
		personKim.weight = 85.5F;
		// 디폴트 생성자로 클래스를 생성한 후 인스턴스 변수값을 따로 초기화
		// float 형 데이터 입력 시 숫자 옆에 F를 붙여야 한다.
		
		}
	
		

	}
