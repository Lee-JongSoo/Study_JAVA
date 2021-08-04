package interfaceex;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("fuck you");
		shelfQueue.enQueue("fuck you fuck you");
		shelfQueue.enQueue("fuck you fuck you fuck you");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}
