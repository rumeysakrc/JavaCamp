package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 32;
		int sayi3 = 29;
		
		int buyuk = sayi1;
		
		if (buyuk<sayi2) {
			buyuk = sayi2;
		}
		
		if (buyuk<sayi3) {
			buyuk = sayi3;
		}
		System.out.println("En buyuk:"+buyuk);

	}

}
