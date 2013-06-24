package groupwareAnwendung;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RemoteStub;

import rm.chat.user.UserAdministration;

public class Server{
	
	private Listener listener;
	private Remote listenerStub;
	
	private int port;
	private int connectionCount;
	

	private UserAdministration useradministration;
	
	public Server(int port){
		this.port = port;
	}
	
	public void waitForConnection(int port, Listener listener){
		this.port = port;
		this.listener = listener;
		
		try{
			listener = new Listener(useradministration);
			
			listenerStub = (ListenerStub) java.rmi.server.UnicastRemoteObject.exportObject(listener, 0);
			Registry registry = LocateRegistry.createRegistry(port);
			registry.rebind("listener", listenerStub);
			
			try{
				while(true){
					Thread.sleep(1000);
				}
			}
				catch(InterruptedException e){
					e.printStackTrace();
				}
			}catch(RemoteException e){
				e.printStackTrace();
			}
		
	}
	
	
	
	
	static RemoteStub exportObject(Remote obj) {
		return null;
	}

}
