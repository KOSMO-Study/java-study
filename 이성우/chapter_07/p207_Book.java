package chapter_07;

public class p207_Book {              // 책이름과 저자를 멤버변수로 가지는 클래스.  

    private String bookName;
    private String author;
    
    public p207_Book() {}           // 디폴트 생성자.
    
    
    public p207_Book(String bookName, String author) {      // 책이름과 저자를 매개변수로 받는 생성자.
        
        this.bookName = bookName;                           // 인스턴스의 bookName 변수에 bookName 매개변수 값을 대입.
        this.author = author;                               // 인스턴스의 author 변수에 author 매개변수 값을 대입.
    }
    
    public String getBookName() {                           // bookName 을 리턴하는 getBookName() 메서드 구현.
        return bookName;
    }
    
    public void setBookName(String bookName) {              // bookName 을 매개변수로 받아 인스턴스의 bookName 에 대입하여 
                                                            // 책이름을 설정하는 setBookName() 메서드 구현
        this.bookName = bookName;
    }
    
    public String getAuthor() {                             // 저자 이름을 리턴하는 getAuthor() 메서드 구현
        return author;
    }
    
    public void setAuthor(String author) {                  // 저자 이름을 설정하는 setAuthor() 메서드 구현.
        this.author = author;
    }
    
    public void showBookInfo() {                            // bookName 과 author 의 값을 출력하는 showBookInfo() 메서드 구현.  
        System.out.println(bookName + " , " + author);
    }
}
