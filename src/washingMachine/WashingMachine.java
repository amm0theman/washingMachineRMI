package washingMachine;

public class WashingMachine implements WashingMachineState{
	
	String machineID = null;
	
	public WashingMachine(String _machineID) {
		machineID = _machineID;
	}
	
	NotFullyPaid notFullyPaidState = new NotFullyPaid(this);
	HasPaid hasPaidState = new HasPaid(this);
	BrokenDown brokenDownState = new BrokenDown(this);
	Rinse rinseState = new Rinse(this);
	Wash washState = new Wash(this);
	SpinDrain spinDrainState = new SpinDrain(this);
	WashingMachineState currentState = notFullyPaidState;
	
	public int totalQuarters;
	
	public void setState(WashingMachineState _newState) {
		currentState = _newState;
	}

	@Override
	public void insertQtr() {
		currentState.insertQtr();
		
	}

	@Override
	public void ejectQtr() {
		currentState.ejectQtr();
	}

	@Override
	public void startLoad() {
		currentState.startLoad();
	}

	@Override
	public void cancelLoad() {
		currentState.cancelLoad();
	}
	
	@Override
	public String toString() {
		String tempString;
		tempString = "MachineID: " + machineID + "\n";
		tempString += currentState.toString();
		
		return tempString;
	}
	
}
