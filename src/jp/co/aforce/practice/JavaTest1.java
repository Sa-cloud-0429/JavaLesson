package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.List;

public class JavaTest1 {
	public static void main(String[]args) {
		List<String>fruitList = new ArrayList<String>();
		fruitList.add("リンゴ");
		fruitList.add("バナナ");
		fruitList.add("さくらんぼ");
		
		System.out.println("最初のリスト："+fruitList);
		
		fruitList.remove("バナナ");
		fruitList.add("オレンジ");
		System.out.println("変更後のリスト:"+fruitList);
		
		
		
		
				
	}

}
