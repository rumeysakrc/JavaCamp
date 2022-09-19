package intro;

public class Main {
	//main javada başlangıç noktasıdır
	public static void main(String[] args) {
		System.out.println("Hello World!");

		
		//değişken isimlendirmeleri javada camelCase yazılır.
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		
		//integer=tam sayı
		int vade = 12;
		
		double dolarDun = 18.15;
		double dolarBugun = 18.15;
		
		//true veya false kullan
		boolean dolarDustuMu = false;

		String okYonu = "";
		
		if (dolarBugun<dolarDun) { //true
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun>dolarDun)  {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		//array
		
		String[] krediler = {"Hızlı Kredi", "Maaşını Halkbanktan","Mutlu Emekli"};
		
		//System.out.println(krediler[0]);
		//System.out.println(krediler[1]);
		//System.out.println(krediler[2]);
		
		//sıfırdan başla, length boyunca uygula ,i++ şeyle aynı i=i+1
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
		
	}

}
