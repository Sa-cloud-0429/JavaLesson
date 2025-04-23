import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListSample {
	
	public static void main(String[] args) {
		List<String>fruitsList = new ArrayList<String>();
		fruitsList.add("apple");
		fruitsList.add("potato");
		System.out.println(fruitsList);
		
		fruitsList.add(1,"grape");
		fruitsList.add(1,"peach");
		System.out.println(fruitsList);
		
		String element1 = fruitsList.get(0);
		System.out.println("0:"+ element1);
		String element2 = fruitsList.get(2);
		System.out.println("2:" + element2);
		
		fruitsList.remove(3);
		System.out.println(fruitsList);
		fruitsList.remove("peach");
		System.out.println(fruitsList);
		
		
		
		
		
	}
}
