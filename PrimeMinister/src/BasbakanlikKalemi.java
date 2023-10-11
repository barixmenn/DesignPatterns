
public class BasbakanlikKalemi {

	private Basbakan basbakan;
	
	public BasbakanlikKalemi(Basbakan basbakan) {
		this.basbakan = new VekilBasbakan(basbakan);
	}
	
	public Minister banaBaskaniVer() {
		System.out.println("Başbakanlık Kalemi: Tabi efendim");
		return basbakan;
	}
}
