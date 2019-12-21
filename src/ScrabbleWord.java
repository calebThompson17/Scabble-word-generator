import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ScrabbleWord {
	// class variables
	private String word;
	private int score;
	private String definition;
	
	ScrabbleWord(String word) throws IOException{
		this.word = word;
		definition = findDefinition(word);
		score = calculateScore(word);
	}
	
	public String getword() {
		return word;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getDefinition() {
		return definition;
	}
	
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

	@Override
	public String toString() {
		return this.word;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ScrabbleWord) {
			ScrabbleWord other = (ScrabbleWord) obj;
			if (this.word == other.word) {
				return true;
			}
		}
		return false;
	}
	
}
