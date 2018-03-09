package washingMachine;

public class HasPaid implements WashingMachineState {

	WashingMachine myMachine;
	
	public HasPaid(WashingMachine _myMachine) {
		myMachine = _myMachine;
	}

	@Override
	public void insertQtr() {
		ejectQtr();
	}

	@Override
	public void ejectQtr() {
		System.out.println("Quarter returned, machine is running");
	}

	@Override
	public void startLoad() {
		System.out.println("Starting Load");
		myMachine.setState(new Rinse(myMachine));
	}

	@Override
	public void cancelLoad() {
		System.out.println("Returning " + myMachine.totalQuarters + " quarters");
	}

	@Override
	public String toString() {
		return "Machine has been paid for, ready to start\n";
	}
	
}
