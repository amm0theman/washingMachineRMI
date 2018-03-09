package clientClass;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import remoteInterfaces.Hello;
import remoteInterfaces.WashStatus;

public class Client {
	
	private Client() {}
	
	public static void main(String[] args) {
		
		String host = (args.length < 1) ? null : args[0];
		try {
			Registry registry = LocateRegistry.getRegistry(host);
			WashStatus washstub = (WashStatus) registry.lookup("WashStatus");
			String response = washstub.showStatus();
			System.out.println("Statuses of machines: " + response);
		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}
}
