package groupwareAnwendung;

import java.util.HashMap;

import rm.chat.user.Message;
import rm.chat.user.UserAdministration;

public class Listener {
	
	private UserAdministration userAdmin;
	
	private HashMap<Long, Session> session = new HashMap<Long, Session>();

	
	public Listener(UserAdministration useradmin){
		this.userAdmin = useradmin;
	}
	
	
	public Long login(String user, String pw){
		return null;
		
	}
	
	public int logoff (Long logoff){
		return 0;
		
	}
	
	public int createUser(Long lng, String str1, String str2, boolean bool){
		return 0;
		
	}
	
	public int deleteUser(Long lng, String str1){
		return 0;
		
	}
	
	public int createGroup(Long lng, String str1){
		return 0;
		
	}
	
	public int deleteGroup(Long lng, String str1){
		return 0;
		
	}
	
	public int addGroupUser(Long lng, String str1){
		return 0;
		
	}
	
	public int deleteGroupUser(Long lng, String str1){
		return 0;
		
	}
	
	public int sendMessage(Long lng, String str1){
		return 0;
		
	}
	
	public Message getMessage(Long lng, String str1){
		return null;
		
	}
	
	public void serializeAdministration(Long lng){
		
	}
}
