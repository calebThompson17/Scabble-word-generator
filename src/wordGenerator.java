import java.io.File;
import java.io.IOException;
import java.lang.Math;
import java.util.Scanner;

/**
 * This class reads through the txt files produced in DocGenerator.java,
 *  taking the words and necessary information that the user desires
 * 
 * @author Caleb Thompson
 * @version Version 1
 */
public class wordGenerator {
	
	public static boolean isScrabbleWord(String word) throws IOException {
		
		// Returns false for empty string
		if (word.length() < 1) {
			return false;
		}
		
		// Setting scan to appropriate wordsStartingWith File
		Scanner scan;
		switch (word.trim().toUpperCase().charAt(0)) {
		case 'A':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithA"));
			break;
		case 'B':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithB"));
			break;
		case 'C':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithC"));
			break;
		case 'D':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithD"));
			break;
		case 'E':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithE"));
			break;
		case 'F':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithF"));
			break;
		case 'G':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithG"));
			break;
		case 'H':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithH"));
			break;
		case 'I':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithI"));
			break;
		case 'J':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithJ"));
			break;
		case 'K':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithK"));
			break;
		case 'L':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithL"));
			break;
		case 'M':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithM"));
			break;
		case 'N':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithN"));
			break;
		case 'O':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithO"));
			break;
		case 'P':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithP"));
			break;
		case 'Q':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithQ"));
			break;
		case 'R':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithR"));
			break;
		case 'S':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithS"));
			break;
		case 'T':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithT"));
			break;
		case 'U':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithU"));
			break;
		case 'V':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithV"));
			break;
		case 'W':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithW"));
			break;
		case 'X':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithX"));
			break;
		case 'Y':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithY"));
			break;
		case 'Z':
			scan = new Scanner(new File("docs/wordsStartingWith/StartingWithZ"));
			break;
		default:
			return false; // Does not start with an alphabetic letter
		}
		while (scan.hasNextLine()) {
			String scrabbleWord = scan.nextLine();
			if (scrabbleWord.equals(word.toUpperCase())) {
				scan.close();
				return true;
			}
		}
		scan.close();
		return false; // Does not have the word in the scrabble dictionary
	}
	
	public static char[] randomLetterGenerator(int num) {
		char[] returnChars = new char[num];
		for (int i = 0; i < num; ++i) {
			int randomNum = (int)(Math.random()*(26)+1);
			char letter = (char)(randomNum + 64);
			System.out.println("randomNum: " + randomNum + "\t  letter: " + letter);
			returnChars[i] = letter;
		}
		return null;
	}
	
	public static void main(String[] args) {
		try {
			randomLetterGenerator(23);
			String word = "xylophone";
			System.out.println(word + " is a word: " + isScrabbleWord(word));
			ScrabbleWord sWord = new ScrabbleWord(word);
			System.out.println(sWord.getword() + " score: " + sWord.getScore());
			System.out.println(sWord.getword() + ": " + sWord.getDefinition());
		}
		catch (IOException excpt) {
			System.out.println("Caught IOException: " + excpt.getMessage());
		}
	}

}
