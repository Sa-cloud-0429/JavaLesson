import java.util.ArrayList;

public class JavaLesson0424 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 5) {
			System.out.println("iの値:" + i);
			i++;
		}
		
		i = 0;
		do {
			System.out.println("iの値:" + i);
			i++;
		}while (i < 5);
		
		i = 5;
		while(i < 5) {
			System.out.println("iの値:" + i);
			i++;
		}
		
		i= 5;
		do {
			System.out.println("iの値:" + i);
			i++;
		}while (i < 5);
		
		for( int j = 1; j<=10; j++) {
			System.out.println(j);
			for ( int k =1; k<=10; k++) {
				System.out.println(k);
			}
		}
		
		ArrayList<String>employees = new ArrayList<>();
		employees.add("田中太郎");
		employees.add("山田花子");
		employees.add("佐藤次郎");
		
		for(String employee:employees) {
			System.out.println(employee);
		}
	
	}
}


