package hardware;

import washer.Washing;

public abstract class Dinnerware {
	
	protected Washing washingBy;
	
	public Dinnerware(Washing washingBy) {
		this.washingBy = washingBy;
	}
	
	abstract public void wash();

}
