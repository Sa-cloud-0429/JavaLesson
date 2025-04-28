package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeTest3 {
	public static void main(String[]args) {
		/*----問1--*/
	List<String>Lists = new ArrayList<String>();
	Lists.add("シャープペンシル");
	Lists.add("ボールペン");
	Lists.add("リングノート");
	Lists.add("クリップ");
	Lists.add("消しゴム");
	System.out.println(Lists);
	
	/*----問2--*/
	String element1 = Lists.get(1);
	System.out.println(element1);
	
	/*----問3--*/
	ArrayList<String> name = new ArrayList<>();
	name.add("山田太郎");
	name.add("鈴木花子");
	name.add("佐藤次郎");
	name.add("山田太郎");
	name.add("高橋三郎");
	System.out.println(name);
			
	
	/*----問５--*/
	System.out.println(name.get(2));
	/*----問６--*/
	ArrayList<Integer>list= new ArrayList<>();
	list.add(10);
	list.add(15);
	list.add(16);
	list.add(19);
	list.add(11);
	list.add(12);
	list.add(18);
	list.add(20);
	
	Collections.sort(null); 
	System.out.println(list);
	
 }

}
