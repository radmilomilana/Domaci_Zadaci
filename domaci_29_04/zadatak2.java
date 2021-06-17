package domaci_29_04;

import java.util.Scanner;


public class zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Napisati program gde korisnik preko skenera unese brojeve od 1 do 10 (ukljucujuci 1 i 10) i
		//program mu vrati odgovor da li je broj prost ili ne. 
		//(Prost broj je onaj koji je deljiv samo sa brojem 1 i sa sobom)
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj od 1 do 10: ");
		int broj = s.nextInt();
		if (broj >= 1 && broj <= 10) {
            if (broj % 2 == 0 && broj % 3 == 0) {
                System.out.println("Broj " + broj + " nije prost.");
            } else if (broj % 2 == 0 && broj % 4 == 0) {
                System.out.println("Broj " + broj + " nije prost.");
            } else if (broj % 2 == 0 && broj % 5 == 0) {
                System.out.println("Broj " + broj + " nije prost.");
            } else if (broj % 3 == 0 && broj % 9 == 0) {
                System.out.println("Broj " + broj + " nije prost.");
            } else {
                System.out.println("Broj je prost");
            }
        } 
		s.close();
}
}