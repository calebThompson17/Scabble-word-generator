import java.awt.geom.Point2D;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * The ScrabbleWord method models a word in the game of Scrabble
 * @author Caleb Thompson
 * @version Version 1
 */
public class ScrabbleWord {
	// class variables
	private String word;
	private int score;
	private String definition;
	private Point2D.Float startingLocation;
	private Point2D.Float endingLocation;
	
	
	/**
	 * Constructor for the ScrabbleWord class.
	 * @param word String, the word for which the ScrabbleWord will be modeled
	 * @throws IOException
	 */
	public ScrabbleWord(String word) throws IOException{
		this(word, -1, -1, -1, -1);
	}
	
	/**
	 * Constructor for ScrabbleWord class.
	 * @param word String, the word for which the ScrabbleWord will be modeled
	 * @param startingX int, the X-coordinate of the startingLocation of the word on the board
	 * @param startingY int, the Y-coordinate of the startingLocation of the word on the board
	 * @param endingX int, the X-coordinate of the endingLocation of the word on the board
	 * @param endingY int, the Y-coordinate of the endingLocation of the word on the board
	 * @throws IOException
	 */
	public ScrabbleWord(String word, int startingX, int startingY, int endingX, int endingY) throws IOException {
		this.word = word;
		definition = findDefinition(word);
		score = calculateScore(word);
		startingLocation = new Point2D.Float(startingX, startingY);
		endingLocation = new Point2D.Float(endingX, endingY);
	}
	
	/**
	 * getter returning the word attribute
	 * @return String, word
	 */
	public String getWord() {
		return word;
	}
	
	/**
	 * getter returning the score attribute
	 * @return int, score
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * getter returning the definition attribute
	 * @return String, definition
	 */
	public String getDefinition() {
		return definition;
	}

	/**
	 * The setStartingRowLocation method sets the row, or X-coordinate
	 *  of the object's startingLocation on a Scrabble board
	 * @param x int, the row, or X-coordinate of the object's startingLocation
	 */
	public void setStartingRowLocation(int x) {
		startingLocation = new Point2D.Float(x, (float) startingLocation.getY());
	}
	
	/**
	 * The setStartingColumnLocation method sets the column, or Y-coordinate
	 *  of the object's startingLocation on a Scrabble board
	 * @param y int, the column, or Y-coordinate of the object's startingLocation
	 */
	public void setStartingColumnLocation(int y) {
		startingLocation = new Point2D.Float((float) startingLocation.getX(), y);
	}
	
	/**
	 * The setStartingLocation sets the X- and Y- coordinates
	 *  of the object's startingLocation on a Scrabble board
	 * @param x int, the row, or X-coordinate of the object's startingLocation
	 * @param y int, the column, or Y-coordinate of the object's startingLocation
	 */
	public void setStartingLocation(int x, int y) {
		startingLocation = new Point2D.Float(x, y);
	}
	
	/**
	 * getter returning the startingLocation attribute
	 * @return Point2D.Float, startingLocation
	 */
	public Point2D.Float getStartingLocation(){
		return startingLocation;
	}

	/**
	 * The setEndingRowLocation method sets the row, or X-coordinate
	 *  of the object's endingLocation on a Scrabble board
	 * @param x int, the row, or X-coordinate of the object's endingLocation
	 */
	public void setEndingRowLocation(int x) {
		endingLocation = new Point2D.Float(x, (float) endingLocation.getY());
	}
	
	/**
	 * The setEndingColumnLocation method sets the column, or Y-coordinate
	 *  of the object's endingLocation on a Scrabble board
	 * @param y int, the column, or Y-coordinate of the object's endingLocation
	 */
	public void setEndingColumnLocation(int y) {
		endingLocation = new Point2D.Float((float) endingLocation.getX(), y);
	}
	
	/**
	 * The setEndingLocation sets the X- and Y- coordinates
	 *  of the object's endingLocation on a Scrabble board
	 * @param x int, the row, or X-coordinate of the object's endingLocation
	 * @param y int, the column, or Y-coordinate of the object's endingLocation
	 */
	public void setEndingLocation(int x, int y) {
		endingLocation = new Point2D.Float(x, y);
	}
	
	/**
	 * getter returning the startingLocation attribute
	 * @return Point2D.Float, endingLocation
	 */
	public Point2D.Float getEndingLocation(){
		return endingLocation;
	}
	
	/**
	 * The findDefinition method finds the definition for wordp
	 * @param wordp String, a word
	 * @return String, definition of the parameter wordp
	 * @throws IOException
	 */
	public static String findDefinition(String wordp) throws IOException {
		String word = wordp.toUpperCase();
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
		String filename = "docs" + separator + "defineWordLengthStartingWith" + 
		        separator + wordLength + "LetterWords" + separator + "define" + 
				wordLength + "LetterWordsStartingWith" + word.charAt(0);
		Scanner scan = new Scanner(new File(filename));
		String word_definition = "No definition";
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			int i = line.indexOf('\t');
			String dictionary_word = line.substring(0, i);
			if (dictionary_word.equals(word)) {
				word_definition = line.substring(i + 1);
				break;
			}
			if (dictionary_word.compareTo(word) > 0) {
				break;
			}
		}
		scan.close();
		return word_definition;
	}
	
	/**
	 * The calculateScore method calculates the score for the parameter word
	 * @param word String, a word
	 * @return int, the Scrabble score for only the letters composing the word
	 */
	public static int calculateScore(String word) {
		HashMap<Character, Integer> letterValue = new HashMap<>();
		letterValue.put('A', 1);
		letterValue.put('B', 3);
		letterValue.put('C', 3);
		letterValue.put('D', 2);
		letterValue.put('E', 1);
		letterValue.put('F', 4);
		letterValue.put('G', 2);
		letterValue.put('H', 4);
		letterValue.put('I', 1);
		letterValue.put('J', 8);
		letterValue.put('K', 5);
		letterValue.put('L', 1);
		letterValue.put('M', 3);
		letterValue.put('N', 1);
		letterValue.put('O', 1);
		letterValue.put('P', 3);
		letterValue.put('Q', 10);
		letterValue.put('R', 1);
		letterValue.put('S', 1);
		letterValue.put('T', 1);
		letterValue.put('U', 1);
		letterValue.put('V', 4);
		letterValue.put('W', 4);
		letterValue.put('X', 8);
		letterValue.put('Y', 4);
		letterValue.put('Z', 10);
		int score = 0;
		word = word.toUpperCase();
		for (int i = 0; i < word.length(); ++i) {
			score += letterValue.get(word.charAt(i));
		}
		return score;
	}

	/**
	 * This method overrides the built-in toString method
	 * @return String, word attribute
	 */
	@Override
	public String toString() {
		return this.word;
	}
	
	/**
	 * This method overrides the built-in equals method
	 * @return boolean: true,  if two ScrabbleWords have the same word and locations attributes
	 *                  false, otherwise
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ScrabbleWord) {
			ScrabbleWord other = (ScrabbleWord) obj;
			if ((this.word == other.word) && 
					(this.startingLocation == other.startingLocation) && 
					(this.endingLocation == other.endingLocation)) {
				return true;
			}
		}
		return false;
	}
	
}
