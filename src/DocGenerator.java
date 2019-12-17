import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

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
		int count = 0;
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
//			line = line.strip();
			int i = line.indexOf('\t');
			String dictionary_word = line.substring(0,i);
			String word_definition = line.substring(i); // with tab in the front
			pw.println(dictionary_word);
			if (dictionary_word.length() == 16) {
				System.out.println(count + ": " + dictionary_word);
				++count;
			}
		}
		scan.close();
		pw.close();
	}
	
	public static void generateWordsStartingWithFiles() throws IOException {
		Scanner scan = new Scanner(new File("docs/masterWordList"));
		PrintWriter pwA = new PrintWriter(new File("docs/wordsStartingWith/StartingWithA"));
		PrintWriter pwB = new PrintWriter(new File("docs/wordsStartingWith/StartingWithB"));
		PrintWriter pwC = new PrintWriter(new File("docs/wordsStartingWith/StartingWithC"));
		PrintWriter pwD = new PrintWriter(new File("docs/wordsStartingWith/StartingWithD"));
		PrintWriter pwE = new PrintWriter(new File("docs/wordsStartingWith/StartingWithE"));
		PrintWriter pwF = new PrintWriter(new File("docs/wordsStartingWith/StartingWithF"));
		PrintWriter pwG = new PrintWriter(new File("docs/wordsStartingWith/StartingWithG"));
		PrintWriter pwH = new PrintWriter(new File("docs/wordsStartingWith/StartingWithH"));
		PrintWriter pwI = new PrintWriter(new File("docs/wordsStartingWith/StartingWithI"));
		PrintWriter pwJ = new PrintWriter(new File("docs/wordsStartingWith/StartingWithJ"));
		PrintWriter pwK = new PrintWriter(new File("docs/wordsStartingWith/StartingWithK"));
		PrintWriter pwL = new PrintWriter(new File("docs/wordsStartingWith/StartingWithL"));
		PrintWriter pwM = new PrintWriter(new File("docs/wordsStartingWith/StartingWithM"));
		PrintWriter pwN = new PrintWriter(new File("docs/wordsStartingWith/StartingWithN"));
		PrintWriter pwO = new PrintWriter(new File("docs/wordsStartingWith/StartingWithO"));
		PrintWriter pwP = new PrintWriter(new File("docs/wordsStartingWith/StartingWithP"));
		PrintWriter pwQ = new PrintWriter(new File("docs/wordsStartingWith/StartingWithQ"));
		PrintWriter pwR = new PrintWriter(new File("docs/wordsStartingWith/StartingWithR"));
		PrintWriter pwS = new PrintWriter(new File("docs/wordsStartingWith/StartingWithS"));
		PrintWriter pwT = new PrintWriter(new File("docs/wordsStartingWith/StartingWithT"));
		PrintWriter pwU = new PrintWriter(new File("docs/wordsStartingWith/StartingWithU"));
		PrintWriter pwV = new PrintWriter(new File("docs/wordsStartingWith/StartingWithV"));
		PrintWriter pwW = new PrintWriter(new File("docs/wordsStartingWith/StartingWithW"));
		PrintWriter pwX = new PrintWriter(new File("docs/wordsStartingWith/StartingWithX"));
		PrintWriter pwY = new PrintWriter(new File("docs/wordsStartingWith/StartingWithY"));
		PrintWriter pwZ = new PrintWriter(new File("docs/wordsStartingWith/StartingWithZ"));
		while (scan.hasNextLine()) {
			String word = scan.nextLine();
			switch (word.substring(0,1).toUpperCase()) {
			case "A":
				pwA.println(word);
				break;
			case "B":
				pwB.println(word);
				break;
			case "C":
				pwC.println(word);
				break;
			case "D":
				pwD.println(word);
				break;
			case "E":
				pwE.println(word);
				break;
			case "F":
				pwF.println(word);
				break;
			case "G":
				pwG.println(word);
				break;
			case "H":
				pwH.println(word);
				break;
			case "I":
				pwI.println(word);
				break;
			case "J":
				pwJ.println(word);
				break;
			case "K":
				pwK.println(word);
				break;
			case "L":
				pwL.println(word);
				break;
			case "M":
				pwM.println(word);
				break;
			case "N":
				pwN.println(word);
				break;
			case "O":
				pwO.println(word);
				break;
			case "P":
				pwP.println(word);
				break;
			case "Q":
				pwQ.println(word);
				break;
			case "R":
				pwR.println(word);
				break;
			case "S":
				pwS.println(word);
				break;
			case "T":
				pwT.println(word);
				break;
			case "U":
				pwU.println(word);
				break;
			case "V":
				pwV.println(word);
				break;
			case "W":
				pwW.println(word);
				break;
			case "X":
				pwX.println(word);
				break;
			case "Y":
				pwY.println(word);
				break;
			case "Z":
				pwZ.println(word);
				break;
			}
		}
		scan.close();
		pwA.close();
		pwB.close();
		pwC.close();
		pwD.close();
		pwE.close();
		pwF.close();
		pwG.close();
		pwH.close();
		pwI.close();
		pwJ.close();
		pwK.close();
		pwL.close();
		pwM.close();
		pwN.close();
		pwO.close();
		pwP.close();
		pwQ.close();
		pwR.close();
		pwS.close();
		pwT.close();
		pwU.close();
		pwV.close();
		pwW.close();
		pwX.close();
		pwY.close();
		pwZ.close();
	}
	
	public static void generateWordLengthStartingWithFiles() throws IOException {
		Scanner scan = new Scanner(new File("docs/masterWordList"));
		PrintWriter pw2A = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithA"));
		PrintWriter pw3A = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithA"));
		PrintWriter pw4A = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithA"));
		PrintWriter pw5A = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithA"));
		PrintWriter pw6A = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithA"));
		PrintWriter pw7A = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithA"));
		PrintWriter pw8A = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithA"));
		

		PrintWriter pw2B = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithB"));
		PrintWriter pw3B = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithB"));
		PrintWriter pw4B = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithB"));
		PrintWriter pw5B = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithB"));
		PrintWriter pw6B = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithB"));
		PrintWriter pw7B = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithB"));
		PrintWriter pw8B = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithB"));
		

		PrintWriter pw2C = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithC"));
		PrintWriter pw3C = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithC"));
		PrintWriter pw4C = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithC"));
		PrintWriter pw5C = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithC"));
		PrintWriter pw6C = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithC"));
		PrintWriter pw7C = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithC"));
		PrintWriter pw8C = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithC"));
		

		PrintWriter pw2D = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithD"));
		PrintWriter pw3D = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithD"));
		PrintWriter pw4D = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithD"));
		PrintWriter pw5D = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithD"));
		PrintWriter pw6D = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithD"));
		PrintWriter pw7D = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithD"));
		PrintWriter pw8D = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithD"));
		

		PrintWriter pw2E = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithE"));
		PrintWriter pw3E = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithE"));
		PrintWriter pw4E = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithE"));
		PrintWriter pw5E = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithE"));
		PrintWriter pw6E = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithE"));
		PrintWriter pw7E = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithE"));
		PrintWriter pw8E = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithE"));
		

		PrintWriter pw2F = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithF"));
		PrintWriter pw3F = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithF"));
		PrintWriter pw4F = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithF"));
		PrintWriter pw5F = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithF"));
		PrintWriter pw6F = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithF"));
		PrintWriter pw7F = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithF"));
		PrintWriter pw8F = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithF"));
		

		PrintWriter pw2G = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithG"));
		PrintWriter pw3G = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithG"));
		PrintWriter pw4G = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithG"));
		PrintWriter pw5G = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithG"));
		PrintWriter pw6G = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithG"));
		PrintWriter pw7G = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithG"));
		PrintWriter pw8G = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithG"));
		

		PrintWriter pw2H = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithH"));
		PrintWriter pw3H = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithH"));
		PrintWriter pw4H = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithH"));
		PrintWriter pw5H = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithH"));
		PrintWriter pw6H = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithH"));
		PrintWriter pw7H = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithH"));
		PrintWriter pw8H = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithH"));
		

		PrintWriter pw2I = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithI"));
		PrintWriter pw3I = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithI"));
		PrintWriter pw4I = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithI"));
		PrintWriter pw5I = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithI"));
		PrintWriter pw6I = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithI"));
		PrintWriter pw7I = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithI"));
		PrintWriter pw8I = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithI"));
		

		PrintWriter pw2J = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithJ"));
		PrintWriter pw3J = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithJ"));
		PrintWriter pw4J = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithJ"));
		PrintWriter pw5J = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithJ"));
		PrintWriter pw6J = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithJ"));
		PrintWriter pw7J = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithJ"));
		PrintWriter pw8J = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithJ"));
		

		PrintWriter pw2K = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithK"));
		PrintWriter pw3K = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithK"));
		PrintWriter pw4K = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithK"));
		PrintWriter pw5K = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithK"));
		PrintWriter pw6K = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithK"));
		PrintWriter pw7K = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithK"));
		PrintWriter pw8K = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithK"));
		

		PrintWriter pw2L = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithL"));
		PrintWriter pw3L = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithL"));
		PrintWriter pw4L = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithL"));
		PrintWriter pw5L = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithL"));
		PrintWriter pw6L = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithL"));
		PrintWriter pw7L = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithL"));
		PrintWriter pw8L = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithL"));
		

		PrintWriter pw2M = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithM"));
		PrintWriter pw3M = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithM"));
		PrintWriter pw4M = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithM"));
		PrintWriter pw5M = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithM"));
		PrintWriter pw6M = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithM"));
		PrintWriter pw7M = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithM"));
		PrintWriter pw8M = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithM"));
		

		PrintWriter pw2N = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithN"));
		PrintWriter pw3N = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithN"));
		PrintWriter pw4N = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithN"));
		PrintWriter pw5N = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithN"));
		PrintWriter pw6N = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithN"));
		PrintWriter pw7N = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithN"));
		PrintWriter pw8N = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithN"));
		

		PrintWriter pw2O = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithO"));
		PrintWriter pw3O = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithO"));
		PrintWriter pw4O = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithO"));
		PrintWriter pw5O = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithO"));
		PrintWriter pw6O = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithO"));
		PrintWriter pw7O = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithO"));
		PrintWriter pw8O = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithO"));
		

		PrintWriter pw2P = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithP"));
		PrintWriter pw3P = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithP"));
		PrintWriter pw4P = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithP"));
		PrintWriter pw5P = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithP"));
		PrintWriter pw6P = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithP"));
		PrintWriter pw7P = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithP"));
		PrintWriter pw8P = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithP"));
		

		PrintWriter pw2Q = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithQ"));
		PrintWriter pw3Q = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithQ"));
		PrintWriter pw4Q = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithQ"));
		PrintWriter pw5Q = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithQ"));
		PrintWriter pw6Q = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithQ"));
		PrintWriter pw7Q = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithQ"));
		PrintWriter pw8Q = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithQ"));
		

		PrintWriter pw2R = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithR"));
		PrintWriter pw3R = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithR"));
		PrintWriter pw4R = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithR"));
		PrintWriter pw5R = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithR"));
		PrintWriter pw6R = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithR"));
		PrintWriter pw7R = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithR"));
		PrintWriter pw8R = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithR"));
		

		PrintWriter pw2S = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithS"));
		PrintWriter pw3S = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithS"));
		PrintWriter pw4S = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithS"));
		PrintWriter pw5S = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithS"));
		PrintWriter pw6S = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithS"));
		PrintWriter pw7S = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithS"));
		PrintWriter pw8S = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithS"));
		

		PrintWriter pw2T = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithT"));
		PrintWriter pw3T = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithT"));
		PrintWriter pw4T = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithT"));
		PrintWriter pw5T = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithT"));
		PrintWriter pw6T = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithT"));
		PrintWriter pw7T = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithT"));
		PrintWriter pw8T = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithT"));
		

		PrintWriter pw2U = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithU"));
		PrintWriter pw3U = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithU"));
		PrintWriter pw4U = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithU"));
		PrintWriter pw5U = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithU"));
		PrintWriter pw6U = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithU"));
		PrintWriter pw7U = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithU"));
		PrintWriter pw8U = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithU"));
		

		PrintWriter pw2V = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithV"));
		PrintWriter pw3V = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithV"));
		PrintWriter pw4V = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithV"));
		PrintWriter pw5V = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithV"));
		PrintWriter pw6V = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithV"));
		PrintWriter pw7V = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithV"));
		PrintWriter pw8V = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithV"));
		

		PrintWriter pw2W = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithW"));
		PrintWriter pw3W = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithW"));
		PrintWriter pw4W = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithW"));
		PrintWriter pw5W = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithW"));
		PrintWriter pw6W = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithW"));
		PrintWriter pw7W = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithW"));
		PrintWriter pw8W = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithW"));
		

		PrintWriter pw2X = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithX"));
		PrintWriter pw3X = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithX"));
		PrintWriter pw4X = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithX"));
		PrintWriter pw5X = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithX"));
		PrintWriter pw6X = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithX"));
		PrintWriter pw7X = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithX"));
		PrintWriter pw8X = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithX"));
		

		PrintWriter pw2Y = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithY"));
		PrintWriter pw3Y = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithY"));
		PrintWriter pw4Y = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithY"));
		PrintWriter pw5Y = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithY"));
		PrintWriter pw6Y = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithY"));
		PrintWriter pw7Y = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithY"));
		PrintWriter pw8Y = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithY"));
		

		PrintWriter pw2Z = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithZ"));
		PrintWriter pw3Z = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithZ"));
		PrintWriter pw4Z = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithZ"));
		PrintWriter pw5Z = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithZ"));
		PrintWriter pw6Z = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithZ"));
		PrintWriter pw7Z = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithZ"));
		PrintWriter pw8Z = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightOrMoreLetterWordsStartingWithZ"));
		
		while (scan.hasNextLine()) {
			String word = scan.nextLine();
			int len = word.length();
			switch (word.substring(0,1).toUpperCase()) {
			case "A":
				switch (len) {
				case 1:
				case 2:
					pw2A.println(word);
					break;
				case 3:
					pw3A.println(word);
					break;
				case 4:
					pw4A.println(word);
					break;
				case 5:
					pw5A.println(word);
					break;
				case 6:
					pw6A.println(word);
					break;
				case 7:
					pw7A.println(word);
					break;
				default:
					pw8A.println(word);
					break;
				}
				break;
			case "B":
				switch (len) {
				case 1:
				case 2:
					pw2B.println(word);
					break;
				case 3:
					pw3B.println(word);
					break;
				case 4:
					pw4B.println(word);
					break;
				case 5:
					pw5B.println(word);
					break;
				case 6:
					pw6B.println(word);
					break;
				case 7:
					pw7B.println(word);
					break;
				default:
					pw8B.println(word);
					break;
				}
				break;
			case "C":
				switch (len) {
				case 1:
				case 2:
					pw2C.println(word);
					break;
				case 3:
					pw3C.println(word);
					break;
				case 4:
					pw4C.println(word);
					break;
				case 5:
					pw5C.println(word);
					break;
				case 6:
					pw6C.println(word);
					break;
				case 7:
					pw7C.println(word);
					break;
				default:
					pw8C.println(word);
					break;
				}
				break;
			case "D":
				switch (len) {
				case 1:
				case 2:
					pw2D.println(word);
					break;
				case 3:
					pw3D.println(word);
					break;
				case 4:
					pw4D.println(word);
					break;
				case 5:
					pw5D.println(word);
					break;
				case 6:
					pw6D.println(word);
					break;
				case 7:
					pw7D.println(word);
					break;
				default:
					pw8D.println(word);
					break;
				}
				break;
			case "E":
				switch (len) {
				case 1:
				case 2:
					pw2E.println(word);
					break;
				case 3:
					pw3E.println(word);
					break;
				case 4:
					pw4E.println(word);
					break;
				case 5:
					pw5E.println(word);
					break;
				case 6:
					pw6E.println(word);
					break;
				case 7:
					pw7E.println(word);
					break;
				default:
					pw8E.println(word);
					break;
				}
				break;
			case "F":
				switch (len) {
				case 1:
				case 2:
					pw2F.println(word);
					break;
				case 3:
					pw3F.println(word);
					break;
				case 4:
					pw4F.println(word);
					break;
				case 5:
					pw5F.println(word);
					break;
				case 6:
					pw6F.println(word);
					break;
				case 7:
					pw7F.println(word);
					break;
				default:
					pw8F.println(word);
					break;
				}
				break;
			case "G":
				switch (len) {
				case 1:
				case 2:
					pw2G.println(word);
					break;
				case 3:
					pw3G.println(word);
					break;
				case 4:
					pw4G.println(word);
					break;
				case 5:
					pw5G.println(word);
					break;
				case 6:
					pw6G.println(word);
					break;
				case 7:
					pw7G.println(word);
					break;
				default:
					pw8G.println(word);
					break;
				}
				break;
			case "H":
				switch (len) {
				case 1:
				case 2:
					pw2H.println(word);
					break;
				case 3:
					pw3H.println(word);
					break;
				case 4:
					pw4H.println(word);
					break;
				case 5:
					pw5H.println(word);
					break;
				case 6:
					pw6H.println(word);
					break;
				case 7:
					pw7H.println(word);
					break;
				default:
					pw8H.println(word);
					break;
				}
				break;
			case "I":
				switch (len) {
				case 1:
				case 2:
					pw2I.println(word);
					break;
				case 3:
					pw3I.println(word);
					break;
				case 4:
					pw4I.println(word);
					break;
				case 5:
					pw5I.println(word);
					break;
				case 6:
					pw6I.println(word);
					break;
				case 7:
					pw7I.println(word);
					break;
				default:
					pw8I.println(word);
					break;
				}
				break;
			case "J":
				switch (len) {
				case 1:
				case 2:
					pw2J.println(word);
					break;
				case 3:
					pw3J.println(word);
					break;
				case 4:
					pw4J.println(word);
					break;
				case 5:
					pw5J.println(word);
					break;
				case 6:
					pw6J.println(word);
					break;
				case 7:
					pw7J.println(word);
					break;
				default:
					pw8J.println(word);
					break;
				}
				break;
			case "K":
				switch (len) {
				case 1:
				case 2:
					pw2K.println(word);
					break;
				case 3:
					pw3K.println(word);
					break;
				case 4:
					pw4K.println(word);
					break;
				case 5:
					pw5K.println(word);
					break;
				case 6:
					pw6K.println(word);
					break;
				case 7:
					pw7K.println(word);
					break;
				default:
					pw8K.println(word);
					break;
				}
				break;
			case "L":
				switch (len) {
				case 1:
				case 2:
					pw2L.println(word);
					break;
				case 3:
					pw3L.println(word);
					break;
				case 4:
					pw4L.println(word);
					break;
				case 5:
					pw5L.println(word);
					break;
				case 6:
					pw6L.println(word);
					break;
				case 7:
					pw7L.println(word);
					break;
				default:
					pw8L.println(word);
					break;
				}
				break;
			case "M":
				switch (len) {
				case 1:
				case 2:
					pw2M.println(word);
					break;
				case 3:
					pw3M.println(word);
					break;
				case 4:
					pw4M.println(word);
					break;
				case 5:
					pw5M.println(word);
					break;
				case 6:
					pw6M.println(word);
					break;
				case 7:
					pw7M.println(word);
					break;
				default:
					pw8M.println(word);
					break;
				}
				break;
			case "N":
				switch (len) {
				case 1:
				case 2:
					pw2N.println(word);
					break;
				case 3:
					pw3N.println(word);
					break;
				case 4:
					pw4N.println(word);
					break;
				case 5:
					pw5N.println(word);
					break;
				case 6:
					pw6N.println(word);
					break;
				case 7:
					pw7N.println(word);
					break;
				default:
					pw8N.println(word);
					break;
				}
				break;
			case "O":
				switch (len) {
				case 1:
				case 2:
					pw2O.println(word);
					break;
				case 3:
					pw3O.println(word);
					break;
				case 4:
					pw4O.println(word);
					break;
				case 5:
					pw5O.println(word);
					break;
				case 6:
					pw6O.println(word);
					break;
				case 7:
					pw7O.println(word);
					break;
				default:
					pw8O.println(word);
					break;
				}
				break;
			case "P":
				switch (len) {
				case 1:
				case 2:
					pw2P.println(word);
					break;
				case 3:
					pw3P.println(word);
					break;
				case 4:
					pw4P.println(word);
					break;
				case 5:
					pw5P.println(word);
					break;
				case 6:
					pw6P.println(word);
					break;
				case 7:
					pw7P.println(word);
					break;
				default:
					pw8P.println(word);
					break;
				}
				break;
			case "Q":
				switch (len) {
				case 1:
				case 2:
					pw2Q.println(word);
					break;
				case 3:
					pw3Q.println(word);
					break;
				case 4:
					pw4Q.println(word);
					break;
				case 5:
					pw5Q.println(word);
					break;
				case 6:
					pw6Q.println(word);
					break;
				case 7:
					pw7Q.println(word);
					break;
				default:
					pw8Q.println(word);
					break;
				}
				break;
			case "R":
				switch (len) {
				case 1:
				case 2:
					pw2R.println(word);
					break;
				case 3:
					pw3R.println(word);
					break;
				case 4:
					pw4R.println(word);
					break;
				case 5:
					pw5R.println(word);
					break;
				case 6:
					pw6R.println(word);
					break;
				case 7:
					pw7R.println(word);
					break;
				default:
					pw8R.println(word);
					break;
				}
				break;
			case "S":
				switch (len) {
				case 1:
				case 2:
					pw2S.println(word);
					break;
				case 3:
					pw3S.println(word);
					break;
				case 4:
					pw4S.println(word);
					break;
				case 5:
					pw5S.println(word);
					break;
				case 6:
					pw6S.println(word);
					break;
				case 7:
					pw7S.println(word);
					break;
				default:
					pw8S.println(word);
					break;
				}
				break;
			case "T":
				switch (len) {
				case 1:
				case 2:
					pw2T.println(word);
					break;
				case 3:
					pw3T.println(word);
					break;
				case 4:
					pw4T.println(word);
					break;
				case 5:
					pw5T.println(word);
					break;
				case 6:
					pw6T.println(word);
					break;
				case 7:
					pw7T.println(word);
					break;
				default:
					pw8T.println(word);
					break;
				}
				break;
			case "U":
				switch (len) {
				case 1:
				case 2:
					pw2U.println(word);
					break;
				case 3:
					pw3U.println(word);
					break;
				case 4:
					pw4U.println(word);
					break;
				case 5:
					pw5U.println(word);
					break;
				case 6:
					pw6U.println(word);
					break;
				case 7:
					pw7U.println(word);
					break;
				default:
					pw8U.println(word);
					break;
				}
				break;
			case "V":
				switch (len) {
				case 1:
				case 2:
					pw2V.println(word);
					break;
				case 3:
					pw3V.println(word);
					break;
				case 4:
					pw4V.println(word);
					break;
				case 5:
					pw5V.println(word);
					break;
				case 6:
					pw6V.println(word);
					break;
				case 7:
					pw7V.println(word);
					break;
				default:
					pw8V.println(word);
					break;
				}
				break;
			case "W":
				switch (len) {
				case 1:
				case 2:
					pw2W.println(word);
					break;
				case 3:
					pw3W.println(word);
					break;
				case 4:
					pw4W.println(word);
					break;
				case 5:
					pw5W.println(word);
					break;
				case 6:
					pw6W.println(word);
					break;
				case 7:
					pw7W.println(word);
					break;
				default:
					pw8W.println(word);
					break;
				}
				break;
			case "X":
				switch (len) {
				case 1:
				case 2:
					pw2X.println(word);
					break;
				case 3:
					pw3X.println(word);
					break;
				case 4:
					pw4X.println(word);
					break;
				case 5:
					pw5X.println(word);
					break;
				case 6:
					pw6X.println(word);
					break;
				case 7:
					pw7X.println(word);
					break;
				default:
					pw8X.println(word);
					break;
				}
				break;
			case "Y":
				switch (len) {
				case 1:
				case 2:
					pw2Y.println(word);
					break;
				case 3:
					pw3Y.println(word);
					break;
				case 4:
					pw4Y.println(word);
					break;
				case 5:
					pw5Y.println(word);
					break;
				case 6:
					pw6Y.println(word);
					break;
				case 7:
					pw7Y.println(word);
					break;
				default:
					pw8Y.println(word);
					break;
				}
				break;
			case "Z":
				switch (len) {
				case 1:
				case 2:
					pw2Z.println(word);
					break;
				case 3:
					pw3Z.println(word);
					break;
				case 4:
					pw4Z.println(word);
					break;
				case 5:
					pw5Z.println(word);
					break;
				case 6:
					pw6Z.println(word);
					break;
				case 7:
					pw7Z.println(word);
					break;
				default:
					pw8Z.println(word);
					break;
				}
				break;
			}
		}
		scan.close();
		pw2A.close();
		pw3A.close();
		pw4A.close();
		pw5A.close();
		pw6A.close();
		pw7A.close();
		pw8A.close();
		

		pw2B.close();
		pw3B.close();
		pw4B.close();
		pw5B.close();
		pw6B.close();
		pw7B.close();
		pw8B.close();
		

		pw2C.close();
		pw3C.close();
		pw4C.close();
		pw5C.close();
		pw6C.close();
		pw7C.close();
		pw8C.close();
		

		pw2D.close();
		pw3D.close();
		pw4D.close();
		pw5D.close();
		pw6D.close();
		pw7D.close();
		pw8D.close();
		

		pw2E.close();
		pw3E.close();
		pw4E.close();
		pw5E.close();
		pw6E.close();
		pw7E.close();
		pw8E.close();
		

		pw2F.close();
		pw3F.close();
		pw4F.close();
		pw5F.close();
		pw6F.close();
		pw7F.close();
		pw8F.close();
		

		pw2G.close();
		pw3G.close();
		pw4G.close();
		pw5G.close();
		pw6G.close();
		pw7G.close();
		pw8G.close();
		

		pw2H.close();
		pw3H.close();
		pw4H.close();
		pw5H.close();
		pw6H.close();
		pw7H.close();
		pw8H.close();
		

		pw2I.close();
		pw3I.close();
		pw4I.close();
		pw5I.close();
		pw6I.close();
		pw7I.close();
		pw8I.close();
		

		pw2J.close();
		pw3J.close();
		pw4J.close();
		pw5J.close();
		pw6J.close();
		pw7J.close();
		pw8J.close();
		

		pw2K.close();
		pw3K.close();
		pw4K.close();
		pw5K.close();
		pw6K.close();
		pw7K.close();
		pw8K.close();
		

		pw2L.close();
		pw3L.close();
		pw4L.close();
		pw5L.close();
		pw6L.close();
		pw7L.close();
		pw8L.close();
		

		pw2M.close();
		pw3M.close();
		pw4M.close();
		pw5M.close();
		pw6M.close();
		pw7M.close();
		pw8M.close();
		

		pw2N.close();
		pw3N.close();
		pw4N.close();
		pw5N.close();
		pw6N.close();
		pw7N.close();
		pw8N.close();
		

		pw2O.close();
		pw3O.close();
		pw4O.close();
		pw5O.close();
		pw6O.close();
		pw7O.close();
		pw8O.close();
		

		pw2P.close();
		pw3P.close();
		pw4P.close();
		pw5P.close();
		pw6P.close();
		pw7P.close();
		pw8P.close();
		

		pw2Q.close();
		pw3Q.close();
		pw4Q.close();
		pw5Q.close();
		pw6Q.close();
		pw7Q.close();
		pw8Q.close();
		

		pw2R.close();
		pw3R.close();
		pw4R.close();
		pw5R.close();
		pw6R.close();
		pw7R.close();
		pw8R.close();
		

		pw2S.close();
		pw3S.close();
		pw4S.close();
		pw5S.close();
		pw6S.close();
		pw7S.close();
		pw8S.close();
		

		pw2T.close();
		pw3T.close();
		pw4T.close();
		pw5T.close();
		pw6T.close();
		pw7T.close();
		pw8T.close();
		
		pw2U.close();
		pw3U.close();
		pw4U.close();
		pw5U.close();
		pw6U.close();
		pw7U.close();
		pw8U.close();
		

		pw2V.close();
		pw3V.close();
		pw4V.close();
		pw5V.close();
		pw6V.close();
		pw7V.close();
		pw8V.close();
		

		pw2W.close();
		pw3W.close();
		pw4W.close();
		pw5W.close();
		pw6W.close();
		pw7W.close();
		pw8W.close();
		

		pw2X.close();
		pw3X.close();
		pw4X.close();
		pw5X.close();
		pw6X.close();
		pw7X.close();
		pw8X.close();
		

		pw2Y.close();
		pw3Y.close();
		pw4Y.close();
		pw5Y.close();
		pw6Y.close();
		pw7Y.close();
		pw8Y.close();
		

		pw2Z.close();
		pw3Z.close();
		pw4Z.close();
		pw5Z.close();
		pw6Z.close();
		pw7Z.close();
		pw8Z.close();
	}
	
	public static void generateSubpartStartingWithFiles() throws IOException {
		Scanner scan = new Scanner(new File("docs/masterWordList"));
		PrintWriter pw2A = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithA"));
		PrintWriter pw3A = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithA"));
		PrintWriter pw4A = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithA"));
		PrintWriter pw5A = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithA"));
		PrintWriter pw6A = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithA"));
		PrintWriter pw7A = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithA"));
		PrintWriter pw8A = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithA"));
		PrintWriter pw9A = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithA"));
		PrintWriter pw10A = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithA"));
		PrintWriter pw11A = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithA"));
		PrintWriter pw12A = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithA"));
		PrintWriter pw13A = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithA"));
		PrintWriter pw14A = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithA"));

		PrintWriter pw2B = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithB"));
		PrintWriter pw3B = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithB"));
		PrintWriter pw4B = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithB"));
		PrintWriter pw5B = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithB"));
		PrintWriter pw6B = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithB"));
		PrintWriter pw7B = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithB"));
		PrintWriter pw8B = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithB"));
		PrintWriter pw9B = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithB"));
		PrintWriter pw10B = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithB"));
		PrintWriter pw11B = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithB"));
		PrintWriter pw12B = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithB"));
		PrintWriter pw13B = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithB"));
		PrintWriter pw14B = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithB"));

		PrintWriter pw2C = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithC"));
		PrintWriter pw3C = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithC"));
		PrintWriter pw4C = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithC"));
		PrintWriter pw5C = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithC"));
		PrintWriter pw6C = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithC"));
		PrintWriter pw7C = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithC"));
		PrintWriter pw8C = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithC"));
		PrintWriter pw9C = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithC"));
		PrintWriter pw10C = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithC"));
		PrintWriter pw11C = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithC"));
		PrintWriter pw12C = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithC"));
		PrintWriter pw13C = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithC"));
		PrintWriter pw14C = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithC"));

		PrintWriter pw2D = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithD"));
		PrintWriter pw3D = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithD"));
		PrintWriter pw4D = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithD"));
		PrintWriter pw5D = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithD"));
		PrintWriter pw6D = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithD"));
		PrintWriter pw7D = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithD"));
		PrintWriter pw8D = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithD"));
		PrintWriter pw9D = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithD"));
		PrintWriter pw10D = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithD"));
		PrintWriter pw11D = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithD"));
		PrintWriter pw12D = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithD"));
		PrintWriter pw13D = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithD"));
		PrintWriter pw14D = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithD"));

		PrintWriter pw2E = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithE"));
		PrintWriter pw3E = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithE"));
		PrintWriter pw4E = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithE"));
		PrintWriter pw5E = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithE"));
		PrintWriter pw6E = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithE"));
		PrintWriter pw7E = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithE"));
		PrintWriter pw8E = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithE"));
		PrintWriter pw9E = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithE"));
		PrintWriter pw10E = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithE"));
		PrintWriter pw11E = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithE"));
		PrintWriter pw12E = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithE"));
		PrintWriter pw13E = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithE"));
		PrintWriter pw14E = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithE"));

		PrintWriter pw2F = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithF"));
		PrintWriter pw3F = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithF"));
		PrintWriter pw4F = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithF"));
		PrintWriter pw5F = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithF"));
		PrintWriter pw6F = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithF"));
		PrintWriter pw7F = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithF"));
		PrintWriter pw8F = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithF"));
		PrintWriter pw9F = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithF"));
		PrintWriter pw10F = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithF"));
		PrintWriter pw11F = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithF"));
		PrintWriter pw12F = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithF"));
		PrintWriter pw13F = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithF"));
		PrintWriter pw14F = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithF"));

		PrintWriter pw2G = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithG"));
		PrintWriter pw3G = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithG"));
		PrintWriter pw4G = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithG"));
		PrintWriter pw5G = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithG"));
		PrintWriter pw6G = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithG"));
		PrintWriter pw7G = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithG"));
		PrintWriter pw8G = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithG"));
		PrintWriter pw9G = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithG"));
		PrintWriter pw10G = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithG"));
		PrintWriter pw11G = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithG"));
		PrintWriter pw12G = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithG"));
		PrintWriter pw13G = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithG"));
		PrintWriter pw14G = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithG"));

		PrintWriter pw2H = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithH"));
		PrintWriter pw3H = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithH"));
		PrintWriter pw4H = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithH"));
		PrintWriter pw5H = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithH"));
		PrintWriter pw6H = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithH"));
		PrintWriter pw7H = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithH"));
		PrintWriter pw8H = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithH"));
		PrintWriter pw9H = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithH"));
		PrintWriter pw10H = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithH"));
		PrintWriter pw11H = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithH"));
		PrintWriter pw12H = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithH"));
		PrintWriter pw13H = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithH"));
		PrintWriter pw14H = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithH"));

		PrintWriter pw2I = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithI"));
		PrintWriter pw3I = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithI"));
		PrintWriter pw4I = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithI"));
		PrintWriter pw5I = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithI"));
		PrintWriter pw6I = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithI"));
		PrintWriter pw7I = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithI"));
		PrintWriter pw8I = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithI"));
		PrintWriter pw9I = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithI"));
		PrintWriter pw10I = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithI"));
		PrintWriter pw11I = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithI"));
		PrintWriter pw12I = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithI"));
		PrintWriter pw13I = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithI"));
		PrintWriter pw14I = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithI"));

		PrintWriter pw2J = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithJ"));
		PrintWriter pw3J = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithJ"));
		PrintWriter pw4J = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithJ"));
		PrintWriter pw5J = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithJ"));
		PrintWriter pw6J = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithJ"));
		PrintWriter pw7J = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithJ"));
		PrintWriter pw8J = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithJ"));
		PrintWriter pw9J = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithJ"));
		PrintWriter pw10J = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithJ"));
		PrintWriter pw11J = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithJ"));
		PrintWriter pw12J = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithJ"));
		PrintWriter pw13J = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithJ"));
		PrintWriter pw14J = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithJ"));

		PrintWriter pw2K = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithK"));
		PrintWriter pw3K = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithK"));
		PrintWriter pw4K = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithK"));
		PrintWriter pw5K = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithK"));
		PrintWriter pw6K = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithK"));
		PrintWriter pw7K = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithK"));
		PrintWriter pw8K = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithK"));
		PrintWriter pw9K = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithK"));
		PrintWriter pw10K = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithK"));
		PrintWriter pw11K = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithK"));
		PrintWriter pw12K = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithK"));
		PrintWriter pw13K = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithK"));
		PrintWriter pw14K = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithK"));

		PrintWriter pw2L = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithL"));
		PrintWriter pw3L = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithL"));
		PrintWriter pw4L = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithL"));
		PrintWriter pw5L = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithL"));
		PrintWriter pw6L = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithL"));
		PrintWriter pw7L = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithL"));
		PrintWriter pw8L = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithL"));
		PrintWriter pw9L = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithL"));
		PrintWriter pw10L = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithL"));
		PrintWriter pw11L = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithL"));
		PrintWriter pw12L = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithL"));
		PrintWriter pw13L = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithL"));
		PrintWriter pw14L = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithL"));

		PrintWriter pw2M = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithM"));
		PrintWriter pw3M = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithM"));
		PrintWriter pw4M = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithM"));
		PrintWriter pw5M = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithM"));
		PrintWriter pw6M = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithM"));
		PrintWriter pw7M = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithM"));
		PrintWriter pw8M = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithM"));
		PrintWriter pw9M = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithM"));
		PrintWriter pw10M = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithM"));
		PrintWriter pw11M = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithM"));
		PrintWriter pw12M = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithM"));
		PrintWriter pw13M = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithM"));
		PrintWriter pw14M = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithM"));

		PrintWriter pw2N = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithN"));
		PrintWriter pw3N = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithN"));
		PrintWriter pw4N = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithN"));
		PrintWriter pw5N = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithN"));
		PrintWriter pw6N = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithN"));
		PrintWriter pw7N = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithN"));
		PrintWriter pw8N = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithN"));
		PrintWriter pw9N = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithN"));
		PrintWriter pw10N = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithN"));
		PrintWriter pw11N = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithN"));
		PrintWriter pw12N = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithN"));
		PrintWriter pw13N = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithN"));
		PrintWriter pw14N = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithN"));

		PrintWriter pw2O = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithO"));
		PrintWriter pw3O = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithO"));
		PrintWriter pw4O = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithO"));
		PrintWriter pw5O = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithO"));
		PrintWriter pw6O = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithO"));
		PrintWriter pw7O = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithO"));
		PrintWriter pw8O = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithO"));
		PrintWriter pw9O = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithO"));
		PrintWriter pw10O = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithO"));
		PrintWriter pw11O = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithO"));
		PrintWriter pw12O = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithO"));
		PrintWriter pw13O = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithO"));
		PrintWriter pw14O = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithO"));

		PrintWriter pw2P = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithP"));
		PrintWriter pw3P = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithP"));
		PrintWriter pw4P = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithP"));
		PrintWriter pw5P = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithP"));
		PrintWriter pw6P = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithP"));
		PrintWriter pw7P = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithP"));
		PrintWriter pw8P = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithP"));
		PrintWriter pw9P = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithP"));
		PrintWriter pw10P = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithP"));
		PrintWriter pw11P = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithP"));
		PrintWriter pw12P = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithP"));
		PrintWriter pw13P = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithP"));
		PrintWriter pw14P = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithP"));

		PrintWriter pw2Q = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithQ"));
		PrintWriter pw3Q = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithQ"));
		PrintWriter pw4Q = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithQ"));
		PrintWriter pw5Q = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithQ"));
		PrintWriter pw6Q = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithQ"));
		PrintWriter pw7Q = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithQ"));
		PrintWriter pw8Q = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithQ"));
		PrintWriter pw9Q = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithQ"));
		PrintWriter pw10Q = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithQ"));
		PrintWriter pw11Q = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithQ"));
		PrintWriter pw12Q = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithQ"));
		PrintWriter pw13Q = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithQ"));
		PrintWriter pw14Q = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithQ"));

		PrintWriter pw2R = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithR"));
		PrintWriter pw3R = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithR"));
		PrintWriter pw4R = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithR"));
		PrintWriter pw5R = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithR"));
		PrintWriter pw6R = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithR"));
		PrintWriter pw7R = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithR"));
		PrintWriter pw8R = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithR"));
		PrintWriter pw9R = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithR"));
		PrintWriter pw10R = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithR"));
		PrintWriter pw11R = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithR"));
		PrintWriter pw12R = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithR"));
		PrintWriter pw13R = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithR"));
		PrintWriter pw14R = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithR"));

		PrintWriter pw2S = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithS"));
		PrintWriter pw3S = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithS"));
		PrintWriter pw4S = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithS"));
		PrintWriter pw5S = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithS"));
		PrintWriter pw6S = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithS"));
		PrintWriter pw7S = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithS"));
		PrintWriter pw8S = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithS"));
		PrintWriter pw9S = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithS"));
		PrintWriter pw10S = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithS"));
		PrintWriter pw11S = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithS"));
		PrintWriter pw12S = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithS"));
		PrintWriter pw13S = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithS"));
		PrintWriter pw14S = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithS"));

		PrintWriter pw2T = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithT"));
		PrintWriter pw3T = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithT"));
		PrintWriter pw4T = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithT"));
		PrintWriter pw5T = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithT"));
		PrintWriter pw6T = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithT"));
		PrintWriter pw7T = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithT"));
		PrintWriter pw8T = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithT"));
		PrintWriter pw9T = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithT"));
		PrintWriter pw10T = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithT"));
		PrintWriter pw11T = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithT"));
		PrintWriter pw12T = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithT"));
		PrintWriter pw13T = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithT"));
		PrintWriter pw14T = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithT"));

		PrintWriter pw2U = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithU"));
		PrintWriter pw3U = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithU"));
		PrintWriter pw4U = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithU"));
		PrintWriter pw5U = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithU"));
		PrintWriter pw6U = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithU"));
		PrintWriter pw7U = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithU"));
		PrintWriter pw8U = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithU"));
		PrintWriter pw9U = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithU"));
		PrintWriter pw10U = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithU"));
		PrintWriter pw11U = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithU"));
		PrintWriter pw12U = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithU"));
		PrintWriter pw13U = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithU"));
		PrintWriter pw14U = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithU"));

		PrintWriter pw2V = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithV"));
		PrintWriter pw3V = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithV"));
		PrintWriter pw4V = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithV"));
		PrintWriter pw5V = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithV"));
		PrintWriter pw6V = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithV"));
		PrintWriter pw7V = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithV"));
		PrintWriter pw8V = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithV"));
		PrintWriter pw9V = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithV"));
		PrintWriter pw10V = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithV"));
		PrintWriter pw11V = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithV"));
		PrintWriter pw12V = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithV"));
		PrintWriter pw13V = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithV"));
		PrintWriter pw14V = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithV"));

		PrintWriter pw2W = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithW"));
		PrintWriter pw3W = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithW"));
		PrintWriter pw4W = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithW"));
		PrintWriter pw5W = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithW"));
		PrintWriter pw6W = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithW"));
		PrintWriter pw7W = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithW"));
		PrintWriter pw8W = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithW"));
		PrintWriter pw9W = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithW"));
		PrintWriter pw10W = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithW"));
		PrintWriter pw11W = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithW"));
		PrintWriter pw12W = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithW"));
		PrintWriter pw13W = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithW"));
		PrintWriter pw14W = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithW"));

		PrintWriter pw2X = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithX"));
		PrintWriter pw3X = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithX"));
		PrintWriter pw4X = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithX"));
		PrintWriter pw5X = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithX"));
		PrintWriter pw6X = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithX"));
		PrintWriter pw7X = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithX"));
		PrintWriter pw8X = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithX"));
		PrintWriter pw9X = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithX"));
		PrintWriter pw10X = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithX"));
		PrintWriter pw11X = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithX"));
		PrintWriter pw12X = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithX"));
		PrintWriter pw13X = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithX"));
		PrintWriter pw14X = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithX"));

		PrintWriter pw2Y = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithY"));
		PrintWriter pw3Y = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithY"));
		PrintWriter pw4Y = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithY"));
		PrintWriter pw5Y = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithY"));
		PrintWriter pw6Y = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithY"));
		PrintWriter pw7Y = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithY"));
		PrintWriter pw8Y = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithY"));
		PrintWriter pw9Y = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithY"));
		PrintWriter pw10Y = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithY"));
		PrintWriter pw11Y = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithY"));
		PrintWriter pw12Y = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithY"));
		PrintWriter pw13Y = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithY"));
		PrintWriter pw14Y = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithY"));

		PrintWriter pw2Z = new PrintWriter(new File("docs/subPartStartingWith/twoLetterSubparts/twoLetterSubpartsStartingWithZ"));
		PrintWriter pw3Z = new PrintWriter(new File("docs/subPartStartingWith/threeLetterSubparts/threeLetterSubpartsStartingWithZ"));
		PrintWriter pw4Z = new PrintWriter(new File("docs/subPartStartingWith/fourLetterSubparts/fourLetterSubpartsStartingWithZ"));
		PrintWriter pw5Z = new PrintWriter(new File("docs/subPartStartingWith/fiveLetterSubparts/fiveLetterSubpartsStartingWithZ"));
		PrintWriter pw6Z = new PrintWriter(new File("docs/subPartStartingWith/sixLetterSubparts/sixLetterSubpartsStartingWithZ"));
		PrintWriter pw7Z = new PrintWriter(new File("docs/subPartStartingWith/sevenLetterSubparts/sevenLetterSubpartsStartingWithZ"));
		PrintWriter pw8Z = new PrintWriter(new File("docs/subPartStartingWith/eightLetterSubparts/eightLetterSubpartsStartingWithZ"));
		PrintWriter pw9Z = new PrintWriter(new File("docs/subPartStartingWith/nineLetterSubparts/nineLetterSubpartsStartingWithZ"));
		PrintWriter pw10Z = new PrintWriter(new File("docs/subPartStartingWith/tenLetterSubparts/tenLetterSubpartsStartingWithZ"));
		PrintWriter pw11Z = new PrintWriter(new File("docs/subPartStartingWith/elevenLetterSubparts/elevenLetterSubpartsStartingWithZ"));
		PrintWriter pw12Z = new PrintWriter(new File("docs/subPartStartingWith/twelveLetterSubparts/twelveLetterSubpartsStartingWithZ"));
		PrintWriter pw13Z = new PrintWriter(new File("docs/subPartStartingWith/thirteenLetterSubparts/thirteenLetterSubpartsStartingWithZ"));
		PrintWriter pw14Z = new PrintWriter(new File("docs/subPartStartingWith/fourteenLetterSubparts/fourteenLetterSubpartsStartingWithZ"));
		
		String[] previousSubparts = new String[13];
		Arrays.fill(previousSubparts, "");
		while (scan.hasNextLine()) {
			String word = scan.nextLine().toUpperCase();
			int len = word.length();
			switch (word.charAt(0)) {
			case 'A':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2A.println(subpart);
							break;
						case 3:
							pw3A.println(subpart);
							break;
						case 4:
							pw4A.println(subpart);
							break;
						case 5:
							pw5A.println(subpart);
							break;
						case 6:
							pw6A.println(subpart);
							break;
						case 7:
							pw7A.println(subpart);
							break;
						case 8:
							pw8A.println(subpart);
							break;
						case 9:
							pw9A.println(subpart);
							break;
						case 10:
							pw10A.println(subpart);
							break;
						case 11:
							pw11A.println(subpart);
							break;
						case 12:
							pw12A.println(subpart);
							break;
						case 13:
							pw13A.println(subpart);
							break;
						default:
							pw14A.println(subpart);
							break;
						}
					}
				}
				break;
			case 'B':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2B.println(subpart);
							break;
						case 3:
							pw3B.println(subpart);
							break;
						case 4:
							pw4B.println(subpart);
							break;
						case 5:
							pw5B.println(subpart);
							break;
						case 6:
							pw6B.println(subpart);
							break;
						case 7:
							pw7B.println(subpart);
							break;
						case 8:
							pw8B.println(subpart);
							break;
						case 9:
							pw9B.println(subpart);
							break;
						case 10:
							pw10B.println(subpart);
							break;
						case 11:
							pw11B.println(subpart);
							break;
						case 12:
							pw12B.println(subpart);
							break;
						case 13:
							pw13B.println(subpart);
							break;
						default:
							pw14B.println(subpart);
							break;
						}
					}
				}
				break;
			case 'C':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2C.println(subpart);
							break;
						case 3:
							pw3C.println(subpart);
							break;
						case 4:
							pw4C.println(subpart);
							break;
						case 5:
							pw5C.println(subpart);
							break;
						case 6:
							pw6C.println(subpart);
							break;
						case 7:
							pw7C.println(subpart);
							break;
						case 8:
							pw8C.println(subpart);
							break;
						case 9:
							pw9C.println(subpart);
							break;
						case 10:
							pw10C.println(subpart);
							break;
						case 11:
							pw11C.println(subpart);
							break;
						case 12:
							pw12C.println(subpart);
							break;
						case 13:
							pw13C.println(subpart);
							break;
						default:
							pw14C.println(subpart);
							break;
						}
					}
				}
				break;
			case 'D':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2D.println(subpart);
							break;
						case 3:
							pw3D.println(subpart);
							break;
						case 4:
							pw4D.println(subpart);
							break;
						case 5:
							pw5D.println(subpart);
							break;
						case 6:
							pw6D.println(subpart);
							break;
						case 7:
							pw7D.println(subpart);
							break;
						case 8:
							pw8D.println(subpart);
							break;
						case 9:
							pw9D.println(subpart);
							break;
						case 10:
							pw10D.println(subpart);
							break;
						case 11:
							pw11D.println(subpart);
							break;
						case 12:
							pw12D.println(subpart);
							break;
						case 13:
							pw13D.println(subpart);
							break;
						default:
							pw14D.println(subpart);
							break;
						}
					}
				}
				break;
			case 'E':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2E.println(subpart);
							break;
						case 3:
							pw3E.println(subpart);
							break;
						case 4:
							pw4E.println(subpart);
							break;
						case 5:
							pw5E.println(subpart);
							break;
						case 6:
							pw6E.println(subpart);
							break;
						case 7:
							pw7E.println(subpart);
							break;
						case 8:
							pw8E.println(subpart);
							break;
						case 9:
							pw9E.println(subpart);
							break;
						case 10:
							pw10E.println(subpart);
							break;
						case 11:
							pw11E.println(subpart);
							break;
						case 12:
							pw12E.println(subpart);
							break;
						case 13:
							pw13E.println(subpart);
							break;
						default:
							pw14E.println(subpart);
							break;
						}
					}
				}
				break;
			case 'F':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2F.println(subpart);
							break;
						case 3:
							pw3F.println(subpart);
							break;
						case 4:
							pw4F.println(subpart);
							break;
						case 5:
							pw5F.println(subpart);
							break;
						case 6:
							pw6F.println(subpart);
							break;
						case 7:
							pw7F.println(subpart);
							break;
						case 8:
							pw8F.println(subpart);
							break;
						case 9:
							pw9F.println(subpart);
							break;
						case 10:
							pw10F.println(subpart);
							break;
						case 11:
							pw11F.println(subpart);
							break;
						case 12:
							pw12F.println(subpart);
							break;
						case 13:
							pw13F.println(subpart);
							break;
						default:
							pw14F.println(subpart);
							break;
						}
					}
				}
				break;
			case 'G':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2G.println(subpart);
							break;
						case 3:
							pw3G.println(subpart);
							break;
						case 4:
							pw4G.println(subpart);
							break;
						case 5:
							pw5G.println(subpart);
							break;
						case 6:
							pw6G.println(subpart);
							break;
						case 7:
							pw7G.println(subpart);
							break;
						case 8:
							pw8G.println(subpart);
							break;
						case 9:
							pw9G.println(subpart);
							break;
						case 10:
							pw10G.println(subpart);
							break;
						case 11:
							pw11G.println(subpart);
							break;
						case 12:
							pw12G.println(subpart);
							break;
						case 13:
							pw13G.println(subpart);
							break;
						default:
							pw14G.println(subpart);
							break;
						}
					}
				}
				break;
			case 'H':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2H.println(subpart);
							break;
						case 3:
							pw3H.println(subpart);
							break;
						case 4:
							pw4H.println(subpart);
							break;
						case 5:
							pw5H.println(subpart);
							break;
						case 6:
							pw6H.println(subpart);
							break;
						case 7:
							pw7H.println(subpart);
							break;
						case 8:
							pw8H.println(subpart);
							break;
						case 9:
							pw9H.println(subpart);
							break;
						case 10:
							pw10H.println(subpart);
							break;
						case 11:
							pw11H.println(subpart);
							break;
						case 12:
							pw12H.println(subpart);
							break;
						case 13:
							pw13H.println(subpart);
							break;
						default:
							pw14H.println(subpart);
							break;
						}
					}
				}
				break;
			case 'I':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2I.println(subpart);
							break;
						case 3:
							pw3I.println(subpart);
							break;
						case 4:
							pw4I.println(subpart);
							break;
						case 5:
							pw5I.println(subpart);
							break;
						case 6:
							pw6I.println(subpart);
							break;
						case 7:
							pw7I.println(subpart);
							break;
						case 8:
							pw8I.println(subpart);
							break;
						case 9:
							pw9I.println(subpart);
							break;
						case 10:
							pw10I.println(subpart);
							break;
						case 11:
							pw11I.println(subpart);
							break;
						case 12:
							pw12I.println(subpart);
							break;
						case 13:
							pw13I.println(subpart);
							break;
						default:
							pw14I.println(subpart);
							break;
						}
					}
				}
				break;
			case 'J':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2J.println(subpart);
							break;
						case 3:
							pw3J.println(subpart);
							break;
						case 4:
							pw4J.println(subpart);
							break;
						case 5:
							pw5J.println(subpart);
							break;
						case 6:
							pw6J.println(subpart);
							break;
						case 7:
							pw7J.println(subpart);
							break;
						case 8:
							pw8J.println(subpart);
							break;
						case 9:
							pw9J.println(subpart);
							break;
						case 10:
							pw10J.println(subpart);
							break;
						case 11:
							pw11J.println(subpart);
							break;
						case 12:
							pw12J.println(subpart);
							break;
						case 13:
							pw13J.println(subpart);
							break;
						default:
							pw14J.println(subpart);
							break;
						}
					}
				}
				break;
			case 'K':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2K.println(subpart);
							break;
						case 3:
							pw3K.println(subpart);
							break;
						case 4:
							pw4K.println(subpart);
							break;
						case 5:
							pw5K.println(subpart);
							break;
						case 6:
							pw6K.println(subpart);
							break;
						case 7:
							pw7K.println(subpart);
							break;
						case 8:
							pw8K.println(subpart);
							break;
						case 9:
							pw9K.println(subpart);
							break;
						case 10:
							pw10K.println(subpart);
							break;
						case 11:
							pw11K.println(subpart);
							break;
						case 12:
							pw12K.println(subpart);
							break;
						case 13:
							pw13K.println(subpart);
							break;
						default:
							pw14K.println(subpart);
							break;
						}
					}
				}
				break;
			case 'L':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2L.println(subpart);
							break;
						case 3:
							pw3L.println(subpart);
							break;
						case 4:
							pw4L.println(subpart);
							break;
						case 5:
							pw5L.println(subpart);
							break;
						case 6:
							pw6L.println(subpart);
							break;
						case 7:
							pw7L.println(subpart);
							break;
						case 8:
							pw8L.println(subpart);
							break;
						case 9:
							pw9L.println(subpart);
							break;
						case 10:
							pw10L.println(subpart);
							break;
						case 11:
							pw11L.println(subpart);
							break;
						case 12:
							pw12L.println(subpart);
							break;
						case 13:
							pw13L.println(subpart);
							break;
						default:
							pw14L.println(subpart);
							break;
						}
					}
				}
				break;
			case 'M':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2M.println(subpart);
							break;
						case 3:
							pw3M.println(subpart);
							break;
						case 4:
							pw4M.println(subpart);
							break;
						case 5:
							pw5M.println(subpart);
							break;
						case 6:
							pw6M.println(subpart);
							break;
						case 7:
							pw7M.println(subpart);
							break;
						case 8:
							pw8M.println(subpart);
							break;
						case 9:
							pw9M.println(subpart);
							break;
						case 10:
							pw10M.println(subpart);
							break;
						case 11:
							pw11M.println(subpart);
							break;
						case 12:
							pw12M.println(subpart);
							break;
						case 13:
							pw13M.println(subpart);
							break;
						default:
							pw14M.println(subpart);
							break;
						}
					}
				}
				break;
			case 'N':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2N.println(subpart);
							break;
						case 3:
							pw3N.println(subpart);
							break;
						case 4:
							pw4N.println(subpart);
							break;
						case 5:
							pw5N.println(subpart);
							break;
						case 6:
							pw6N.println(subpart);
							break;
						case 7:
							pw7N.println(subpart);
							break;
						case 8:
							pw8N.println(subpart);
							break;
						case 9:
							pw9N.println(subpart);
							break;
						case 10:
							pw10N.println(subpart);
							break;
						case 11:
							pw11N.println(subpart);
							break;
						case 12:
							pw12N.println(subpart);
							break;
						case 13:
							pw13N.println(subpart);
							break;
						default:
							pw14N.println(subpart);
							break;
						}
					}
				}
				break;
			case 'O':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2O.println(subpart);
							break;
						case 3:
							pw3O.println(subpart);
							break;
						case 4:
							pw4O.println(subpart);
							break;
						case 5:
							pw5O.println(subpart);
							break;
						case 6:
							pw6O.println(subpart);
							break;
						case 7:
							pw7O.println(subpart);
							break;
						case 8:
							pw8O.println(subpart);
							break;
						case 9:
							pw9O.println(subpart);
							break;
						case 10:
							pw10O.println(subpart);
							break;
						case 11:
							pw11O.println(subpart);
							break;
						case 12:
							pw12O.println(subpart);
							break;
						case 13:
							pw13O.println(subpart);
							break;
						default:
							pw14O.println(subpart);
							break;
						}
					}
				}
				break;
			case 'P':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2P.println(subpart);
							break;
						case 3:
							pw3P.println(subpart);
							break;
						case 4:
							pw4P.println(subpart);
							break;
						case 5:
							pw5P.println(subpart);
							break;
						case 6:
							pw6P.println(subpart);
							break;
						case 7:
							pw7P.println(subpart);
							break;
						case 8:
							pw8P.println(subpart);
							break;
						case 9:
							pw9P.println(subpart);
							break;
						case 10:
							pw10P.println(subpart);
							break;
						case 11:
							pw11P.println(subpart);
							break;
						case 12:
							pw12P.println(subpart);
							break;
						case 13:
							pw13P.println(subpart);
							break;
						default:
							pw14P.println(subpart);
							break;
						}
					}
				}
				break;
			case 'Q':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2Q.println(subpart);
							break;
						case 3:
							pw3Q.println(subpart);
							break;
						case 4:
							pw4Q.println(subpart);
							break;
						case 5:
							pw5Q.println(subpart);
							break;
						case 6:
							pw6Q.println(subpart);
							break;
						case 7:
							pw7Q.println(subpart);
							break;
						case 8:
							pw8Q.println(subpart);
							break;
						case 9:
							pw9Q.println(subpart);
							break;
						case 10:
							pw10Q.println(subpart);
							break;
						case 11:
							pw11Q.println(subpart);
							break;
						case 12:
							pw12Q.println(subpart);
							break;
						case 13:
							pw13Q.println(subpart);
							break;
						default:
							pw14Q.println(subpart);
							break;
						}
					}
				}
				break;
			case 'R':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2R.println(subpart);
							break;
						case 3:
							pw3R.println(subpart);
							break;
						case 4:
							pw4R.println(subpart);
							break;
						case 5:
							pw5R.println(subpart);
							break;
						case 6:
							pw6R.println(subpart);
							break;
						case 7:
							pw7R.println(subpart);
							break;
						case 8:
							pw8R.println(subpart);
							break;
						case 9:
							pw9R.println(subpart);
							break;
						case 10:
							pw10R.println(subpart);
							break;
						case 11:
							pw11R.println(subpart);
							break;
						case 12:
							pw12R.println(subpart);
							break;
						case 13:
							pw13R.println(subpart);
							break;
						default:
							pw14R.println(subpart);
							break;
						}
					}
				}
				break;
			case 'S':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2S.println(subpart);
							break;
						case 3:
							pw3S.println(subpart);
							break;
						case 4:
							pw4S.println(subpart);
							break;
						case 5:
							pw5S.println(subpart);
							break;
						case 6:
							pw6S.println(subpart);
							break;
						case 7:
							pw7S.println(subpart);
							break;
						case 8:
							pw8S.println(subpart);
							break;
						case 9:
							pw9S.println(subpart);
							break;
						case 10:
							pw10S.println(subpart);
							break;
						case 11:
							pw11S.println(subpart);
							break;
						case 12:
							pw12S.println(subpart);
							break;
						case 13:
							pw13S.println(subpart);
							break;
						default:
							pw14S.println(subpart);
							break;
						}
					}
				}
				break;
			case 'T':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2T.println(subpart);
							break;
						case 3:
							pw3T.println(subpart);
							break;
						case 4:
							pw4T.println(subpart);
							break;
						case 5:
							pw5T.println(subpart);
							break;
						case 6:
							pw6T.println(subpart);
							break;
						case 7:
							pw7T.println(subpart);
							break;
						case 8:
							pw8T.println(subpart);
							break;
						case 9:
							pw9T.println(subpart);
							break;
						case 10:
							pw10T.println(subpart);
							break;
						case 11:
							pw11T.println(subpart);
							break;
						case 12:
							pw12T.println(subpart);
							break;
						case 13:
							pw13T.println(subpart);
							break;
						default:
							pw14T.println(subpart);
							break;
						}
					}
				}
				break;
			case 'U':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2U.println(subpart);
							break;
						case 3:
							pw3U.println(subpart);
							break;
						case 4:
							pw4U.println(subpart);
							break;
						case 5:
							pw5U.println(subpart);
							break;
						case 6:
							pw6U.println(subpart);
							break;
						case 7:
							pw7U.println(subpart);
							break;
						case 8:
							pw8U.println(subpart);
							break;
						case 9:
							pw9U.println(subpart);
							break;
						case 10:
							pw10U.println(subpart);
							break;
						case 11:
							pw11U.println(subpart);
							break;
						case 12:
							pw12U.println(subpart);
							break;
						case 13:
							pw13U.println(subpart);
							break;
						default:
							pw14U.println(subpart);
							break;
						}
					}
				}
				break;
			case 'V':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2V.println(subpart);
							break;
						case 3:
							pw3V.println(subpart);
							break;
						case 4:
							pw4V.println(subpart);
							break;
						case 5:
							pw5V.println(subpart);
							break;
						case 6:
							pw6V.println(subpart);
							break;
						case 7:
							pw7V.println(subpart);
							break;
						case 8:
							pw8V.println(subpart);
							break;
						case 9:
							pw9V.println(subpart);
							break;
						case 10:
							pw10V.println(subpart);
							break;
						case 11:
							pw11V.println(subpart);
							break;
						case 12:
							pw12V.println(subpart);
							break;
						case 13:
							pw13V.println(subpart);
							break;
						default:
							pw14V.println(subpart);
							break;
						}
					}
				}
				break;
			case 'W':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2W.println(subpart);
							break;
						case 3:
							pw3W.println(subpart);
							break;
						case 4:
							pw4W.println(subpart);
							break;
						case 5:
							pw5W.println(subpart);
							break;
						case 6:
							pw6W.println(subpart);
							break;
						case 7:
							pw7W.println(subpart);
							break;
						case 8:
							pw8W.println(subpart);
							break;
						case 9:
							pw9W.println(subpart);
							break;
						case 10:
							pw10W.println(subpart);
							break;
						case 11:
							pw11W.println(subpart);
							break;
						case 12:
							pw12W.println(subpart);
							break;
						case 13:
							pw13W.println(subpart);
							break;
						default:
							pw14W.println(subpart);
							break;
						}
					}
				}
				break;
			case 'X':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2X.println(subpart);
							break;
						case 3:
							pw3X.println(subpart);
							break;
						case 4:
							pw4X.println(subpart);
							break;
						case 5:
							pw5X.println(subpart);
							break;
						case 6:
							pw6X.println(subpart);
							break;
						case 7:
							pw7X.println(subpart);
							break;
						case 8:
							pw8X.println(subpart);
							break;
						case 9:
							pw9X.println(subpart);
							break;
						case 10:
							pw10X.println(subpart);
							break;
						case 11:
							pw11X.println(subpart);
							break;
						case 12:
							pw12X.println(subpart);
							break;
						case 13:
							pw13X.println(subpart);
							break;
						default:
							pw14X.println(subpart);
							break;
						}
					}
				}
				break;
			case 'Y':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2Y.println(subpart);
							break;
						case 3:
							pw3Y.println(subpart);
							break;
						case 4:
							pw4Y.println(subpart);
							break;
						case 5:
							pw5Y.println(subpart);
							break;
						case 6:
							pw6Y.println(subpart);
							break;
						case 7:
							pw7Y.println(subpart);
							break;
						case 8:
							pw8Y.println(subpart);
							break;
						case 9:
							pw9Y.println(subpart);
							break;
						case 10:
							pw10Y.println(subpart);
							break;
						case 11:
							pw11Y.println(subpart);
							break;
						case 12:
							pw12Y.println(subpart);
							break;
						case 13:
							pw13Y.println(subpart);
							break;
						default:
							pw14Y.println(subpart);
							break;
						}
					}
				}
				break;
			case 'Z':
				for (int i = 2; i < len; ++i) {
					String subpart = word.substring(0,i);
					if (!subpart.equals(previousSubparts[i - 2])) {
						previousSubparts[i - 2] = subpart;
						switch (i) {
						case 2:
							pw2Z.println(subpart);
							break;
						case 3:
							pw3Z.println(subpart);
							break;
						case 4:
							pw4Z.println(subpart);
							break;
						case 5:
							pw5Z.println(subpart);
							break;
						case 6:
							pw6Z.println(subpart);
							break;
						case 7:
							pw7Z.println(subpart);
							break;
						case 8:
							pw8Z.println(subpart);
							break;
						case 9:
							pw9Z.println(subpart);
							break;
						case 10:
							pw10Z.println(subpart);
							break;
						case 11:
							pw11Z.println(subpart);
							break;
						case 12:
							pw12Z.println(subpart);
							break;
						case 13:
							pw13Z.println(subpart);
							break;
						default:
							pw14Z.println(subpart);
							break;
						}
					}
				}
				break;
			} //end of switch statement
		} // end of while loop
		
		scan.close();
		pw2A.close();
		pw3A.close();
		pw4A.close();
		pw5A.close();
		pw6A.close();
		pw7A.close();
		pw8A.close();
		pw9A.close();
		pw10A.close();
		pw11A.close();
		pw12A.close();
		pw13A.close();
		pw14A.close();

		pw2B.close();
		pw3B.close();
		pw4B.close();
		pw5B.close();
		pw6B.close();
		pw7B.close();
		pw8B.close();
		pw9B.close();
		pw10B.close();
		pw11B.close();
		pw12B.close();
		pw13B.close();
		pw14B.close();

		pw2C.close();
		pw3C.close();
		pw4C.close();
		pw5C.close();
		pw6C.close();
		pw7C.close();
		pw8C.close();
		pw9C.close();
		pw10C.close();
		pw11C.close();
		pw12C.close();
		pw13C.close();
		pw14C.close();

		pw2D.close();
		pw3D.close();
		pw4D.close();
		pw5D.close();
		pw6D.close();
		pw7D.close();
		pw8D.close();
		pw9D.close();
		pw10D.close();
		pw11D.close();
		pw12D.close();
		pw13D.close();
		pw14D.close();

		pw2E.close();
		pw3E.close();
		pw4E.close();
		pw5E.close();
		pw6E.close();
		pw7E.close();
		pw8E.close();
		pw9E.close();
		pw10E.close();
		pw11E.close();
		pw12E.close();
		pw13E.close();
		pw14E.close();

		pw2F.close();
		pw3F.close();
		pw4F.close();
		pw5F.close();
		pw6F.close();
		pw7F.close();
		pw8F.close();
		pw9F.close();
		pw10F.close();
		pw11F.close();
		pw12F.close();
		pw13F.close();
		pw14F.close();

		pw2G.close();
		pw3G.close();
		pw4G.close();
		pw5G.close();
		pw6G.close();
		pw7G.close();
		pw8G.close();
		pw9G.close();
		pw10G.close();
		pw11G.close();
		pw12G.close();
		pw13G.close();
		pw14G.close();

		pw2H.close();
		pw3H.close();
		pw4H.close();
		pw5H.close();
		pw6H.close();
		pw7H.close();
		pw8H.close();
		pw9H.close();
		pw10H.close();
		pw11H.close();
		pw12H.close();
		pw13H.close();
		pw14H.close();

		pw2I.close();
		pw3I.close();
		pw4I.close();
		pw5I.close();
		pw6I.close();
		pw7I.close();
		pw8I.close();
		pw9I.close();
		pw10I.close();
		pw11I.close();
		pw12I.close();
		pw13I.close();
		pw14I.close();

		pw2J.close();
		pw3J.close();
		pw4J.close();
		pw5J.close();
		pw6J.close();
		pw7J.close();
		pw8J.close();
		pw9J.close();
		pw10J.close();
		pw11J.close();
		pw12J.close();
		pw13J.close();
		pw14J.close();

		pw2K.close();
		pw3K.close();
		pw4K.close();
		pw5K.close();
		pw6K.close();
		pw7K.close();
		pw8K.close();
		pw9K.close();
		pw10K.close();
		pw11K.close();
		pw12K.close();
		pw13K.close();
		pw14K.close();

		pw2L.close();
		pw3L.close();
		pw4L.close();
		pw5L.close();
		pw6L.close();
		pw7L.close();
		pw8L.close();
		pw9L.close();
		pw10L.close();
		pw11L.close();
		pw12L.close();
		pw13L.close();
		pw14L.close();

		pw2M.close();
		pw3M.close();
		pw4M.close();
		pw5M.close();
		pw6M.close();
		pw7M.close();
		pw8M.close();
		pw9M.close();
		pw10M.close();
		pw11M.close();
		pw12M.close();
		pw13M.close();
		pw14M.close();

		pw2N.close();
		pw3N.close();
		pw4N.close();
		pw5N.close();
		pw6N.close();
		pw7N.close();
		pw8N.close();
		pw9N.close();
		pw10N.close();
		pw11N.close();
		pw12N.close();
		pw13N.close();
		pw14N.close();

		pw2O.close();
		pw3O.close();
		pw4O.close();
		pw5O.close();
		pw6O.close();
		pw7O.close();
		pw8O.close();
		pw9O.close();
		pw10O.close();
		pw11O.close();
		pw12O.close();
		pw13O.close();
		pw14O.close();

		pw2P.close();
		pw3P.close();
		pw4P.close();
		pw5P.close();
		pw6P.close();
		pw7P.close();
		pw8P.close();
		pw9P.close();
		pw10P.close();
		pw11P.close();
		pw12P.close();
		pw13P.close();
		pw14P.close();

		pw2Q.close();
		pw3Q.close();
		pw4Q.close();
		pw5Q.close();
		pw6Q.close();
		pw7Q.close();
		pw8Q.close();
		pw9Q.close();
		pw10Q.close();
		pw11Q.close();
		pw12Q.close();
		pw13Q.close();
		pw14Q.close();

		pw2R.close();
		pw3R.close();
		pw4R.close();
		pw5R.close();
		pw6R.close();
		pw7R.close();
		pw8R.close();
		pw9R.close();
		pw10R.close();
		pw11R.close();
		pw12R.close();
		pw13R.close();
		pw14R.close();

		pw2S.close();
		pw3S.close();
		pw4S.close();
		pw5S.close();
		pw6S.close();
		pw7S.close();
		pw8S.close();
		pw9S.close();
		pw10S.close();
		pw11S.close();
		pw12S.close();
		pw13S.close();
		pw14S.close();

		pw2T.close();
		pw3T.close();
		pw4T.close();
		pw5T.close();
		pw6T.close();
		pw7T.close();
		pw8T.close();
		pw9T.close();
		pw10T.close();
		pw11T.close();
		pw12T.close();
		pw13T.close();
		pw14T.close();

		pw2U.close();
		pw3U.close();
		pw4U.close();
		pw5U.close();
		pw6U.close();
		pw7U.close();
		pw8U.close();
		pw9U.close();
		pw10U.close();
		pw11U.close();
		pw12U.close();
		pw13U.close();
		pw14U.close();

		pw2V.close();
		pw3V.close();
		pw4V.close();
		pw5V.close();
		pw6V.close();
		pw7V.close();
		pw8V.close();
		pw9V.close();
		pw10V.close();
		pw11V.close();
		pw12V.close();
		pw13V.close();
		pw14V.close();

		pw2W.close();
		pw3W.close();
		pw4W.close();
		pw5W.close();
		pw6W.close();
		pw7W.close();
		pw8W.close();
		pw9W.close();
		pw10W.close();
		pw11W.close();
		pw12W.close();
		pw13W.close();
		pw14W.close();

		pw2X.close();
		pw3X.close();
		pw4X.close();
		pw5X.close();
		pw6X.close();
		pw7X.close();
		pw8X.close();
		pw9X.close();
		pw10X.close();
		pw11X.close();
		pw12X.close();
		pw13X.close();
		pw14X.close();

		pw2Y.close();
		pw3Y.close();
		pw4Y.close();
		pw5Y.close();
		pw6Y.close();
		pw7Y.close();
		pw8Y.close();
		pw9Y.close();
		pw10Y.close();
		pw11Y.close();
		pw12Y.close();
		pw13Y.close();
		pw14Y.close();

		pw2Z.close();
		pw3Z.close();
		pw4Z.close();
		pw5Z.close();
		pw6Z.close();
		pw7Z.close();
		pw8Z.close();
		pw9Z.close();
		pw10Z.close();
		pw11Z.close();
		pw12Z.close();
		pw13Z.close();
		pw14Z.close();
	}
	
	public static void main(String[] args) {
		try {
//			String separator = System.getProperty("file.separator");
//			File inputFile =  new File("docs" + separator + "Collins_Scrabble_Words_(2019)_with_definitions.txt");
//			File outputFile = new File("docs/masterWordList");
//			generateMasterWordListCsvFile(inputFile, outputFile);
//			generateWordsStartingWithFiles();
//			generateWordLengthStartingWithFiles();
			generateSubpartStartingWithFiles();
			System.out.println("Finished executing DocGenerator");
		}
		catch (IOException excpt) {
			System.out.println("Caught IOException: " + excpt.getMessage());
		}
		
	}

}
