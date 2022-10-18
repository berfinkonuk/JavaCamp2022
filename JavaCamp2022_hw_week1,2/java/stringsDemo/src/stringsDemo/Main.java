package stringsDemo;

public class Main {

	public static void main(String[] args) {
		System.out.println("---------stringlerle çalışmak 1 -------------");
		
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı : "+mesaj.length());
		System.out.println("5. Eleman : "+mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.lastIndexOf("e"));
		
		
		System.out.println("---------stringlerle çalışmak 2 -------------");
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5)); //2 den başlar 5 e kadar keser.
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);		
		}
		
		System.out.println(mesaj.toLowerCase()); //bütün kelimeleri küçük harfe çevirir
		System.out.println(mesaj.toUpperCase()); //bütün kelimeleri büyük harfe çevirir
		

	}

}
