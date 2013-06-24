package groupwareAnwendung;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientMain {

	
	private int port;
	private String hostname;
	private String loginname;
	
	private Server server;
	
	private ListenerStub listenerStub;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}
	
	
	public void connect(int port, String hostname){
		try {
			Registry registry = LocateRegistry.getRegistry(hostname,port);
			Listener listener = (Listener)registry.lookup("listener");
			
			listener.connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
