package jp.co.aforce.practice;

import java.util.Random;

public class PracticeTest5 {
	public static void main(String[]args) {
		/*----問1---*/
		Random random=new Random();
		int fortune = random.nextInt(4);
		String result ="";
		switch (fortune) {
		case 1:
			result = "吉です";
			break;
		case 2:
			result = "中吉です";
			break;
		case 3:
			result = "大吉です";
			break;
		case 4:
			result = "凶です";
			break;	
		}
		System.out.println(result);
		
		/*----問2--*/
	}
}
