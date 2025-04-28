package jp.co.aforce.practice;

import java.util.Arrays;
import java.util.Calendar;

public class PracticeTest4 {
	public static void main(String[] args) {
		/*----問2---*/
		String[] animal = { "犬", "猫", "うさぎ", "へび" };
		System.out.println(Arrays.toString(animal));

		/*----問3---*/
		String animalName = "うさぎ";
		String msg = "はリストに含まれない";
		for (int i = 0; i < animal.length; i++) {
			if (animal[i].equals(animalName)) {
				msg = "はリストに含まれています";
				System.out.println(animalName + msg);
			}
			
		}
		
		/*----問4---*/
		Calendar calender = Calendar.getInstance();
		int month = calender.get(Calendar.MONTH)+1;
		String message = "";
		System.out.println(month);
		
		switch(month){
			case 1:
				message = "冬物セール";
				break;
			case 2:
			case 3:
			case 4:
				message = "春物を売る";
				break;
			case 5:
				message = "春物セール";
				break;
			case 6:
			case 7:
				message = "夏物を売る";
				break;
			case 8:
				message = "夏物セール";
				break;
			case 9:
				message = "秋物を売る";
				break;
			case 10:
			case 11:
			case 12:
				message = "冬物を売る";
				break;
			default:
		System.out.println(message);	
		}	
							
	}

}
