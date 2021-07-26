package reference;

public class Student1 {

	int studentID;
	String studentName;		// String 작성 시 앞에 반드시 대문자로 할 것
	int koreaScore;
	int mathScore;
	String koreaSubject;	// 과목 이름 변수 추가
	String mathSubject;		// <예>성적을 저장하는 두 개의 과목의 이름도 함께 저장해야 할 때,
}							// String을 사용하여 과목이름변수까지 추가 가능.
							// 그러나 과목에 대한 변수가 계속 늘어나므로 문제 해결을 위해 
							// 과목 이름과 성적을 subject라는 클래스로 분리하고, 학생에 subject뱐수를
							// 각 과목별로 추가할 예정