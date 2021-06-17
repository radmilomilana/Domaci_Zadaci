package domaci;

public class domaci_27_04_drugi_zadatak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Napisati program koji ce prebrojati koliko je brojeva od 9 do 250
		// (ukljucujuci i njih)
		// deljivih brojem 3.

		int brojac = 0;
		for (int i = 9; i <= 250; i++) {
			if (i % 3 == 0) {
				brojac++;

			}
		}
		System.out.println("U opsegu brojeva od 9 do 250, ukupno brojeva koji su deljivi sa 3 je ");
		System.out.println(brojac);
	}
}
