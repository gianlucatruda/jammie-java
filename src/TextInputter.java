import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is a general way to read in data from a text file line by line.
 * Created by gianlucatruda on 27/02/2017.
 */
public class TextInputter {

	public TextInputter() {

	}

	public ArrayList<String> getText(String textfile) {

		ArrayList<String> outArray = new ArrayList<>();
		try {
			Scanner scanner = new Scanner(new File(textfile));
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				// Code to scrub start and end whitespace from line.
				outArray.add(line);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return outArray;
	}


}
