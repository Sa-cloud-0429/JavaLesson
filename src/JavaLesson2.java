import java.time.LocalDate;
import java.util.Scanner;

//問題１
public class JavaLesson2 {
	public static void main(String[] args) {
		int num= 10;
		System.out.println(num);
	

//問題２
		int a= 8;
		int b= 5;
		int sum= a+b;
		System.out.println(sum);

//問題３
		int width=7;
		int height=4;
		int area= width*height;
		System.out.println(area);

//問題４
		String str="Java";
		double d=17.0;
		boolean boo=true;
		System.out.println(str);
		System.out.println(d);
		System.out.println(boo);
		
//問題５
		Scanner scanner = new Scanner(System.in);
		System.out.print("あなたの名前を入力してください:");
		String name = scanner.nextLine();
		System.out.println("こんにちは「" + name + "」さん！");

	
		
//問題６
		String name2 = "sakura";
		int in = 22;
		LocalDate birthday = LocalDate.of(2002, 4, 29);
		System.out.println("名前：" + name2 + ", 年齢:" + in + ",誕生日:" + birthday );
	
//問題７
		System.out.print("商品の名前を入力してください");
		String productName = scanner.nextLine();
		
		System.out.print("商品の価格（円）を入力してください");
		 int price = scanner.nextInt();
		 
		 System.out.print("購入する個数を入力してください");
		 int quantity = scanner.nextInt();
		 
		 int total = price * quantity;
		  
		 System.out.println("商品:" +productName +"は価格:" +price +"円なので" +quantity +
				 "個買うと" +total+"円です。");
		 
		 scanner.close();
		 
		 for( int j = 1; j<=10; j++) {
				System.out.println(j);
				for ( int k =10; k<=20; k++) {
					System.out.println(k);
				}
		 
		 }
	}
}


