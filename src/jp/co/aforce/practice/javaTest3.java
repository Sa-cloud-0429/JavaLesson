package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.List;

public class javaTest3 {
	public static void main(String[]args) {
		List<String>Id = new ArrayList<String>();
		Id.add("TASK001");
		Id.add("TASK002");
		Id.add("TASK003");
		Id.add("TASK001");
		Id.add("TASK004");
		Id.add("TASKU002");
		String[]array1 = new String[Id.size()];
		Id.toArray(array1);
		System.out.println("処理済みのタスクID一覧");
		for (String element:array1) {
			System.out.println("-"+element);
			
		Id contains=Id;
		}
		
		
	}

}


