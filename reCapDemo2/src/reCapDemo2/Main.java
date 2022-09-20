package reCapDemo2;

public class Main {

	public static void main(String[] args) {

		// double[] myList = new double [4]; same
		double[] myList = { 1.2, 2.3, 3.4, 4.5 };
		
		double total = 0;
		double enBuyuk = myList[0];

		for (double number : myList) {
			
			if (enBuyuk < number) {
				enBuyuk = number;
			}
			total = total + number;
			System.out.println(number);
		}

		System.out.println("Toplam= " + total);
		System.out.println("En Buyuk Sayi= " + enBuyuk);

	}

}
