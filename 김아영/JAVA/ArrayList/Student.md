### > 07 - 4 배열 응용 프로그램 p226
[Student 클래스]

```java
package arrayList;

import java.util.ArrayList;

public class Student {
	int studentId;
	String studentName;
	ArrayList<Subject> subjectList;

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); // 학생인스턴스가 생성 될 때 마다 ArrayList클래스도 함께 만들어줌.

	}

	public void addSubject(String name, int score) { // 과목이 생길 때마다 subjectList에 추가해주는 메소드.
		Subject subject = new Subject(); // 먼저 여러 과목을 위해 Subject 인스턴스를 생성해준다.
		subject.setSubjectName(name); // 생성된 인스턴스에 과목의 이름과 성적을 입력해주는 메소드 .
		subject.setScorePoint(score);
		subjectList.add(subject); // subjectList에 과목이 생성될 때마다 추가해주는 ArrayList클래스의 메소드 p222 참고.
	}

	public void showStudentinfo() {// 배열요소 출력 + 총점 출력하는 메소드 만들기.
		int total = 0;
		for (Subject sub : subjectList) { // 향상된 for문과 배열 p218 참고
			// (int i = 0; i < subjectList.size; i++) 위와 같은 문장이다 여기서 길이를 legth를 사용하지 않고
			// size를 사용한 것은 subjectList가 ArrayList클래스를 사용했기 때문이고, ArrayList클래스의 배열 전체개수
			// 반환메소드가 size이기 때문이다.
			total = total + sub.getScorePoint();
			System.out.println(
					"학생" + studentName + "의 " + sub.getSubjectName() 
					+ "과목의 성적은 " + sub.getScorePoint() + "입니다.");
		}
		System.out.println("학생" + studentName + "의 총점" + total + "입니다.");
	}
}
```
