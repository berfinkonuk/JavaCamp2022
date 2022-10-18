package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		//Mükemmel Sayı kendisine kadar bölünebilen sayıların toplamı kendisini veriyorsa
		//örneğin 6 mükemmel sayıdır 1,2,3 e bölünüp, bölünen sayıların toplamları 6 yı verir
		int number = 28;
		int total = 0;
		
		for(int i=1; i<number; i++) {
			if(number % i ==0) {
				total =total +i ;
			}
		}
		if(total == number) {
			System.out.println("Mükemmel Sayıdır.");
		} else {
			System.out.println("Mükemmel Sayı Değildir.");
		}
		

	}

}
