import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * This class reads through the txt files produced in DocGenerator.java,
 *  taking the words and necessary information that the user desires
 * 
 * @author Caleb Thompson
 * @version Version 1
 */
public class wordGenerator {
	public static String getDefinition(String word) throws IOException {
		Scanner scan = new Scanner(new File("docs/Collins_Scrabble_Words_(2019)_with_definitions.txt"));
		String title = scan.nextLine();
		scan.nextLine();
		String word_definition = "No definition";
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			int i = line.indexOf('\t');
			String dictionary_word = line.substring(0, i);
			if (dictionary_word.equals(word.toUpperCase())) {
				word_definition = line.substring(i + 1);
			}
		}
		scan.close();
		return word_definition;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(getDefinition("pool"));
		}
		catch (IOException excpt) {
			System.out.println("Caught IOException: " + excpt.getMessage());
		}
	}

}
