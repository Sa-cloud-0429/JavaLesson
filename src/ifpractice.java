
public class ifpractice {
	public static void main(String[] args) {
		int a = 50;
		int b = 50;
		if (a == b) {
			System.out.println("aとbの値は同じ");
		}

		boolean isRainy = true;
		if (isRainy) {
			System.out.println("傘を持っていきましょう。");
		}
		
		boolean isSuny = false;
		if (isSuny) {
			System.out.println("傘を持っていきましょう。");
		}

		int temperature = 25;
		if (temperature >= 30) {
			System.out.println("真夏日です。");
		} else {
			System.out.println("真夏日ではありません。");
		}

		int score = 75;
		if (score >= 80) {
			System.out.println("優");
		} else if (score >= 70) {
			System.out.println("良");
		} else {
			System.out.println("不可");
		}

		int time = 14;
		boolean isHoliday = false;

		if (time >= 9 && time <= 18 && !isHoliday) {
			System.out.println("勤務時間内です。");
		} else {
			System.out.println("勤務時間外です。");
		}
		
		boolean hasLicense = true;
		boolean hasCar = true;
		
		if(hasLicense) {
			System.out.println("運転免許を持っています。");
			if(hasCar) {
				System.out.println("車を持っています。");
			}else {
				System.out.println("しかし、車は持っていません。");
			}
		}else {
			System.out.println("運転免許を持っていません。");
		}
		
		String color ="yellow";
		String message;
		switch (color){
			case "red":
				message = "停止してください。";
				break;
			case "yellow":
				message = "注意してください。";
				break;
			case "green":
				message = "進んでください。";
				break;
			default:
				message = "不正な信号の色です。";
			}
		System.out.println("現在の信号:" + color + "-" + message);
		}
		
		
		
	}


