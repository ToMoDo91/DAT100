import easyIO.*;
import easyIO.In;
import easyIO.Out;

public class Oppgave4 {

	public static void main(String[] args) {
		In tast = new In();
		Out skjerm = new Out();
				
		skjerm.out("Sett varenr: ");
        int varenr = tast.inInt();
        skjerm.out("Sett varenavn: ");
        String navn = tast.inLine();
        skjerm.out("Sett pris på vare: ");
        double pris = tast.inDouble();
        
        Klasser vare = new Klasser(varenr, navn, pris);
        vare.skriv();
			
	}
}
	
	class Klasser{
		
		private int varenr;
		private String navn;
		private double pris;
		
		Klasser(){
			pris = 100;
			varenr = 0;
		}
		
		Klasser(int varenr, String navn, double pris){
			this.varenr = varenr;
			this.navn = navn;
			this.pris = pris;
		}

		private int getVarenr() {
			return varenr;
		}

		private String getNavn() {
			return navn;
		}

		private double getPris() {
			return pris;
		}
		
		public double setMoms(){
			double moms = (pris / 100) * 20;
			return pris + moms;
		}
		
		public boolean billigereEnn(){
			boolean billigere = false;
			
			if(pris < 100){
				billigere = true;
			}
			
			return billigere;
		}
		
		public void skriv(){
			Out skjerm = new Out();
			
			skjerm.outln(" ");
			skjerm.outln("Varenavn: " + navn);
			skjerm.outln("Varenummer: " + varenr);
			skjerm.out("Pris u/moms: ");
			skjerm.outln(pris, 2);
			skjerm.out("Pris m/moms: ");
			skjerm.outln(setMoms(), 2);
			
			if (billigereEnn()){
				skjerm.outln("Varen er billigere enn 100.00 kr");
			}else{
				skjerm.outln("Varen er ikke billigere enn 100.00 kr");
		}
	}		
}
