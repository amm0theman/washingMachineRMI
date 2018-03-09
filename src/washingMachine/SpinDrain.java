package washingMachine;

public class SpinDrain extends InUse implements WashingMachineState {

	WashingMachine myMachine;
	
	public SpinDrain(WashingMachine washingMachine) {
		super(washingMachine);
	}
	
	@Override
	public String toString() {
		return "Machine is in spin_drain cycle\n";
	}

}
