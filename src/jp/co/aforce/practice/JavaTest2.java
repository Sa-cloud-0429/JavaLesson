package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaTest2 {
	public static void main(String[]args) {
		Scanner scanner =new Scanner(System.in) ;
		System.out.println("商品の単価を入力してください");
		int price = scanner.nextInt();
		System.out.println("購入個数を入力してください");
		int a =scanner.nextInt();
		int result = ( price * a );
		System.out.println("割引前の合計金額"+result+"円");
		
		If (result >= 5000) {
			
		
		
			
		}
		

	}

	
}

//System.out.println("整数入力");
//int number1 = scanner.nextInt();
//
//if (number1 > 0) {
//	System.out.println("正");
//} else if (number1 < 0) {
//	System.out.println("負");
//} else {
//	System.out.println("0");
//
//}

//System.out.println("年齢を入力してください");
//int age = scanner.nextInt();
//String result = Fee(age);
//System.out.println(result);
//}
//public static String Fee(int age) {
//if (age <= 12) {
//	return "入場料無料";
//} else if (age >= 13 && age <= 59) {
//	return "入場料1000円";
//} else if (age >= 60) {
//	return "入場料500円";
//} else {
//	return "Invaild age";
//
//}
