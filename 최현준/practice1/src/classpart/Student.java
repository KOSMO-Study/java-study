package classpart;

public class Student {		//public <클래스를 만드는 예약어> <클래스 이름>
	int studentID;			//학번]
	String studentName;		//이름]	멤버
	int grade;				//학년]	변수 -- 클래스 속성을 나타냄
	String address;			//주소]	
	
	public void showStudentInfo( ) {
		System.out.println(studentName + " , " + address);  // 이름, 주소 출력
	}														// 메서드 추가
	
	public String getStudentName( ) {	//학생 이름 반환하는 메서드 
		return studentName;				//이 메서드의 반환 값 자료형이 String이므로 반환형 역시
	}									//String이어야 한다.
	
	public void setStudentName(String name) {	// 매개변수 name을 멤버변수 StudentName에 대입
		studentName = name;						// 메서드 -- 멤버 변수를 이용하여 클래스 구현
	}
	
	public static void main(String[] args) {	// main( ) 함수
		Student studentAhn = new Student( );	// Student 클래스 생성
		studentAhn.studentName = "안연수";		// 클래스의 멤버변수에 값을 대입
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName( ));
	}

}

