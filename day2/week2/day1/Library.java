package week2.day1;

public class Library {

		public String addBook(String bookTitle)
		{
			System.out.println("Book added successfully");
			return bookTitle;
		}
		
		 void issueBook()
		 {
		 
		 System.out.println("Book issued successfully");

	}

public static void main(String[] args)

{
	Library lb = new Library();
	System.out.println(lb.addBook("StarWars"));
	lb.issueBook();
}
}


