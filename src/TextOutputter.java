import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * This is a general way to write out text to a file.
 * Created by gianlucatruda on 28/02/2017.
 */
public class TextOutputter {
	public TextOutputter() {

	}

	public void writeText(String s, String filename) throws IOException {

		// Add some code here to ensure that file exists.

		FileWriter fw = new FileWriter(filename, true);
		try (PrintWriter pw = new PrintWriter(fw)) {
			pw.print(s);
		}
	}
}
