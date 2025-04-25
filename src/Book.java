
public class Book {

	String info;

	public void setInfo(String value) {
		info = value;
	}

	public void showInfo() {
		System.out.println("この本の" + info + "です。" );
	}

	public static void main(String[]args) {
		Book book1 = new Book();
		
		book1.info ="タイトルはあいうえお";
		book1.showInfo();
		
		Book book2 = new Book();
		
		book2.info ="著者は山田";
		book2.showInfo();
		
		Book book3 = new Book();
		
		book3.info ="価格は２０００円";
		book3.showInfo();
		
		
	}
}
