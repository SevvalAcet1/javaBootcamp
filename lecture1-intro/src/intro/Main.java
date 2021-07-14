package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		String internetSubeButonu ="İnternet Subeye gir";
		double dolarDun =8.20;
		double dolarBugun =8.20;
		int vade = 36;
		boolean dustuMu =false;
				
		
		System.out.println("Hello world");
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düştü resmi");
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		}else {
			System.out.println("Dolar değişmedi resmi");
		}
		
		
		String[] krediler={"Hızlı Kredi",
				            "Mutlu emekli Kredisi",
				            "Konut Kredi",
				            "Çiftçi Kredisi",
				            "Meb Kredisi"
				             };
		
		for (String string : krediler) {
			System.out.println(string);
		}
		
		int sayi1 =10;
		int sayi2 =20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1 );
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
		
		String sehir1 ="Ankara";
		String sehir2 ="İstanbul";
		sehir1=sehir2;
		sehir2 ="İzmir";
		System.out.println(sehir1);
		
		
		
		
		
		
	}

}
