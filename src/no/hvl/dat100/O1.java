package no.hvl.dat100;


import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O1 {

	public static void main(String[] args) {

		for (int i=1; i<=10; i++) {

			int poengSum = Integer.parseInt(showInputDialog(i + ". Skriv inn Poengsum: "));	

			if ((poengSum <= 100)&&(90 <= poengSum)){
				showMessageDialog(null, "Resultat: A");}
			else if ((poengSum <= 89)&&(80 <= poengSum)){
				showMessageDialog(null, "Resultat: B");
			}

			else if ((poengSum <= 79)&&(60 <= poengSum)){
				showMessageDialog(null, "Resultat: C");
			}

			else if ((poengSum <= 59)&&(50 <= poengSum)) {
				showMessageDialog(null, "Resultat: D");
			}

			else if ((poengSum <= 49)&& (poengSum >= 40)) {
				showMessageDialog(null, "Resultat: E");
			}

			else if ((poengSum <= 39)&&(poengSum >= 0)) {
				showMessageDialog(null, "Resultat: F");
			}

			else {
				showMessageDialog(null, "Ugyldig poengsum. Poengsummen kan ikke være negativ eller >100.");
				i--;
			}

			System.out.println(i);
		}

	}

}
	
	
	
	
	

