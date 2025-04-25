import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class matome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();
		scores.add(85);
		scores.add(92);
		scores.add(78);
		scores.add(65);
		scores.add(98);
		scores.add(70);

		int count = 0;

		for (Integer score : scores) {
			if (score >= 70) {
				count++;
			}

		}
		System.out.println("70点以上の得点の数は" + count + "個です。");
		scanner.close();

		Map<String, String> nameMap = new HashMap<>();

		nameMap.put("国名：日本", "首都：東京");
		nameMap.put("国名：アメリカ", "首都：ワシントンンD.C");
		nameMap.put("国名：フランス", "首都：パリ");
		nameMap.put("国名：中国", "首都：北京");
		for(String name:nameMap.keySet()) {
			String value=nameMap.get(name);
			System.out.println(name + "  "+value);
			
		}
	
		

	}
}
