
public class Vatandas {
	private Basbakan basbakan;
	
	//public Citizen()

	public String derdiniAnlat() {
		basbakan.dertDinle("Bir derdim var...");
		return "derdimi anlattım!!";
	}
	
	public String isIste() {
		basbakan.isBul("Kendim");
		return "is basvurusu yaptim";
	}
}
