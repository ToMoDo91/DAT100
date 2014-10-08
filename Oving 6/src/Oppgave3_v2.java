import java.util.Random;

import easyIO.Out;
import easyIO.OutExp;

public class Oppgave3_v2 {

	public static void main(String[] args) {
		Out skjerm = new Out();
		
		/* Overskrift, objekter */
		
		skjerm.outln("TERNINGKASTSIMULATOR", 80, OutExp.CENTER);
		
		int linje = 19;
		
		Random terning = new Random();
		int kast[] = new int[100];
		int utfall[] = new int[6];
		
		/* Lager 100 forskjellige utfall av terningkastene
		 * setter marginer for å skape avstand mellom hvert utfall
		 * og printer ut med en satt grense på 20 utfall per linje */
		
		for (int i = 0; i < kast.length; i++) {
			kast[i] = terning.nextInt(6) + 1;
			skjerm.out(kast[i],4);
			
			while (i == linje){
				skjerm.outln();
				linje += 20;
			}
			
		}	
		
		/* Teller antall utfall av hver sort fra 1-6 */
		
		System.out.println(" ");
		for (int i = 0; i < kast.length; i++) {
			
			if (kast[i] == 1){
				utfall[0]++;
			}else if (kast[i] == 2){
				utfall[1]++;
			}else if (kast[i] == 3){
				utfall[2]++;
			}else if (kast[i] == 4){
				utfall[3]++;
			}else if (kast[i] == 5){
				utfall[4]++;
			}else if (kast[i] == 6){
				utfall[5]++;
			}else{
				skjerm.out("error");
			
			}
			
		}
		
		/* Printer ut en liste over antall utfall hver side av terningen fikk */
		
		skjerm.outln("Antall kast: 100");
		skjerm.outln("Antall 1'ere: " + utfall[0]);
		skjerm.outln("Antall 2'ere: " + utfall[1]);
		skjerm.outln("Antall 3'ere: " + utfall[2]);
		skjerm.outln("Antall 4'ere: " + utfall[3]);
		skjerm.outln("Antall 5'ere: " + utfall[4]);
		skjerm.outln("Antall 6'ere: " + utfall[5]);
		
		/* Finner gjennomsnitt av alle utfallene */
		
		double sum = 0;
		for (double elementer : kast){
				sum += elementer;
		}
		
		double gjennomsnitt = sum / 100;
		
		skjerm.outln("Gjennomsnitt av kasta: " + gjennomsnitt);
		
		/* Finner antall kast før første 6'er */
		
		int antallKast = 0;
		for (int i = 0; i < kast.length && kast[i]!=6; i++){
			antallKast = i + 2;
		}
		
		antallKast = antallKast == 0 ? 1 : antallKast;
		
		skjerm.outln("Antall kast før første 6-er: " + antallKast);
		
		/* Finner det utfallet med høyest frekvens av 100 kast */
		
		int maks = utfall[0];
		int terningVerdi = 0;
		for (int i = 0; i < utfall.length; i++){
			while (maks < utfall[i]){
				maks = utfall[i];
				terningVerdi = i + 1;
				
			}
		}
		skjerm.outln("Terningverdien det var mest utfall av: " + terningVerdi);
	}
}


