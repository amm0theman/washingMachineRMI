package serverClass;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import remoteInterfaces.Hello;
import remoteInterfaces.WashStatus;
import washingMachine.WashingMachine;

public class Server implements Hello, WashStatus {

	WashingMachine[] myMachines;
	
	public Server() {
		myMachines = new WashingMachine[2];
		myMachines[0] = new WashingMachine("WM One");
		myMachines[1] = new WashingMachine("WM One");
	}
	
	@Override
	public String sayHello() throws RemoteException {
		return "Hello, world!";
	}

	public static void main(String args[]) {
		try {
			Server obj = new Server();
			//Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);
			WashStatus washstub = (WashStatus) UnicastRemoteObject.exportObject(obj, 0);
			
			//Bind the remote object's stub in the registry
			Registry registry = LocateRegistry.getRegistry();
			System.out.println(registry.toString());
			//registry.bind("Hello", stub);
			registry.rebind("WashStatus", washstub);
			
			System.err.println("Server ready");
		} catch(Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}

	@Override
	public String showStatus() throws RemoteException {
		String tempString = "";
		for (int i = 0; i < myMachines.length; i++) {
			tempString += myMachines[0].toString();
		}
		return tempString;
	}
}
