package domaciSelenium;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CitanjeDomaci_2105 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File domaciFile = new File ("data/domaci2105.xlsx");
		FileInputStream fis = new FileInputStream (domaciFile);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheet("Sheet1");
				
		int Podaci = sheet1.getLastRowNum();
		
		for (int i = 1; i <= Podaci; i++) {
			XSSFRow redUPetlji = sheet1.getRow(i);
			
			XSSFCell validIme = redUPetlji.getCell(0);
			XSSFCell validPass = redUPetlji.getCell(1);
			XSSFCell invalidIme = redUPetlji.getCell(2);
			XSSFCell invalidPass = redUPetlji.getCell(3);
			
			
			System.out.println("Validni podaci: ");
			System.out.print(validIme.getStringCellValue() + ", ");
			System.out.println(validPass.getStringCellValue());		
			System.out.println("Nevalidni podaci: ");
			System.out.print(invalidIme.getStringCellValue() + ", ");
			System.out.println(invalidPass.getStringCellValue());
		}
		/*XSSFCell tekstIzcelije = redUPetlji.getCell(i);
		
		XSSFCell tekstIzCelije1 = redUPetlji.getCell(1);
		XSSFCell tekstIzCelije2 = redUPetlji.getCell(2);
		XSSFCell tekstIzCelije3 = redUPetlji.getCell(3);
		
		System.out.print(tekstIzcelije.getStringCellValue() + ", ");
		System.out.println(tekstIzCelije1.getStringCellValue());
		System.out.print(tekstIzCelije2.getStringCellValue() + ", ");
		System.out.println(tekstIzCelije3.getStringCellValue());
	}
	
	for (int i = 0; i <= Podaci; i++) {
		XSSFRow redUPetlji = sheet1.getRow(2);
		XSSFCell tekstIzcelije = redUPetlji.getCell(i);
		
		XSSFCell tekstIzCelije1 = redUPetlji.getCell(1);
		XSSFCell tekstIzCelije2 = redUPetlji.getCell(2);
		XSSFCell tekstIzCelije3 = redUPetlji.getCell(3);
		
		System.out.print(tekstIzcelije.getStringCellValue() + ", ");
		System.out.println(tekstIzCelije1.getStringCellValue());
		System.out.print(tekstIzCelije2.getStringCellValue() + ", ");
		System.out.println(tekstIzCelije3.getStringCellValue());
	}*/
	
		
		fis.close();
		wb.close();
		
	}

	
}
// iz tog fajla napravite onoliko petlji koliko ima kombinacija za unos i naravno u petlji stampajte podatke iz celija.
//Na primer: Petlja 1 - Valid username, valid password
//Petlja 2 - Invalid username, valid password