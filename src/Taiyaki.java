
public class Taiyaki {

	String filling;

	public void setFilliing(String value) {
		filling = value;
	}

	public void showFilling() {
		System.out.println("このたい焼きの中身は:" + filling + "です。");
	}

	public static void main(String[] args) {
		Taiyaki taiyaki1 = new Taiyaki();

		taiyaki1.filling ="あんこ";
		taiyaki1.showFilling();
		
		Taiyaki taiyaki2 = new Taiyaki();
		
		taiyaki2.filling="クリーム";
		taiyaki2.showFilling();
	
	}
}
