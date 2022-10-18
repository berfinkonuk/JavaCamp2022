package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		//220-284 bilinen en küçük arkadaş sayıdır
		//Kendileri hariç pozitif tam bölenleri birbirine toplamı biirbirine eşit olan sayılardır
// 1 den başlayıp 220 ye kadar 220 yi bölen 220 dahil değil tüm sayıların toplamı 284 ü veren ve 
//yine 1 den başlayıp 284e kadar 284ü bölen 284 dahil değil tüm sayıların toplamı 220yi veren sayılardır

		int sayi1 = 220;
		int sayi2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;
		
		for(int i=1;i<sayi1;i++) {
			if(sayi1%i == 0) {
				toplam1 = toplam1 +i;
			}
		}
		for(int i=1;i<sayi2;i++) {
			if(sayi2%i == 0) {
				toplam2 = toplam2 +i;
			}
		}
		if(sayi1==toplam2 || sayi2==toplam1) {
			System.out.println("Bu iki sayı arkadaştır.");
		} else {
			System.out.println("Bu iki sayı arkadaş değildir.");
		}
		
	}

}
