package classpart;

public class StudentTest2 {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.studentName = "안현수";
		
		Student student2 = new Student();
		student2.studentName = "안수현";
		
		System.out.println(student1);	//참조 변수 값 출력
		System.out.println(student2);
	}

}
