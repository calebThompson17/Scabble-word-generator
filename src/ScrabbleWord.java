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
	
	public static String findDefinition(String word) throws IOException {
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

}
