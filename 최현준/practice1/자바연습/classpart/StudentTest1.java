package classpart;

public class StudentTest1 {

	public static void main(String[] args) {
		Student student1 = new Student();				//인스턴스 생섣ㅇ
		student1.studentName = "안연수";					//멤버 변수 사용
		System.out.println(student1.getStudentName());	//메서드 사용
		Student student2 = new Student();
		student2.studentName = "안승연";					
		System.out.println(student2.getStudentName());

	}	// 인스턴스 생성 시 클래스 생성 코드 사용 시 클래스명에는 메서드를 부여해준 주 클래스의 이름을 넣는다
		// sysout()에 들어갈 명칭 역시 변수이름은 인스턴스 변수, 주 메소드의 변수(?)를 넣어서 완성
}
