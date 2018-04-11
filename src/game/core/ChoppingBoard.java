package game.core;

public final class ChoppingBoard extends Countertop implements Cutter {

	@Override
	public void cut() {
		ingredient.remainingSecondsToCut--;
	}

}
