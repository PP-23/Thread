package java1;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Book bk = new Book(101, "Head First Java",350.00);
		
		System.out.println(bk);
		
		
		Book[] bks = new Book[2];
		Book b1 = new Book(102,"Maths",100);
		Book b2 = new Book(103,"Physics",200);
		bks[0] = b1;
		bks[1] =b2;
		 BookManager.printBooks(bks);
		 
		// BookManager mgr = new BookManager();
	     //mgr.printBooks(bks);
		
	}

}
