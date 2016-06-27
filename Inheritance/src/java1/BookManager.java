package java1;

public class BookManager {
	
	
	public static void printBooks(Book[] bks)
	{
		for(Book bk :bks)
		{
			System.out.println(bk);
			System.out.println("Discount :="+findDiscount(bk.getPrice()));
		}
	}

	

/*
* Auto Boxing
*/

public static  double findDiscount(Double price)
{
	return price *.10;
}

}
