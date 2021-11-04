package EserciziDue;

import java.util.Scanner;

public class DigitNotDigit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci una Stringa : ");
		
		String cifraNonCifra = scanner.next();		
		char caratterePariPartenza = cifraNonCifra.charAt(0);
		
		int a=-2;
		int b =-1;
		boolean esito = false;
	
		if(cifraNonCifra.length()%2==0&Character.isDigit(caratterePariPartenza)){
			for(int i =0; i<cifraNonCifra.length()/2;i++) {
				if(Character.isDigit(cifraNonCifra.charAt(a+=2)) & !(Character.isDigit(cifraNonCifra.charAt(b+=2)))) {
					esito = true;
				}else {
					System.out.println("Prego inserire una stringa valida!");
				}
			}
		}else {
			System.out.println("Prego inserire una stringa valida!");
		}
		
		if(esito) {
			System.out.println(esito);
		}
	
	}

}
