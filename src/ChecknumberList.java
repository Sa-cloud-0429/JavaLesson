import java.util.ArrayList;
import java.util.List;


public class ChecknumberList {
	public static void main(String[] args) {
		List<String> numlist = new ArrayList<String>();

		int number = 5;
		if (number >= 10) {
			numlist.add("large");
		} else {
			numlist.add("small");
		}
		System.out.println(numlist);
	}
}
