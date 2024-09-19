package no.hvl.dat100;

import java.util.Scanner;

public class O2 {

public static void main(String[]args) {
	Scanner scanner= new Scanner (System.in);
	
	System.out.print("skriv inn bruttolønn: ");
	
	double bruttoLonn=scanner.nextDouble();
	
	double trinnskatt= beregnTrinnskatt(bruttoLonn);
	
	System.out.print("Din trinnskatt er: "+ trinnskatt + " kroner") ;
}
	
	public static double beregnTrinnskatt(double bruttoLonn) {
		double skatt=0;
	
		if (bruttoLonn > 1350000) {
            skatt += (bruttoLonn - 1350000) * 0.176;
            bruttoLonn = 1350000;
        }
        if (bruttoLonn > 937900) {
            skatt += (bruttoLonn - 937900) * 0.166;
            bruttoLonn = 937900;
        }
        if (bruttoLonn > 670000) {
            skatt += (bruttoLonn - 670000) * 0.136;
            bruttoLonn = 670000;
        }
        if (bruttoLonn > 292850) {
            skatt += (bruttoLonn - 292850) * 0.04;
            bruttoLonn = 292850;
        }
        if (bruttoLonn > 208050) {
            skatt += (bruttoLonn - 208050) * 0.017;
        }

        return skatt;
	
}

}
