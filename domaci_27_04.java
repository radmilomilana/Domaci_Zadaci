package domaci;

import java.util.Scanner;

public class domaci_27_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj, ispisuje njihov zbir (zbir pozitivnih brojeva).
		//primer: ako korisnik unese 1 2 5 3 -1, program treba da ispise 11

		int broj = 0;
		int zbir = 0;
		Scanner s = new Scanner(System.in);
		while (broj >= 0) {
			zbir = zbir + broj ;
			System.out.println( "Unesite broj:");
			broj = s.nextInt();
			s.close();
		}
		System.out.println("Zbir unetih brojeva dok nije unet negativan broj je " + zbir);
		System.out.println("Kraj programa");
	}
	

}
