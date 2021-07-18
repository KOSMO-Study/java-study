package chapter_05;

public class p157_Person {     
    

    String name;            // String 형 변수 name 선언      //멤버변수
    float height;           // float 형 변수 height 선언     //멤버변수
    float weight;           // float 형 변수 weight 선언     //멤버변수
     
    public p157_Person( ) { }     // 디폴트 생성자 직접 추가
    
    public p157_Person(String pname) {      // 이름을 매개변수로 입력받아서 Person클래스를 생성하는 생성자
                                            // String형 매개변수 pname 지정.
       
        name = pname;                       // pname을 매개변수로 입력받아 변수 name에 대입. 
    }

    public p157_Person(String pname, float pheight, float pweight){     // 이름, 키, 몸무게를 매개변수로 입력받는 생성자.
        
        name = pname;               // pname을 매개변수로 입력받아 멤버변수 name에 대입.
        
        height = pheight;           // pheight를 매개변수로 입력받아 멤버변수 height에 대입.
        
        weight = pweight;           // pweight를 매개변수로 입력받아 멤버변수 weight에 대입.
        
        
        /*
         * <생성자 오버로드>
         * 
         * 클래스에 생성자가 두개 이상 제공되는 경우 = [생성자오버로드]라고 한다.
         * 
         * 필요에 따라 매개변수가 다른 생성자를 여러개 만들 수 있다.
         * 
         * 클래스에 생성자를 여러개 만들면,
         * 원하는 생성자를 선택해서 사용 가능.
         * 
         */
        
        
    }


}
