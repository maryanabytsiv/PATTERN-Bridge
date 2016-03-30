package hardware;

import washer.Washing;

public class Pan extends Dinnerware{

	public Pan(Washing washingBy) {
		super(washingBy);
	}

	@Override
	public void wash() {
		System.out.println("Pan washing...");
		washingBy.applyWasher();
	}

}
