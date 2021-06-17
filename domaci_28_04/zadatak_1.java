package domaci_28_04;

import java.util.Scanner;

public class zadatak_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Napisati niz brojeva i prikazati aritmeticku sredinu niza
		
		 	 Scanner s = new Scanner(System.in);
		 	
	        System.out.print("Koliko brojeva zelite da unesete u niz? ");
	        int kolikoBrojeva = s.nextInt();
	        double[] niz = new double [kolikoBrojeva];
	        double suma = 0;
	        for (int i=0; i < kolikoBrojeva; i++) {
	        System.out.print("Unesite broj: ");
	        niz [i] = s.nextDouble();
	        suma += niz [i];
	        }
	              
	        
			
	        double ars = suma/kolikoBrojeva;
			
	        System.out.print("Aritmeticka sredina je: " +ars);
	        s.close();
		
	}

}
