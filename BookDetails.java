package oopsAssignment;

import java.util.Scanner;

class Book{
	private int bookNo;
	private String Title;
	private String author;
	private float price;
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
class EngineeringBook extends Book{
	private String Category;

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}
	
}
public class BookDetails {

	public static void main(String[] args) {
		Book b=new Book();
		EngineeringBook eb=new EngineeringBook();
		
		b.setBookNo(1);
		b.setAuthor("Anurupam");
		b.setPrice(1000);
		b.setTitle("Logical Skills");
		System.out.println("Book no:"+b.getBookNo());
		System.out.println("Author Name:"+b.getAuthor());
		System.out.println("Title:"+b.getTitle());
		System.out.println("Price"+b.getPrice());
		eb.setCategory("1");
		System.out.println("category"+eb.getCategory());
		
		
		

	}

}
