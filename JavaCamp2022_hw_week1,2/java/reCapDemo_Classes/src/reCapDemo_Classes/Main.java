package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.Topla(5, 2);
		System.out.println(sonuc);
		
		int sonuc2 = dortIslem.Cikar(9, 7);
		System.out.println(sonuc2);
	}

}
