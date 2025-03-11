package poker;

public class Carta {

	
	private final Seme seme;
	private final Valore valore;
	
	public Carta(Seme seme, Valore valore){
		this.seme = seme;
		this.valore = valore;
	}
	
	@Override
	public String toString() {
	
		return valore.toString().toLowerCase() + " di " + seme.toString().toLowerCase();
	}

	
	 */
	public enum Seme {
		CUORI, QUADRI, FIORI, PICCHE
	}

	public enum Valore {
		ASSO, DUE, TRE, QUATTRO, CINQUE, SEI, SETTE, OTTO, NOVE, DIECI, JACK, REGINA, RE
	}

}
