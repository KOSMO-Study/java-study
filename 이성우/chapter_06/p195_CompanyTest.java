package chapter_06;

public class p195_CompanyTest {

    public static void main(String[] args) {

        p194_Company myCompany1 = p194_Company.getInstance();   // 클래스 이름으로 getInstance() 메서드 호출하여 
                                                                // 참조변수 myCompany1 에 대입
        
        p194_Company myCompany2 = p194_Company.getInstance();   // 클래스 이름으로 getInstance() 메서드 호출하여 
                                                                // 참조변수 myCompany2 에 대입
        
        
        System.out.println(myCompany1 == myCompany2);           // 두 변수의 주소값이 같은지 비교. true false 반환.  
        
        /*
         * 같은 참조값을 가지는 동일한 인스턴스를 비교한 것이다.
         * 
         * n번을 비교해도 항상 같은 주소의 인스턴스가 반환된다. 
         * 
         * static을 사용하여 유일한 객체생성을 하는것이 싱글톤 패턴이다.  
         */
    }

}
