package chapter_07;

public class p208_BookArray {  

    public static void main(String[] args) {


        p207_Book[] library = new p207_Book[5];         // p207_Book 클래스형으로 library 객체배열 생성.  
                                        
                                                        /*
                                                         * 인스턴스를 생성하면, 인스턴스를 가리키는 주소값이 있다.
                                                         * 
                                                         * 각각의 p207_Book 인스턴스 주소값을 담을 공간 5개를 생성하는 것이다.
                                                         * 
                                                         * p207_Book 주소값을 담을 공간이 5개 만들어지고, 자동으로 null 값으로 초기화 된다.
                                                         * 
                                                         */
        
        for (int i = 0; i < library.length; i++) {      // 반복문으로 library 길이만큼 반복.
            
            System.out.println(library[i]);             // library[i] 출력.  
        }
    }

}
