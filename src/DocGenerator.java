import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.PrintWriter;

/**
 * This class generates txt files to use for the Scrabble Word Generator
 * 
 * @author Caleb Thompson
 * @version version 1
 */
public class DocGenerator {
	public static void generateMasterWordListCsvFile(File input, File output) throws IOException {
		Scanner scan = new Scanner(input);
		PrintWriter pw = new PrintWriter(output);
		String title = scan.nextLine();
		scan.nextLine();
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
//			line = line.strip();
			int i = line.indexOf('\t');
			String dictionary_word = line.substring(0,i);
			String word_definition = line.substring(i); // with tab in the front
//			if (!scan.hasNextLine()) {
//				pw.print(dictionary_word);
//			}
//			else {
//				pw.println(dictionary_word);
//			}
			pw.println(dictionary_word);
		}
		scan.close();
		pw.close();
	}
	
	public static void generateWordsStartingWithFiles() throws IOException {
		Scanner scan = new Scanner(new File("docs/masterWordList"));
		PrintWriter pwA = new PrintWriter(new File("docs/wordsStartingWith/StartingWithA"));
		PrintWriter pwB = new PrintWriter(new File("docs/wordsStartingWith/StartingWithB"));
		PrintWriter pwC = new PrintWriter(new File("docs/wordsStartingWith/StartingWithC"));
		while (scan.hasNextLine()) {
			String word = scan.nextLine();
			switch (word.substring(0,1).toUpperCase()) {
			case "A":
				pwA.println(word);
//				System.out.println("Should add A word");
				break;
			case "B":
				pwB.println(word);
				break;
			case "C":
				pwC.println(word);
				break;
			}
		}
		scan.close();
		pwA.close();
		pwB.close();
		pwC.close();
		
	}
	
	public static void main(String[] args) {
		try {
			String separator = System.getProperty("file.separator");
			File inputFile =  new File("docs" + separator + "Collins_Scrabble_Words_(2019)_with_definitions.txt");
			File outputFile = new File("docs/masterWordList");
			generateMasterWordListCsvFile(inputFile, outputFile);
			generateWordsStartingWithFiles();
		}
		catch (IOException excpt) {
			System.out.println("Caught IOException: " + excpt.getMessage());
		}
		
	}

}
