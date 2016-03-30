package hardware;

import washer.Washing;

public class Glass extends Dinnerware{

	public Glass(Washing washingBy) {
		super(washingBy);
	}

	@Override
	public void wash() {
		System.out.println("Glass washing...");
		washingBy.applyWasher();
	}

}
