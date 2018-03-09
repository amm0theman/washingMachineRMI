package washingMachine;

public class InUse implements WashingMachineState {

	WashingMachine myMachine;
	
	public InUse(WashingMachine _newMachine) {
		myMachine = _newMachine;
	}
	
	@Override
	public void insertQtr() {
		System.out.println("Machine in use");
	}

	@Override
	public void ejectQtr() {
		System.out.println("Machine in use");
	}

	@Override
	public void startLoad() {
		System.out.println("System is already running");
	}

	@Override
	public void cancelLoad() {
		System.out.println("System Stopping");
		myMachine.setState(new NotFullyPaid(myMachine));
	}

}
