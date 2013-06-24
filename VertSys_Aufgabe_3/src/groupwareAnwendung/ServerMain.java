package groupwareAnwendung;

import java.lang.reflect.Array;
import java.util.ArrayList;

import rm.chat.user.Group;
import rm.chat.user.User;

public class ServerMain {
	public static void main(String[] args) {
		User eins = new User("UserEins", "pw1", true);
		User zwei = new User("UserZwei", "pw2", false);

		Group gruppeeins = new Group("GruppeEins", zwei);

		System.out.println(gruppeeins.getGroupname());
		System.out.println(gruppeeins.getOwner());
		
	}

}
