package groupwareAnwendung;

import java.rmi.Remote;
import java.rmi.RemoteException;

import rm.chat.user.Message;

public interface ListenerStub extends Remote {
	public ListenerStub connect() throws RemoteException;
	public ListenerStub message(String text) throws RemoteException;
	public void disconnect() throws RemoteException;
	
	
	public Long login(String user, String pw);
	
	public int logoff (Long logoff);
	
	public int createUser(Long lng, String str1, String str2, boolean bool);
	
	public int deleteUser(Long lng, String str1);
	
	public int createGroup(Long lng, String str1);
	
	public int deleteGroup(Long lng, String str1);
	
	public int addGroupUser(Long lng, String str1);
	
	public int deleteGroupUser(Long lng, String str1);
	
	public int sendMessage(Long lng, String str1);
	
	public Message getMessage(Long lng, String str1);
	
	public void serializeAdministration(Long lng);
	
	

}
