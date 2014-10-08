
import java.util.Arrays;
import easyIO.*;
import java.util.Scanner;

import easyIO.Out;

public class Oppgave1 {

	public static void main(String[] args) {
		
		baklengs word = new baklengs();
		word.lesBaklengs();
		
		array streng = new array();
		streng.stigendeArray();
		
		alfSort ord = new alfSort();
		ord.sorterFørste();
	}
}
		
		class baklengs {
			Scanner tastatur = new Scanner(System.in);
			Out skjerm = new Out();
			void lesBaklengs() {
				System.out.print("Tast inn ord/setning: ");
			String word = tastatur.nextLine();
			String reverse = new StringBuffer(word).reverse().toString();
			System.out.println("Original String :" + word + " , reversed String : " + reverse);
				
	}
}
		class array {
			Scanner tastatur = new Scanner(System.in);
			Out skjerm = new Out();
			void stigendeArray() {
				int heltall[] = new int[5];
				boolean sort = true;
				
				System.out.println(" ");
				System.out.println("Tast inn en array på 5 tall: ");
				
				for (int i = 0; i <= 4; i++){
					heltall[i] = tastatur.nextInt();
				}
				for (int i = 0; i < heltall.length - 1 && sort; i++){
					if (heltall[i] > heltall[i + 1]){
		                sort = false;
		            }
		        }

		        skjerm.outln();
		        if(sort){
		            skjerm.outln("Tabellen er sortert i stigende rekkefølge");
		        } else{
		            skjerm.outln("Tabellen er ikke sortert i stigende rekkefølge");
		}
	}
}
		class alfSort {
			Scanner tastatur = new Scanner(System.in);
			Out skjerm = new Out();
			void sorterFørste() {
				String ord[] = new String[5];
				
				System.out.println(" ");
				System.out.println("Tast inn en array med 5 ord: ");
				for (char i = 0; i <= 4; i++){
					ord[i] = tastatur.nextLine();
				}
				
				Arrays.sort(ord);
				System.out.println(" ");
				System.out.println("Ordet som kommer alfabetisk først er: " + ord[0]);
			}
		}
		
		
	




