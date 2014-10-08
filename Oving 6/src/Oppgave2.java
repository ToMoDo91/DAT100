import easyIO.*;

import java.util.Arrays;

public class Oppgave2 {

	public static void main(String[] args) {
		Out skjermOut = new Out();
		
		long start = System.nanoTime();
		double tabell[] = new double[10000000];
		double random;
		
		
		for(int i = 0; i < tabell.length; i++){
			tabell[i] = Math.random();
			}

		Arrays.sort(tabell);
		
		for(int i = 0; i < tabell.length; i++){
			
			}
		long time = System.nanoTime() - start;
		double timeInSeconds = time/1e9;
		
		System.out.println(" ");
		System.out.print("Tid programmet bruker på å kalkulere: ");
		System.out.print(timeInSeconds);
		System.out.println(" sekunder.");
		
	}

	
	}

