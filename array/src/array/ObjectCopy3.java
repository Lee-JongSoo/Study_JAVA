package array;

public class ObjectCopy3 {
    public static void main(String[] args){
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백 산맥", "조정래");
        bookArray1[1] = new Book("데미안", "헤르만 해세");
        bookArray1[2] = new Book("개미", "베르나르 베르베");

        bookArray2[0] = new Book();
        bookArray2[1] = new Book();
        bookArray2[2] = new Book();

        for(int i=0; i<bookArray1.length; i++){
            bookArray2[i].setBookName(bookArray1[i].getBookName());
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
        }

        for (Book book2 : bookArray2){
            book2.showBookInfo();
        }

        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서");

        System.out.println("====bookArray1====");
        for(Book book : bookArray1){
            book.showBookInfo();
        }

        System.out.println("====bookArray2====");
        for(Book book : bookArray2){
            book.showBookInfo();
        }
    }
}
