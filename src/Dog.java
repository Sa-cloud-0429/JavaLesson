

public class Dog extends Animal {
	@Override
	public void makesound() {
		System.out.println("犬の鳴き声はわんわん");
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		Animal animal3 = new Animal();
		
		animal1.makesound();
		animal2.makesound();
		animal3.makesound();
		
		
	}

}
