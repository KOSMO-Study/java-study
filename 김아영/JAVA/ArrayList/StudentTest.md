[StudentTest 클래스]

```java
package arrayList;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student(1001, "김아영");
		student1.addSubject("국어", 100);
		student1.addSubject("수학", 100);
		student1.addSubject("영어", 100);

		Student student2 = new Student(1002, "김효영");
		student2.addSubject("사회", 50);
		student2.addSubject("과학", 50);

		student1.showStudentinfo();
		student2.showStudentinfo();
	}
}
```
