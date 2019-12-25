import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Math;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;

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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithA"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithA"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithA"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithA"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithA"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithA"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithA"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithA"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithB"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithB"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithB"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithB"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithB"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithB"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithB"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithB"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithC"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithC"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithC"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithC"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithC"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithC"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithC"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithC"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithD"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithD"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithD"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithD"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithD"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithD"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithD"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithD"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithE"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithE"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithE"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithE"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithE"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithE"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithE"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithE"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithF"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithF"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithF"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithF"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithF"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithF"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithF"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithF"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithG"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithG"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithG"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithG"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithG"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithG"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithG"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithG"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithH"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithH"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithH"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithH"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithH"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithH"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithH"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithH"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithI"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithI"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithI"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithI"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithI"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithI"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithI"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithI"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithJ"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithJ"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithJ"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithJ"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithJ"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithJ"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithJ"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithJ"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithK"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithK"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithK"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithK"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithK"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithK"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithK"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithK"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithL"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithL"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithL"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithL"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithL"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithL"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithL"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithL"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithM"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithM"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithM"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithM"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithM"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithM"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithM"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithM"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithN"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithN"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithN"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithN"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithN"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithN"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithN"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithN"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithO"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithO"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithO"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithO"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithO"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithO"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithO"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithO"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithP"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithP"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithP"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithP"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithP"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithP"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithP"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithP"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithQ"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithQ"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithQ"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithQ"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithQ"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithQ"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithQ"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithQ"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithR"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithR"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithR"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithR"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithR"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithR"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithR"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithR"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithS"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithS"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithS"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithS"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithS"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithS"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithS"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithS"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithT"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithT"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithT"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithT"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithT"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithT"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithT"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithT"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithU"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithU"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithU"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithU"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithU"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithU"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithU"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithU"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithV"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithV"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithV"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithV"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithV"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithV"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithV"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithV"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithW"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithW"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithW"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithW"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithW"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithW"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithW"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithW"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithX"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithX"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithX"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithX"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithX"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithX"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithX"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithX"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithY"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithY"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithY"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithY"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithY"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithY"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithY"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithY"));
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
			case 8:
				scan = new Scanner(new File("docs/wordLengthStartingWith/eightLetterWords/eightLetterWordsStartingWithZ"));
				break;
			case 9:
				scan = new Scanner(new File("docs/wordLengthStartingWith/nineLetterWords/nineLetterWordsStartingWithZ"));
				break;
			case 10:
				scan = new Scanner(new File("docs/wordLengthStartingWith/tenLetterWords/tenLetterWordsStartingWithZ"));
				break;
			case 11:
				scan = new Scanner(new File("docs/wordLengthStartingWith/elevenLetterWords/elevenLetterWordsStartingWithZ"));
				break;
			case 12:
				scan = new Scanner(new File("docs/wordLengthStartingWith/twelveLetterWords/twelveLetterWordsStartingWithZ"));
				break;
			case 13:
				scan = new Scanner(new File("docs/wordLengthStartingWith/thirteenLetterWords/thirteenLetterWordsStartingWithZ"));
				break;
			case 14:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fourteenLetterWords/fourteenLetterWordsStartingWithZ"));
				break;
			default:
				scan = new Scanner(new File("docs/wordLengthStartingWith/fifteenLetterWords/fifteenLetterWordsStartingWithZ"));
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
//			System.out.println("randomNum: " + randomNum + "\t  letter: " + letter);
			returnChars[i] = letter;
		}
		return returnChars;
	}
	
	private static boolean isSubpart(String word) throws FileNotFoundException {
		String separator = System.getProperty("file.separator");
		String wordLength;
		switch (word.length()) {
		case 2:
			wordLength = "two";
			break;
		case 3:
			wordLength = "three";
			break;
		case 4:
			wordLength = "four";
			break;
		case 5:
			wordLength = "five";
			break;
		case 6:
			wordLength = "six";
			break;
		case 7:
			wordLength = "seven";
			break;
		case 8:
			wordLength = "eight";
			break;
		case 9:
			wordLength = "nine";
			break;
		case 10:
			wordLength = "ten";
			break;
		case 11:
			wordLength = "eleven";
			break;
		case 12:
			wordLength = "twelve";
			break;
		case 13:
			wordLength = "thirteen";
			break;
		case 14:
			wordLength = "fourteen";
			break;
		case 15:
			wordLength = "fifteen";
			break;
		default:
			wordLength = "no length";
		}
		String filename = "docs" + separator + "subpartStartingWith" + 
		        separator + wordLength + "LetterSubparts" + separator + 
				wordLength + "LetterSubpartsStartingWith" + word.charAt(0);
		Scanner scan = new Scanner(new File(filename));
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			if (line.equals(word)) {
				scan.close();
				return true;
			}
			if (line.compareTo(word) > 0) {
				scan.close();
				return false;
			}
		}
		scan.close();
		return false;
	}
	
	private static void characterArrayListToSetLengthScrabbleWordList(ArrayList <ScrabbleWord> wordList, ArrayList <Character> charList, ArrayList <Character> charWord) throws IOException {
		int arrayLengthRemaining = charList.size();
		for (int i = 0; i < arrayLengthRemaining; ++i) {
			charWord.add(charList.remove(i));
			String word = "";
			for (int j = 0; j < charWord.size(); ++j) {
				word += "" + charWord.get(j);
			}
			boolean isSubpart = true;
			if (word.length() > 1) {
//				System.out.println("Potential word: " + word);
				if (isScrabbleWord(word)) {
					ScrabbleWord wordScrabble = new ScrabbleWord(word);
					boolean wordListContainsNewWord = false;
					for (int j = 0; j < wordList.size(); ++j) {
						if (wordScrabble.getWord().equals(wordList.get(j).getWord())) {
							wordListContainsNewWord = true;
							break;
						}
					}
//					if (!wordList.contains(wordScrabble)) {
					if (!wordListContainsNewWord) {
						wordList.add(wordScrabble);
//						System.out.println("\tReal Scrabble Word:" + wordScrabble);
					}
				}
				isSubpart = isSubpart(word);
//				System.out.println("Checking if " + word + " is a subpart: " + isSubpart);
			}
			if (isSubpart) {
				if (arrayLengthRemaining == 2) {
					charWord.add(charList.remove(0));
					word += charWord.get(charWord.size() - 1);
//					System.out.println("Potential word: " + word);
					if (isScrabbleWord(word)) {
						ScrabbleWord wordScrabble = new ScrabbleWord(word);
						boolean wordListContainsNewWord = false;
						for (int j = 0; j < wordList.size(); ++j) {
							if (wordScrabble.getWord().equals(wordList.get(j).getWord())) {
								wordListContainsNewWord = true;
								break;
							}
						}
//						if (!wordList.contains(wordScrabble)) {
						if (!wordListContainsNewWord) {
							wordList.add(wordScrabble);
//							System.out.println("\tReal Scrabble Word:" + wordScrabble);
						}
					}
					charList.add(0, charWord.remove(charWord.size() - 1));
				}
				else {
					characterArrayListToSetLengthScrabbleWordList(wordList, charList, charWord);
				}
			}
			charList.add(i, charWord.remove(charWord.size() - 1));
		}
		return;
	}

	public static void charArrayToSetLengthScrabbleWordList(ArrayList <ScrabbleWord> wordList, char[] charArrayp) throws IOException {
		if (charArrayp.length < 2) {
			return;
		}
		ArrayList <Character> charList = new ArrayList<>();
		for (int i = 0; i < charArrayp.length; ++i) {
			charList.add(charArrayp[i]);
		}
		ArrayList <Character> charWord = new ArrayList<>();
		characterArrayListToSetLengthScrabbleWordList(wordList, charList, charWord);
		return;
	}
	
	public static void sortByScrabbleScore(ArrayList <ScrabbleWord> wordList) {
		boolean hasChanged = true;
		while (hasChanged) {
			hasChanged = false;
			for (int i = 0; i < wordList.size() - 1; ++i) {
				if (wordList.get(i + 1).getScore() > wordList.get(i).getScore()) {
					wordList.add(i, wordList.remove(i + 1));
					hasChanged = true;
				}
				else if (wordList.get(i + 1).getScore() == wordList.get(i).getScore()) {
					if (wordList.get(i + 1).getWord().compareTo(wordList.get(i).getWord()) < 0) {
						wordList.add(i, wordList.remove(i + 1));
						hasChanged = true;
					}
				}
			}
		}
		return;
	}
	
	public static void printScrabbleWordList(ArrayList <ScrabbleWord> wordList) {
		System.out.println("#:\tWord:\tScore:");
		for (int i = 0; i < wordList.size(); ++i) {
			ScrabbleWord word = wordList.get(i);
			System.out.println(i + 1 + ":\t" + word.getWord() + "\t" + word.getScore());
		}
		return;
	}
	
	public static void main(String[] args) {
		try {
			String word = new String(randomLetterGenerator(7));
//			String word = "SH";
			System.out.println(word + " is a word: " + isScrabbleWord(word));
			ScrabbleWord sWord = new ScrabbleWord(word);
			System.out.println(sWord.getWord() + " score: " + sWord.getScore());
			System.out.println(sWord.getWord() + ": " + sWord.getDefinition());
			
			ArrayList <ScrabbleWord> wordList = new ArrayList<>();
			charArrayToSetLengthScrabbleWordList(wordList, word.toCharArray());
			System.out.println("\n" + wordList);
			printScrabbleWordList(wordList);
			sortByScrabbleScore(wordList);
			printScrabbleWordList(wordList);
			
			System.out.println("\nFinished executing wordGenerator");
		}
		catch (IOException excpt) {
			System.out.println("Caught IOException: " + excpt.getMessage());
		}
	}

}
