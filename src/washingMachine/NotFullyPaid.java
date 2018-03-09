package washingMachine;

public class NotFullyPaid implements WashingMachineState {

	WashingMachine myMachine;
	
	NotFullyPaid(WashingMachine _myMachine) {
		myMachine = _myMachine;
	}
	
	@Override
	public void insertQtr() {
		myMachine.totalQuarters++;
		if(myMachine.totalQuarters == 4) {
			myMachine.setState(new HasPaid(myMachine));
		}
	}

	@Override
	public void ejectQtr() {
		if(myMachine.totalQuarters > 0)
			myMachine.totalQuarters--;
		else
			System.out.println("There are no quarters in the machine.");
	}

	@Override
	public void startLoad() {
		System.out.println("System cannot start until 1.00$ is received");
	}

	@Override
	public void cancelLoad() {
		//Do nothing
	}
	
	@Override
	public String toString() {
		return "Machine has not been paid for, " + myMachine.totalQuarters + " inserted\n";
	}

}
