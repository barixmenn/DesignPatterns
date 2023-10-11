
public class VekilBasbakan implements Minister {
	private Basbakan gercekBasbakan;
	
	public VekilBasbakan(Minister gercekBasbakan) {
		this.gercekBasbakan = gercekBasbakan;
	}
	
	
	
	@Override
	public void dertDinle(String dert) {
	System.out.println("Vekil: Derdinizi dinliyorum.");
		
		boolean ayiklandi = ayikla(dert);
		if(ayiklandi)
			ilet(dert);
	}
	
	@Override
	public void isBul(String yakinim) {
		System.out.println("Vekil: Isteginizi dinliyorum.");
	}
	
	
	private boolean ayikla(String dert){
		boolean b = true;
		//...
		return b;
	}
	
	private void ilet(String dert){
		gercekBasbakan.dertDinle(dert);
	}

}
