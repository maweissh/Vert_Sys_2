package groupwareAnwendung;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Persistenz {
	public void write(String fname) throws IOException {

		String filename = fname;

		OutputStream oStream = new FileOutputStream(filename + ".txt");
		ObjectOutputStream myStream = new ObjectOutputStream(oStream);
		myStream.writeObject(this);

	}
}
