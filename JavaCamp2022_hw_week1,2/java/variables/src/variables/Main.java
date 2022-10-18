package variables;

public class Main {

	public static void main(String[] args) {
		//büyük harf küçük harf duyarlılığı var
		
		//öğrenci sayımı değiştirdiğimde hepsinde tek tek değiştirmeme gerek kalmayacak int değişkeni sayesinde hepsi değişir
		//reusability bir kez yaz tekrar tekrar kullan
		int ogrenciSayisi = 11;
		String mesaj = "Öğrenci sayısı : ";
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
		
		System.out.println("Öğrenci sayım : 10");
		System.out.println("Öğrenci sayım : 10");
		System.out.println("Öğrenci sayım : 10");


		
	}

}
