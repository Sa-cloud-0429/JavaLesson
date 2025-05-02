package jp.co.aforce.practice;

public class BookDate{
	private String bookname;
	private String author;
	private int number;
	private int	price;
	
	public BookDate(String bookname,String author,int number,int price) {
		this.bookname =bookname;
		this.author=author;
		this.number = number;
		this.price=price;
	}
	
	public String getBookName() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname =bookname;
	}
	public String getauthor() {
		return author;
	}
	public void setauthor(String author) {
		this.author =author;
	}
	public int getnumber() {
		return number;
	}
	public void setnumber(int number) {
		this.number =number;
	}
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price =price;
	}
	
	
	
	

}
