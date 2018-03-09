package washingMachine;

public class Rinse extends InUse implements WashingMachineState {

	public Rinse(WashingMachine _newMachine) {
		super(_newMachine);
		//Eh works
	}
	
	@Override
	public String toString() {
		return "Machine is in rinse cycle\n";
	}
}
