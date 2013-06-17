package groupwareAnwendung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Group {
	private String groupname;
	private User owner;
	private ArrayList<User> userList = new ArrayList<User>();
	private int i = 0;

	public Group(User user) {
		if (user.isAdministrator() == true) {

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.print("Groupname> ");
			try {
				this.groupname = reader.readLine();
			} catch (IOException e) {
				System.out.println("Fehler bei der Eingabe");
				e.printStackTrace();
			}
			this.owner = user;
			userList.add(user);
			i++;

		} else {
			System.out.println("Fehler: Keine Freigabe");
		}
	}

	public void addUser(User user) {

	}

	public void delUser(User user) {

	}

	public String getGroupname() {
		return groupname;
	}

	public User getOwner() {
		return owner;
	}

}
