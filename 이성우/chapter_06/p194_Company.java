package chapter_06;

public class p194_Company {
    
    /*
     * <싱글톤 패턴>
     * 
     * 인스턴스를 하나만 구현.
     * 
     * 인스턴스를 단 하나만 생성하는 디자인 패턴을 싱글톤 패턴이라고 한다.  
     * 
     */

    private static p194_Company instance = new p194_Company();  // 하나의 인스턴스 생성.
                                                                // private로 외부에서 접근하지 못하도록 제안.  
    
    
    
    private p194_Company() {}   // private 접근제어자를 지정하여 생성자를 만든다.
                                // 외부클래스에서 마음대로 인스턴스를 생성할 수 없다. 
                                // p194_Company 클래스 내부에서만 이 클래스의 생성을 제어 할 수 있다.
        
    public static p194_Company getInstance() {      // 외부에서 사용가능하도록 public 메서드 생성.
                                                    // 인스턴스 생성과 상관없이 호출 가능하게 하기 위해 static 으로 선언.
        
        if(instance == null) {
            instance = new p194_Company();
        }
        return instance;                            // 생성한 인스턴스 반환.
    }
    
    
}
