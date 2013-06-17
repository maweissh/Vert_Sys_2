package groupwareAnwendung;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class User extends Persistenz implements Serializable {
	private String username;
	private String password;
	private boolean administrator;
	// public static User userEins = new User(this, "Oberadmin", "a", true);
	private static int i = 0;

	public User(User user, String un, String pw, boolean admin) {
		if (i == 0) {
			this.username = un;
			this.password = pw;
			this.administrator = admin;
			try {
				this.write(this.username);
				System.out.println("speichern erfolgreich");
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println("Fehler beim Speichern");
			}
			i++;
		} else {
			if (user.administrator == true) {
				this.username = un;
				this.password = pw;
				this.administrator = admin;
				try {
					this.write(this.username);
					System.out.println("speichern erfolgreich");
				} catch (IOException e) {
					e.printStackTrace();
					System.err.println("Fehler beim Speichern");
				}
			} else {
				System.out.println("Fehler: kein Administrator");
			}
		}

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdministrator() {
		return administrator;
	}

	public void setAdministrator(boolean administrator) {
		this.administrator = administrator;
	}

	/*public void write() throws IOException {

		String filename = this.username;

		OutputStream oStream = new FileOutputStream(filename + ".txt");
		ObjectOutputStream myStream = new ObjectOutputStream(oStream);
		myStream.writeObject(this);

	}*/

	public String toString() {
		return "Benutzername: " + username + " Admin: " + administrator;
	}

}
