
public class Test {

	public static void main(String[] args) {
		System.err.println("*** Vatandaş başbakanlık kalemine gelir ve süreç başlar. ***");
		
		Minister basbakan = new GercekBasbakan();
		BasbakanlikKalemi kalem = new BasbakanlikKalemi(basbakan);
		
		Vatandas riza = new Vatandas(kalem);
		riza.derdiniAnlat();
		riza.isIste();
	}
}
