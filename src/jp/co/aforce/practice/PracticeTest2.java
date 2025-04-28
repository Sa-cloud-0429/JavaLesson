package jp.co.aforce.practice;

import java.util.Scanner;

public class PracticeTest2 {
	public static void main(String[] args) {
		/*----問1---*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("消費税率入力");
		double number = scanner.nextDouble();
		final double TAX_NUMBER = number;
		System.out.println("消費税率:" + TAX_NUMBER);
		

		/*----問2---*/
		int x = 480;
		double price = (x + TAX_NUMBER);
		System.out.println("値段：" + price);


		/*----問3---*/
		System.out.println("名前入力してください");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("私の名前は" + name +"です。");
		scanner.close();
		
		/*----問4---*/
		String name2 = "この商品の値段は";
		String name3 = "円です";		
		System.out.println(name2 + x +name3);
		
		
	}
}
