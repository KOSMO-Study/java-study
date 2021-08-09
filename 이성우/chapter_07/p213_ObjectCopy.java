package chapter_07;

public class p213_ObjectCopy {

    public static void main(String[] args) {

        p207_Book[] bookArray1 = new p207_Book[3];
        p207_Book[] bookArray2 = new p207_Book[3];
        
        
        
        bookArray1[0] = new p207_Book("태백산맥", "조정래");
        bookArray1[1] = new p207_Book("데미안", "헤러만헤세");
        bookArray1[2] = new p207_Book("어떻게 살 것인가", "유시민");
        
        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
        
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
        
        System.out.println("============== 아래는 bookArray1 ===============");
        
        
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }
                

    }

}
