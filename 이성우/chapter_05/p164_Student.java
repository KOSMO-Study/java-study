package chapter_05;

public class p164_Student {
    
    
    int studentID;
    
    private String studentName;     // studentName 변수를 private로 선언.
                                    // p163_StudentTest 클래스에서 사용 할 수 없다.
    
    int grade;
    String address;
    
    /*
     * <get(), set() 메서드>
     * 
     * private로 선언한 studentName 변수 외부에서 사용하게 하려면?
     * 
     * public 메서드를 통해서 사용가능하도록 해야 한다.
     * 
     * public 메서드를 제공하지 않으면 외부에서 studentName 변수에 접근할 방법은 없다.
     * 
     * get(), set() 메서드를 통해서 접근하도록 해준다.
     * 
     */
    
    
    /*
     * <Tip>
     * 
     * 직접 get(), set() 코드를 작성해도 되지만,
     * 
     * 이클립스에서 Source -> Generate Getters and setters.. 메뉴를 사용할 수 있다.
     * 
     */
    
    public String getStudentName() {                        // get() 메서드를 통해
                                                            // private 변수인 studentName 에 접근해서,
                                                       
        return studentName;                                 // studentName 변수의 값을 가져온다.
    }
    
    public void setStudentName(String studentName) {        // set() 메서드를 통해
                                                            // private 변수인 studentName 에 접근해서,
      
        this.studentName = studentName;                     // 매개변수로 받아온 값을 this.studentName 에 대입한다.
                                                            // 즉, 값을 지정해준다.
    }
    
    

}
