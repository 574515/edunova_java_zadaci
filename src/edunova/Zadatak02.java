package edunova;

import javax.swing.JOptionPane;

public class Zadatak02 {

	/* Korisnik unosi broj od 1-5, ako je unesen
	broj veći od 5 ili manji od 1 program ispisuje
	nije dobar broj. U slučaju dobrog unosa za brojčanu
	ocjenu program ispisuje opisnu ocjenu*/
	
	public static void main(String[] args) {
		
		int ocjena = Integer.parseInt(JOptionPane.showInputDialog("Unesite ocjenu od 1-5"));
		
		switch (ocjena) {
		case 1:
			System.out.println("Nedovoljan");
			break;
		case 2:
			System.out.println("Dovoljan");
			break;
		case 3:
			System.out.println("Dobar");
			break;
		case 4:
			System.out.println("Vrlo dobar");
			break;			
		case 5:
			System.out.println("Odličan");
			break;
		default:
			System.out.println("Nije dobar broj");
		}
		
	}
	
}
