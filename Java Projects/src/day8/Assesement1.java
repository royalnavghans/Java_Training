/*Create a class called Book to represent a book.
 *  A Book should include four pieces of information as instance variables‐a book name, an ISBN number, 
 *  an author name and a publisher. Your class should have a constructor that initializes the four instance variables. 
 *  Provide a setter method and getter method (query method) for each instance variable. Inaddition, 
 *  provide a method named getBookInfo that returns the description of the book as a String
 *   (the description should include all the information about the book). 
 *   You should use this keyword in member methods and constructor. 
 *   Write a test application named BookTest to create an array of object for 30 elements for class Book
 *    to demonstrate the class Book's capabilities.
 * 
 */




package day8;
class Book{
	String bookName;
	String autherName;
	long ISBNnumber;
	String publisher;
	
Book(String bookName,String autherName,long ISBNnumber,String publisher){
	this.bookName=bookName;
	this.autherName=autherName;
	this.ISBNnumber=ISBNnumber;
	this.publisher=publisher;
}

public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}

public String getAutherName() {
	return autherName;
}

public void setAutherName(String autherName) {
	this.autherName = autherName;
}

public long getISBNnumber() {
	return ISBNnumber;
}

public void setISBNnumber(long iSBNnumber) {
	ISBNnumber = iSBNnumber;
}

public String getPublisher() {
	return publisher;
}

public void setPublisher(String publisher) {
	this.publisher = publisher;
}
 public void getBookInfo() {
	 System.out.println("Book Name : "+bookName+ " Auther Name : "+autherName+" ISBN Number : "+ISBNnumber+" Pubisher : "+publisher);
	 
 }
}
public class Assesement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] BookTest=new Book[30];
		BookTest[1]= new Book("Jungle World", "SriHari", 8568795, "Rajesh Sir");
		
		for(int i=1;i<30;i++) {
			BookTest[1].getBookInfo();
		}

	}

}
