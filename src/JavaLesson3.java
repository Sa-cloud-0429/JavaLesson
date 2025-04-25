import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaLesson3 {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		Map<String,Integer>nameMap = new HashMap<>();
		
		nameMap.put("りんご",100);
		nameMap.put("みかん",80);
		nameMap.put("バナナ",120);
		nameMap.put("いちご",300);
		System.out.println(nameMap);
		
		System.out.println("果物の名前を入力してください");
		String text = scanner.next();
		
		Integer value = nameMap.get(text);
		
	
		
		if (value == null) {
			System.out.println("申し訳ありませんが、その商品は取り扱っていません");
		}else {
			System.out.println(value +"円");
			
		scanner.close();
		}
	}
}
	

