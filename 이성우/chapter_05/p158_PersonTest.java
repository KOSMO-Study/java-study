package chapter_05;

public class p158_PersonTest {

    public static void main(String[] args) {        /*
                                                     * 생성자의 역할은,
                                                     * 
                                                     * 인스턴스 변수의 초기화.  
                                                     * 
                                                     * 여러가지 생성자를 제공하면,
                                                     * 
                                                     * 이 클래스를 사용하여 인스턴스를 만드는 경우,
                                                     * 
                                                     * 필요한 생성자를 골라서 사용 가능. 
                                                     */
        
        // p157_Person 클래스를 사용하는 p158_PersonTest 클래스에서 구현.
        
        // 디폴트 생성자를 사용한경우 
        // 매개변수가 있는 생성자를 사용한 경우.
        // 두가지를 아래에서 만들었다.
        
        // 디폴트 생성자를 사용한 경우.
        p157_Person personKim = new p157_Person( );         // new 예약어로 생성자 p157_Person 을 호출하여 새로운 클래스 생성
                                                            // 클래스형 변수이름(참조변수) personKim 선언하여 new예약어로 생성자를 호출하여 대입.
                                                            // = (같은뜻)
                                                            // p157_Person 클래스 자료형으로 참조변수 personKim 선언하고, new p157_Person( ); 로 
                                                            // p157_Person 클래스를 생성하여 참조변수 personKim 에 대입. 
                                                            // personKim 은 클래스형 변수이름이자, [참조변수], 이 변수가 생성된 인스턴스를 가리킨다.
        // 인스턴스 변수값을 대입과 동시에 초기화.
        personKim.name = "김유신";                           // 인스턴스변수 personKim.name 에 "김유신" 을 대입.        
        
        personKim.weight = 85.5F;                           // 인스턴스변수 personKim.weight 에 값 85.5F 을 대입. 
                
        personKim.height = 180.0F;                          // 인스턴스변수 personKim.height 에 값 180.0F 을 대입. 
        
        
        
        // 매개변수가 있는 생성자를 사용.
        // 인스턴스 변수 초기화와 동시에 클래스 생성.
        p157_Person personLee = new p157_Person("이순신", 175, 75);    // 매개변수가 있는 생성자를 사용.
                                                                       // 매개변수가 있는 생성자는
                                                                       // 생성자 내부에서 변수를 초기화 할 수 있도록 구현되어 있다.
                                                                       // 매개변수에 "이순신", 175, 75 을 대입.
                                                                       // p157_Person.java 에서 매개변수가 있는 생성자 구현.
                                                                       
        // 각각 다른 생성자를 사용하여 대입한 각각의 인스턴스 변수값을 확인.                                                                
        System.out.println("name값 확인 : " + personKim.name + " / " + personLee.name);             
        System.out.println("weight값 확인 : " +personKim.weight + " / " + personLee.weight);       

        /*
         * [멤버 변수]를 외부 클래스에서 값을 지정하지 못하는 경우가 있다.
         * 
         * [매개변수]가 있는 생성자를 구현하고 이를 사용하는것이 편리하다.
         */
    }

}
