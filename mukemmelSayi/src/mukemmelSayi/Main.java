package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int number = 496;
		int total = 0;

		if (number < 1) {
			System.out.println("Geçersiz Sayi");
			return;
		}

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}
		if (total == number) {
			System.out.println("Mukemmel sayidir.");
		} else {
			System.out.println("Mukemmel sayi degildir.");
		}
	}

}
