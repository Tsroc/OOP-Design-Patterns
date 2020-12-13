package ie.gmit.sw;

import java.rmi.*;

public interface RemoteMessage extends Remote {

	String message() throws RemoteException;

}