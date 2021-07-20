package array;

public class ObjectCopy2 {
    public static void main(String[] args){
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백 산맥", "조정래");
        bookArray1[1] = new Book("데미안", "헤르만 해세");
        bookArray1[2] = new Book("개미", "베르나르 베르베");
        System.arraycopy(bookArray1, 0, bookArray2,0,3);

        for(Book book : bookArray2){
            book.showBookInfo();
        }

        System.out.println("====bookArray1====");
        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서");
        for(Book book : bookArray1){
            book.showBookInfo();
        }

        System.out.println("====bookArray2====");
        for(Book book : bookArray2){
            book.showBookInfo();
        }
    }
}
