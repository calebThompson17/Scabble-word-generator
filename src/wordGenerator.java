import java.io.File;
import java.io.IOException;
import java.lang.Math;
import java.util.Scanner;
import java.util.Stack;

/**
 * This class reads through the txt files produced in DocGenerator.java,
 *  taking the words and necessary information that the user desires
 * 
 * @author Caleb Thompson
 * @version Version 1
 */
public class wordGenerator {
	
	public static boolean isScrabbleWord(String wordP) throws IOException {

		String word = wordP.trim().toUpperCase();
		int len = word.length();
		// Returns false for empty string
		if (len < 1) {
			return false;
		}
		
		// Setting scan to appropriate wordsStartingWith File
		Scanner scan;
		switch (word.charAt(0)) {
		case 'A':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithA"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithA"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithA"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithA"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithA"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithA"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithA"));
				break;
			}
			break;
		case 'B':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithB"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithB"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithB"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithB"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithB"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithB"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithB"));
				break;
			}
			break;
		case 'C':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithC"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithC"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithC"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithC"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithC"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithC"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithC"));
				break;
			}
			break;
		case 'D':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithD"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithD"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithD"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithD"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithD"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithD"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithD"));
				break;
			}
			break;
		case 'E':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithE"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithE"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithE"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithE"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithE"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithE"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithE"));
				break;
			}
			break;
		case 'F':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithF"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithF"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithF"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithF"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithF"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithF"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithF"));
				break;
			}
			break;
		case 'G':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithG"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithG"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithG"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithG"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithG"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithG"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithG"));
				break;
			}
			break;
		case 'H':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithH"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithH"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithH"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithH"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithH"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithH"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithH"));
				break;
			}
			break;
		case 'I':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithI"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithI"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithI"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithI"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithI"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithI"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithI"));
				break;
			}
			break;
		case 'J':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithJ"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithJ"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithJ"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithJ"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithJ"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithJ"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithJ"));
				break;
			}
			break;
		case 'K':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithK"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithK"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithK"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithK"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithK"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithK"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithK"));
				break;
			}
			break;
		case 'L':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithL"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithL"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithL"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithL"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithL"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithL"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithL"));
				break;
			}
			break;
		case 'M':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithM"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithM"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithM"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithM"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithM"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithM"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithM"));
				break;
			}
			break;
		case 'N':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithN"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithN"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithN"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithN"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithN"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithN"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithN"));
				break;
			}
			break;
		case 'O':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithO"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithO"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithO"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithO"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithO"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithO"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithO"));
				break;
			}
			break;
		case 'P':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithP"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithP"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithP"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithP"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithP"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithP"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithP"));
				break;
			}
			break;
		case 'Q':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithQ"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithQ"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithQ"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithQ"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithQ"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithQ"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithQ"));
				break;
			}
			break;
		case 'R':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithR"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithR"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithR"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithR"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithR"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithR"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithR"));
				break;
			}
			break;
		case 'S':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithS"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithS"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithS"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithS"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithS"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithS"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithS"));
				break;
			}
			break;
		case 'T':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithT"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithT"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithT"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithT"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithT"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithT"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithT"));
				break;
			}
			break;
		case 'U':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithU"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithU"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithU"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithU"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithU"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithU"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithU"));
				break;
			}
			break;
		case 'V':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithV"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithV"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithV"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithV"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithV"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithV"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithV"));
				break;
			}
			break;
		case 'W':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithW"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithW"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithW"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithW"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithW"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithW"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithW"));
				break;
			}
			break;
		case 'X':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithX"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithX"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithX"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithX"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithX"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithX"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithX"));
				break;
			}
			break;
		case 'Y':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithY"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithY"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithY"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithY"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithY"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithY"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithY"));
				break;
			}
			break;
		case 'Z':
			switch (len) {
			case 1:
			case 2:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithZ"));
				break;
			case 3:
				scan = new Scanner(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithZ"));
				break;
			case 4:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithZ"));
				break;
			case 5:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithZ"));
				break;
			case 6:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithZ"));
				break;
			case 7:
				scan = new Scanner(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithZ"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithZ"));
				break;
			}
			break;
		default:
			return false; // Does not start with an alphabetic letter
		}
		while (scan.hasNextLine()) {
			String scrabbleWord = scan.nextLine();
			if (scrabbleWord.equals(word)) {
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
		return returnChars;
	}
	
	public static Stack<String> stringStackToMasterScrabbleWordList(Stack<String> stringStack){
		return null;
	}
	
	public static String[] charArrayToMasterScrabbleWordList(char[] charArray) {
		return null;
	}
	
	public static void main(String[] args) {
		try {
//			String word = new String(randomLetterGenerator(3));
			String word = "dude";
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
