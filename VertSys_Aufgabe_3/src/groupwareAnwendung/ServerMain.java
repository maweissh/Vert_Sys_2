package groupwareAnwendung;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ServerMain {
	public static void main(String[] args) {
		User eins = new User(null, "UserEins", "A", true);
		User zwei = new User(eins, "UserZwei", "b", false);

		Group gruppeeins = new Group(zwei);

		System.out.println(gruppeeins.getGroupname());
		System.out.println(gruppeeins.getOwner());
		
	}

}
