import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Math;
import java.time.Instant;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * This wordGenerator reads through the txt files produced in DocGenerator.java
 *  and considers any possible Scrabble board,
 *  analyzing possible words and making calculated moves.
 * 
 * @author Caleb Thompson
 * @version Version 1
 */
public class wordGenerator {
	// class attributes
	private char[] rack;
	private ArrayList <ScrabbleWord> wordList;
	private char[][] scrabbleBoard;
	
	/**
	 * constructor for wordGenerator class
	 */
	public wordGenerator() {
		this.rack = new char[] {'0', '0', '0', '0', '0', '0', '0'};
		this.wordList = new ArrayList<ScrabbleWord>();
		this.scrabbleBoard = new char[][] 
			{{'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
			 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
			 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
			 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
			 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
			 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
			 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
			 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
			 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
			 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
			 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
			 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
			 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
			 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
			 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'}};
	}
	
	/**
	 * The setLetterOnRack method puts a letter on the rack[] attribute
	 *  at the first space that is occupied by a null character
	 * @param character char
	 */
	public void setLetterOnRack(char character) {
		int index = 0;
		for (int i = 0; i < rack.length; ++i) {
			if (rack[i] == '0') {
				index = i;
				break;
			}
		}
		rack[index] = character;
	}
	
	/**
	 * The setLettersOnRack method adds the chars in the charArray
	 *  to the rack attribute if there is available room on the rack
	 * @param charArray char[], array of Scrabble letters
	 */
	public void setLettersOnRack(char[] charArray) {
		int index = 0;
		for (int i = 0; i < charArray.length; ++i) {
			boolean foundOpenSpace = false;
			for (int j = index; j < rack.length; ++j) {
				if (rack[j] == '0') {
					index = j;
					foundOpenSpace = true;
					break;
				}
			}
			if (foundOpenSpace) {
				rack[index] = charArray[i];
			}
			else {
				break;
			}
		}
	}
	
	/**
	 * The getLetterFromRack method returns the letter
	 *  at the specified index on the rack[] attribute
	 * @param i int, index of the rack[]
	 * @return char
	 */
	public char getLetterFromRack(int i) {
		return rack[i];
	}
	
	/**
	 * The setScrabbleBoard method sets an object's scrabbleBoard attribute
	 * @param board char[][], a 15 by 15 char 2D array representing a Scrabble board
	 */
	public void setScrabbleBoard(char[][] board) {
		if ((board.length == 15) && (board[0].length == 15)) {
			for (int row = 0; row < board.length; ++row) {
				for (int col = 0; col < board[0].length; ++col) {
					char element = board[row][col];
					if (!((element >= 'A') && (element <= 'Z')
							|| (element == '0'))) {
						return;
					}
				}
			}
			this.scrabbleBoard = board;
		}
	} 
	
	/**
	 * The clearWordList method clears an object's wordList attribute
	 */
	public void clearWordList() {
		wordList.clear();
	}
	
	
	public void getHorizontalPerpendicularWordsInOneRow(
			ArrayList <ScrabbleWord> wordList, ArrayList <Character> charList,
			ArrayList <Character> charWord, char[] row, int numCharsToAdd) {
		// method stub
	}
	
	
	public void getHorizontalPerpendicularWordsInOneRow(char[] row, int rowNum, int numCharsToAdd) {
		
		
		// find min and max indexes for rack starting letter
		//  scan the lines from right to left
		//  building the words from left to right
	}
	
	/**
	 * The isScrabbleWord method scans the files
	 *  within the "docs/wordLengthStartingWith" directory
	 *  returning a boolean value determining whether the
	 *  String parameter wordP value was found in those files
	 * @param wordP String, word
	 * @return boolean: true,  if wordP is a Scrabble word
	 *                  false, if wordP is not a Scrabble word
	 * @throws IOException
	 */
	public static boolean isScrabbleWord(String wordP) throws IOException {
		String word = wordP.trim().toUpperCase();
		if ((word.length() <= 1) || (word.length() > 15)) {
			return false;
		}
		String filename = DocGenerator.getWordLengthStartingWithFileName(word.length(), word.charAt(0));
		Scanner scan = new Scanner(new File(filename));
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
	
	/**
	 * The randomLetterGenerator method returns a char[] with randomly generated letters
	 * @param num int, length of the char[] returned
	 * @return char[] containing randomly generated letters
	 */
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
	
	/**
	 * The isSubpart method determines whether the parameter word
	 *  is a subpart of another existing Scrabble word
	 * @param word String, possible subpart
	 * @return boolean: true,  if parameter word is a subpart
	 *                  false, if parameter word is a subpart
	 * @throws FileNotFoundException
	 */
	private static boolean isSubpart(String word) throws IOException {
		String filename = DocGenerator.getSubpartStartingWithFileName(word.length(), word.charAt(0));
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
	
	/**
	 * The characterArrayListToSetLengthScrabbleWordList method
	 *  discovers all the possible Scrabble word combinations from the letters given
	 * @param wordList ArrayList <ScrabbleWord>, list of Scrabble words
	 * @param charList ArrayList <Character>, list of remaining characters to produce words
	 * @param charWord ArrayList <Character>, list of characters building the current word
	 * @throws IOException
	 */
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

	/**
	 * The charArrayToSetLengthScrabbleWordList method
	 *  calls the characterArrayListToSetLengthScrabbleWordList private method
	 *  with the proper additional parameters
	 * @param wordList ArrayList <ScrabbleWord>, list of Scrabble words
	 * @param charArrayp char[], letters that can be arranged in any manner
	 * @throws IOException
	 */
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
	
	private ArrayList<String> wordsContainingEnoughLetters(char[] lettersOnBoard) throws FileNotFoundException{
		ArrayList<String> wordsContainingEnoughLettersList = new ArrayList<>();
		ArrayList<Character> lettersRemaining = new ArrayList<>();
		for (int i = 0; i < rack.length; ++i) {
			lettersRemaining.add(rack[i]);
		}
		for (int i = 0; i < lettersOnBoard.length; ++i) {
			if (!Character.isDigit(lettersOnBoard[i])) {
				lettersRemaining.add(rack[i]);
			}
		}
		Scanner scan = new Scanner(new File(DocGenerator.getWordLengthStartingWithFileName(3, 'A')));
		scan.close();
//		Scanner scan = new Scanner(new File(DocGenerator.getWordLengthStartingWithFileName(3, 'A')));
//		scan.close();
		//Not exactly sure how to solve the multiple scanner problem right now
		
		
		
		return wordsContainingEnoughLettersList;
	}
	
	public void getScrabbleWords() {
		// rough rough start to a method
		for (int row = 0; row < scrabbleBoard.length; ++row) {
			//this must later be changed to consider parallel words
			boolean rowIsEmpty = true;
			for (int col = 0; col < scrabbleBoard[0].length; ++col) {
				if (!Character.isDigit(scrabbleBoard[row][col])) {
					rowIsEmpty = false;
				}
			}
			if (!rowIsEmpty) {
//				ArrayList<>  // call methods????
			}
		}
		
	}
	
	/**
	 * The sortByScrabbleScore method sorts the wordList
	 *  in order from highest score to lowest score.
	 *  If two words have the same score, they are ordered alphabetically.
	 * @param wordList ArrayList <ScrabbleWord>, list of Scrabble words
	 */
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
	
	/**
	 * The printScrabbleWordList method prints the Scrabble wordList
	 *  in the following format with 3 columns:
	 *  Number of Words:  Word itself:  Word's Score:
	 *  #:                Word:	        Score:
	 * @param wordList ArrayList <ScrabbleWord>, list of Scrabble words
	 */
	public static void printScrabbleWordList(ArrayList <ScrabbleWord> wordList) {
		System.out.println("#:\tWord:\tScore:");
		for (int i = 0; i < wordList.size(); ++i) {
			ScrabbleWord word = wordList.get(i);
			System.out.println(i + 1 + ":\t" + word.getWord() + "\t" + word.getScore());
		}
		return;
	}
	
	public static void printTimeDifference(Instant start, Instant end) {
		System.out.println("Using printTimeDifference method:");
		// record this info in a separate doc for future comparison purposes
		long startEpochSeconds = start.getEpochSecond();
		int startNanoSeconds = start.getNano();
		long endEpochSeconds = end.getEpochSecond();
		int endNanoSeconds = end.getNano();
		System.out.println("Start time: " + startEpochSeconds + "." + startNanoSeconds);
		System.out.println("End time: " + endEpochSeconds + "." + endNanoSeconds);
		long epochSecondsDifference = endEpochSeconds - startEpochSeconds;
		int nanoSecondsDifference = endNanoSeconds - startNanoSeconds;
		while (nanoSecondsDifference < 0) {
			--epochSecondsDifference;
			nanoSecondsDifference += 1000000000;
		}
		System.out.println("This program took:");
		System.out.println(String.format("%,d seconds and ", epochSecondsDifference));
		System.out.println(String.format("%,d nanoseconds", nanoSecondsDifference));
		return;
	}
	
	/**
	 * The testingStaticMethods method provides some of the original tests
	 *  used for testing this class's static methods.
	 * @throws IOException
	 */
	public static void testingStaticMethods() throws IOException {
//		String word = new String(randomLetterGenerator(7));
//		String word = "nickdehoust";
		String word = "MICHAEL";
//		System.out.println(word + " is a word: " + isScrabbleWord(word));
		ScrabbleWord sWord = new ScrabbleWord(word);
//		System.out.println(sWord.getWord() + " score: " + sWord.getScore());
//		System.out.println(sWord.getWord() + ": " + sWord.getDefinition());
		
		System.out.println();
		ArrayList <ScrabbleWord> wordList = new ArrayList<>();
		charArrayToSetLengthScrabbleWordList(wordList, word.toCharArray());
//		System.out.println(wordList);
//		printScrabbleWordList(wordList);
		sortByScrabbleScore(wordList);
		System.out.println("Using the charArrayToSetLengthScrabbleWordList method:");
		printScrabbleWordList(wordList);
	}
	
	public static void main(String[] args) {
		try {
			Instant startTime = Instant.now();
			String word = "HOUSE";
			System.out.println(word + " is a word: " + isScrabbleWord(word));
			ScrabbleWord sWord = new ScrabbleWord(word);
			System.out.println(sWord.getWord() + " score: " + sWord.getScore());
			System.out.println(sWord.getWord() + ": " + sWord.getDefinition());
			testingStaticMethods();
			
			wordGenerator wG = new wordGenerator();
			char[] charArray = randomLetterGenerator(7);
			wG.setLettersOnRack(charArray);

			char[][] scrabbleBoard = new char[][] 
				{{'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
				 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
				 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
				 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
				 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
				 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
				 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
				 {'0', '0', '0', '0', '0', '0', '0', 'A', '0', '0', '0', '0', '0', '0', '0'},
				 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
				 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
				 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
				 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
				 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
				 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
				 {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'}};
			wG.setScrabbleBoard(scrabbleBoard);
			
			
			
			
			// Build the methods to use the letters in the rack to analyze a Scrabble board
			//  Analyze horizontal methods first
			//  Analyze vertical methods next
			//  Analyze parallel methods
			
			// Consider the edges of the board
			
			
			Instant endTime = Instant.now();
			printTimeDifference(startTime, endTime);
			System.out.println("\nFinished executing wordGenerator");
		}
		catch (IOException excpt) {
			System.out.println("Caught IOException: " + excpt.getMessage());
		}
	}

}
