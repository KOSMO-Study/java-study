package chapter_05;

public class p162_Student {
    
    /*
     * <접근제어자>
     * 
     * 예약어를 사용해 클래스 내부의 변수, 메서드, 생성자에 대한 접근 권한을 지정.
     * 
     * public 예약어를 사용하면 외부 클래서에서 접근이 가능하고,
     * 외부클래스가 사용할 수 있다.
     * 
     * private 예약어를 사용하면 외부 클래스에서 사용 할 수 없다.
     */
    
    int studentID;
    private String studentName;     // studentName 변수를 private로 선언.
                                    // p163_StudentTest 클래스에서 사용 할 수 없다.
    
    int grade;
    String address;
    
    public String getStudnetName() {
        return studentName;
    }
    
    public void setStudentName(String studnetName) {
        this.studentName = studentName;
    }

}
