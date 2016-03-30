package hardware;

import washer.Washing;

public class Plate extends Dinnerware{

	public Plate(Washing washingBy) {
		super(washingBy);
	}

	@Override
	public void wash() {
		System.out.println("Plate washing...");
		washingBy.applyWasher();
	}

}
