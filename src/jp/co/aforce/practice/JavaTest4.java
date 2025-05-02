package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.List;

public class JavaTest4 {
	public static void main(String[]args) {
	
		List<BookDate> bookdates = new ArrayList<BookDate>();
		bookdates.add(new BookDate("Phython入門","山田太郎",1500,2500));
		bookdates.add(new BookDate("データ分析の基礎","鈴木花子",1200,3000));
		bookdates.add(new BookDate("AI技術最前線","佐藤一郎",800,4000));
		bookdates.add(new BookDate("webデザイン講座","田中美咲",2000,2000));
		bookdates.add(new BookDate("初めての機械学習","中村健一",900,3500));
		
		int info=0;
		for(BookDate date : bookdates) {
			int subInfo = date.info();
			info +=subInfo;
		}
		System.out.println("本の情報"+info);
		
	}

}
