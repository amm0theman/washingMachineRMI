package washingMachine;

public interface WashingMachineState {
	public void insertQtr();
	public void ejectQtr();
	public void startLoad();
	public void cancelLoad();
}
