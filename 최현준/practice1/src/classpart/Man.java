package classpart;

public class Man {

	int age;			//] 클래스 내의 출력하고 싶은 세부 항목을 올바른 출력값과 함께 작성
	String manName;		//]
	boolean isMarried;	//]
	int child;			//]
	
	public void showManInfo( ) {
		System.out.println(manName + " , " + age + " , " + isMarried + " , " + child);
	}	//위의 항목들을 포함한 메서드를 추가
	
	public String getManName( ) {
		return manName;
	}	//이름값을 반환하는 메서드
	
	public void setManName(String name) {
		manName = name;
	}	// 매개변수를 멤버변수에 대입하여 멤버변수를 통해 클래스를 구현하게 하는 메서드
	
	public static void main(String[] args) {
		int age = 40;
		
		Man ManJ = new Man();
		ManJ.manName = "James";
		
		boolean isMarried = true;	// boolean의 결과는 참, 거짓 말고 없다.
		
		int child = 3;
		
		System.out.println(age);
		System.out.println(ManJ.manName);
		System.out.println(isMarried);
		System.out.println(child);
	}
}
