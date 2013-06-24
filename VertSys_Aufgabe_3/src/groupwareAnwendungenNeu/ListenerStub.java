package groupwareAnwendungenNeu;

public interface ListenerStub {
	public long login(String a, String b);
	public int logoff(long a);
	public int createUser(long a, String b, String c, boolean d);
	public int deleteUser(long a, String b);
	public int createGroup(long a, String b);
	public int deleteGroup(long a, String b);
	public int addGroupUser(long a, String b);
	public int sendMessage(long a, String b);
	public Message getMessage(long a, String b);
	public void serializeAdministration(long a);
	
	

}
