package remoteInterfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface WashStatus extends Remote {
	String showStatus() throws RemoteException;
}
