package washingMachine;

public class BrokenDown implements WashingMachineState {

	WashingMachine myMachine;
	
	public BrokenDown(WashingMachine washingMachine) {
		myMachine = washingMachine;
	}

	@Override
	public void insertQtr() {
		// Do nothing

	}

	@Override
	public void ejectQtr() {
		// Do nothing

	}

	@Override
	public void startLoad() {
		// Do nothing

	}

	@Override
	public void cancelLoad() {
		// Do nothing

	}
	
	@Override
	public String toString() {
		return "Machine is broken down\n";
	}
	
}
