import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
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
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
//			line = line.strip();
			int i = line.indexOf('\t');
			String dictionary_word = line.substring(0,i);
			String word_definition = line.substring(i); // with tab in the front
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
		PrintWriter pw8A = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithA"));
		

		PrintWriter pw2B = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithB"));
		PrintWriter pw3B = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithB"));
		PrintWriter pw4B = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithB"));
		PrintWriter pw5B = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithB"));
		PrintWriter pw6B = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithB"));
		PrintWriter pw7B = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithB"));
		PrintWriter pw8B = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithB"));
		

		PrintWriter pw2C = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithC"));
		PrintWriter pw3C = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithC"));
		PrintWriter pw4C = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithC"));
		PrintWriter pw5C = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithC"));
		PrintWriter pw6C = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithC"));
		PrintWriter pw7C = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithC"));
		PrintWriter pw8C = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithC"));
		

		PrintWriter pw2D = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithD"));
		PrintWriter pw3D = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithD"));
		PrintWriter pw4D = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithD"));
		PrintWriter pw5D = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithD"));
		PrintWriter pw6D = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithD"));
		PrintWriter pw7D = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithD"));
		PrintWriter pw8D = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithD"));
		

		PrintWriter pw2E = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithE"));
		PrintWriter pw3E = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithE"));
		PrintWriter pw4E = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithE"));
		PrintWriter pw5E = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithE"));
		PrintWriter pw6E = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithE"));
		PrintWriter pw7E = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithE"));
		PrintWriter pw8E = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithE"));
		

		PrintWriter pw2F = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithF"));
		PrintWriter pw3F = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithF"));
		PrintWriter pw4F = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithF"));
		PrintWriter pw5F = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithF"));
		PrintWriter pw6F = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithF"));
		PrintWriter pw7F = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithF"));
		PrintWriter pw8F = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithF"));
		

		PrintWriter pw2G = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithG"));
		PrintWriter pw3G = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithG"));
		PrintWriter pw4G = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithG"));
		PrintWriter pw5G = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithG"));
		PrintWriter pw6G = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithG"));
		PrintWriter pw7G = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithG"));
		PrintWriter pw8G = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithG"));
		

		PrintWriter pw2H = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithH"));
		PrintWriter pw3H = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithH"));
		PrintWriter pw4H = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithH"));
		PrintWriter pw5H = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithH"));
		PrintWriter pw6H = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithH"));
		PrintWriter pw7H = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithH"));
		PrintWriter pw8H = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithH"));
		

		PrintWriter pw2I = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithI"));
		PrintWriter pw3I = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithI"));
		PrintWriter pw4I = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithI"));
		PrintWriter pw5I = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithI"));
		PrintWriter pw6I = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithI"));
		PrintWriter pw7I = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithI"));
		PrintWriter pw8I = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithI"));
		

		PrintWriter pw2J = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithJ"));
		PrintWriter pw3J = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithJ"));
		PrintWriter pw4J = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithJ"));
		PrintWriter pw5J = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithJ"));
		PrintWriter pw6J = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithJ"));
		PrintWriter pw7J = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithJ"));
		PrintWriter pw8J = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithJ"));
		

		PrintWriter pw2K = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithK"));
		PrintWriter pw3K = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithK"));
		PrintWriter pw4K = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithK"));
		PrintWriter pw5K = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithK"));
		PrintWriter pw6K = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithK"));
		PrintWriter pw7K = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithK"));
		PrintWriter pw8K = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithK"));
		

		PrintWriter pw2L = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithL"));
		PrintWriter pw3L = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithL"));
		PrintWriter pw4L = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithL"));
		PrintWriter pw5L = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithL"));
		PrintWriter pw6L = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithL"));
		PrintWriter pw7L = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithL"));
		PrintWriter pw8L = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithL"));
		

		PrintWriter pw2M = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithM"));
		PrintWriter pw3M = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithM"));
		PrintWriter pw4M = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithM"));
		PrintWriter pw5M = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithM"));
		PrintWriter pw6M = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithM"));
		PrintWriter pw7M = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithM"));
		PrintWriter pw8M = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithM"));
		

		PrintWriter pw2N = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithN"));
		PrintWriter pw3N = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithN"));
		PrintWriter pw4N = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithN"));
		PrintWriter pw5N = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithN"));
		PrintWriter pw6N = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithN"));
		PrintWriter pw7N = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithN"));
		PrintWriter pw8N = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithN"));
		

		PrintWriter pw2O = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithO"));
		PrintWriter pw3O = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithO"));
		PrintWriter pw4O = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithO"));
		PrintWriter pw5O = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithO"));
		PrintWriter pw6O = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithO"));
		PrintWriter pw7O = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithO"));
		PrintWriter pw8O = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithO"));
		

		PrintWriter pw2P = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithP"));
		PrintWriter pw3P = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithP"));
		PrintWriter pw4P = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithP"));
		PrintWriter pw5P = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithP"));
		PrintWriter pw6P = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithP"));
		PrintWriter pw7P = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithP"));
		PrintWriter pw8P = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithP"));
		

		PrintWriter pw2Q = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithQ"));
		PrintWriter pw3Q = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithQ"));
		PrintWriter pw4Q = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithQ"));
		PrintWriter pw5Q = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithQ"));
		PrintWriter pw6Q = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithQ"));
		PrintWriter pw7Q = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithQ"));
		PrintWriter pw8Q = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithQ"));
		

		PrintWriter pw2R = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithR"));
		PrintWriter pw3R = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithR"));
		PrintWriter pw4R = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithR"));
		PrintWriter pw5R = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithR"));
		PrintWriter pw6R = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithR"));
		PrintWriter pw7R = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithR"));
		PrintWriter pw8R = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithR"));
		

		PrintWriter pw2S = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithS"));
		PrintWriter pw3S = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithS"));
		PrintWriter pw4S = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithS"));
		PrintWriter pw5S = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithS"));
		PrintWriter pw6S = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithS"));
		PrintWriter pw7S = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithS"));
		PrintWriter pw8S = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithS"));
		

		PrintWriter pw2T = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithT"));
		PrintWriter pw3T = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithT"));
		PrintWriter pw4T = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithT"));
		PrintWriter pw5T = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithT"));
		PrintWriter pw6T = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithT"));
		PrintWriter pw7T = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithT"));
		PrintWriter pw8T = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithT"));
		

		PrintWriter pw2U = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithU"));
		PrintWriter pw3U = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithU"));
		PrintWriter pw4U = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithU"));
		PrintWriter pw5U = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithU"));
		PrintWriter pw6U = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithU"));
		PrintWriter pw7U = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithU"));
		PrintWriter pw8U = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithU"));
		

		PrintWriter pw2V = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithV"));
		PrintWriter pw3V = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithV"));
		PrintWriter pw4V = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithV"));
		PrintWriter pw5V = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithV"));
		PrintWriter pw6V = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithV"));
		PrintWriter pw7V = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithV"));
		PrintWriter pw8V = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithV"));
		

		PrintWriter pw2W = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithW"));
		PrintWriter pw3W = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithW"));
		PrintWriter pw4W = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithW"));
		PrintWriter pw5W = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithW"));
		PrintWriter pw6W = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithW"));
		PrintWriter pw7W = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithW"));
		PrintWriter pw8W = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithW"));
		

		PrintWriter pw2X = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithX"));
		PrintWriter pw3X = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithX"));
		PrintWriter pw4X = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithX"));
		PrintWriter pw5X = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithX"));
		PrintWriter pw6X = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithX"));
		PrintWriter pw7X = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithX"));
		PrintWriter pw8X = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithX"));
		

		PrintWriter pw2Y = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithY"));
		PrintWriter pw3Y = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithY"));
		PrintWriter pw4Y = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithY"));
		PrintWriter pw5Y = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithY"));
		PrintWriter pw6Y = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithY"));
		PrintWriter pw7Y = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithY"));
		PrintWriter pw8Y = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithY"));
		

		PrintWriter pw2Z = new PrintWriter(new File("docs/wordLengthStartingWith/twoLetterWords/twoLetterWordsStartingWithZ"));
		PrintWriter pw3Z = new PrintWriter(new File("docs/wordLengthStartingWith/threeLetterWords/threeLetterWordsStartingWithZ"));
		PrintWriter pw4Z = new PrintWriter(new File("docs/wordLengthStartingWith/fourLetterWords/fourLetterWordsStartingWithZ"));
		PrintWriter pw5Z = new PrintWriter(new File("docs/wordLengthStartingWith/fiveLetterWords/fiveLetterWordsStartingWithZ"));
		PrintWriter pw6Z = new PrintWriter(new File("docs/wordLengthStartingWith/sixLetterWords/sixLetterWordsStartingWithZ"));
		PrintWriter pw7Z = new PrintWriter(new File("docs/wordLengthStartingWith/sevenLetterWords/sevenLetterWordsStartingWithZ"));
		PrintWriter pw8Z = new PrintWriter(new File("docs/wordLengthStartingWith/eightOrMoreLetterWords/eightLetterWordsStartingWithZ"));
		
		while (scan.hasNextLine()) {
			String word = scan.nextLine();
			int len = word.length();
			switch (word.substring(0,1).toUpperCase()) {
			case "A":
				if (len <= 2) {
					pw2A.println(word);
				}
				else if (len == 3) {
					pw3A.println(word);
				}
				else if (len == 4) {
					pw4A.println(word);
				}
				else if (len == 5) {
					pw5A.println(word);
				}
				else if (len == 6) {
					pw6A.println(word);
				}
				else if (len == 7) {
					pw7A.println(word);
				}
				else {
					pw8A.println(word);
				}
				break;
			case "B":
				if (len <= 2) {
					pw2B.println(word);
				}
				else if (len == 3) {
					pw3B.println(word);
				}
				else if (len == 4) {
					pw4B.println(word);
				}
				else if (len == 5) {
					pw5B.println(word);
				}
				else if (len == 6) {
					pw6B.println(word);
				}
				else if (len == 7) {
					pw7B.println(word);
				}
				else {
					pw8B.println(word);
				}
				break;
			case "C":
				if (len <= 2) {
					pw2C.println(word);
				}
				else if (len == 3) {
					pw3C.println(word);
				}
				else if (len == 4) {
					pw4C.println(word);
				}
				else if (len == 5) {
					pw5C.println(word);
				}
				else if (len == 6) {
					pw6C.println(word);
				}
				else if (len == 7) {
					pw7C.println(word);
				}
				else {
					pw8C.println(word);
				}
				break;
			case "D":
				if (len <= 2) {
					pw2D.println(word);
				}
				else if (len == 3) {
					pw3D.println(word);
				}
				else if (len == 4) {
					pw4D.println(word);
				}
				else if (len == 5) {
					pw5D.println(word);
				}
				else if (len == 6) {
					pw6D.println(word);
				}
				else if (len == 7) {
					pw7D.println(word);
				}
				else {
					pw8D.println(word);
				}
				break;
			case "E":
				if (len <= 2) {
					pw2E.println(word);
				}
				else if (len == 3) {
					pw3E.println(word);
				}
				else if (len == 4) {
					pw4E.println(word);
				}
				else if (len == 5) {
					pw5E.println(word);
				}
				else if (len == 6) {
					pw6E.println(word);
				}
				else if (len == 7) {
					pw7E.println(word);
				}
				else {
					pw8E.println(word);
				}
				break;
			case "F":
				if (len <= 2) {
					pw2F.println(word);
				}
				else if (len == 3) {
					pw3F.println(word);
				}
				else if (len == 4) {
					pw4F.println(word);
				}
				else if (len == 5) {
					pw5F.println(word);
				}
				else if (len == 6) {
					pw6F.println(word);
				}
				else if (len == 7) {
					pw7F.println(word);
				}
				else {
					pw8F.println(word);
				}
				break;
			case "G":
				if (len <= 2) {
					pw2G.println(word);
				}
				else if (len == 3) {
					pw3G.println(word);
				}
				else if (len == 4) {
					pw4G.println(word);
				}
				else if (len == 5) {
					pw5G.println(word);
				}
				else if (len == 6) {
					pw6G.println(word);
				}
				else if (len == 7) {
					pw7G.println(word);
				}
				else {
					pw8G.println(word);
				}
				break;
			case "H":
				if (len <= 2) {
					pw2H.println(word);
				}
				else if (len == 3) {
					pw3H.println(word);
				}
				else if (len == 4) {
					pw4H.println(word);
				}
				else if (len == 5) {
					pw5H.println(word);
				}
				else if (len == 6) {
					pw6H.println(word);
				}
				else if (len == 7) {
					pw7H.println(word);
				}
				else {
					pw8H.println(word);
				}
				break;
			case "I":
				if (len <= 2) {
					pw2I.println(word);
				}
				else if (len == 3) {
					pw3I.println(word);
				}
				else if (len == 4) {
					pw4I.println(word);
				}
				else if (len == 5) {
					pw5I.println(word);
				}
				else if (len == 6) {
					pw6I.println(word);
				}
				else if (len == 7) {
					pw7I.println(word);
				}
				else {
					pw8I.println(word);
				}
				break;
			case "J":
				if (len <= 2) {
					pw2J.println(word);
				}
				else if (len == 3) {
					pw3J.println(word);
				}
				else if (len == 4) {
					pw4J.println(word);
				}
				else if (len == 5) {
					pw5J.println(word);
				}
				else if (len == 6) {
					pw6J.println(word);
				}
				else if (len == 7) {
					pw7J.println(word);
				}
				else {
					pw8J.println(word);
				}
				break;
			case "K":
				if (len <= 2) {
					pw2K.println(word);
				}
				else if (len == 3) {
					pw3K.println(word);
				}
				else if (len == 4) {
					pw4K.println(word);
				}
				else if (len == 5) {
					pw5K.println(word);
				}
				else if (len == 6) {
					pw6K.println(word);
				}
				else if (len == 7) {
					pw7K.println(word);
				}
				else {
					pw8K.println(word);
				}
				break;
			case "L":
				if (len <= 2) {
					pw2L.println(word);
				}
				else if (len == 3) {
					pw3L.println(word);
				}
				else if (len == 4) {
					pw4L.println(word);
				}
				else if (len == 5) {
					pw5L.println(word);
				}
				else if (len == 6) {
					pw6L.println(word);
				}
				else if (len == 7) {
					pw7L.println(word);
				}
				else {
					pw8L.println(word);
				}
				break;
			case "M":
				if (len <= 2) {
					pw2M.println(word);
				}
				else if (len == 3) {
					pw3M.println(word);
				}
				else if (len == 4) {
					pw4M.println(word);
				}
				else if (len == 5) {
					pw5M.println(word);
				}
				else if (len == 6) {
					pw6M.println(word);
				}
				else if (len == 7) {
					pw7M.println(word);
				}
				else {
					pw8M.println(word);
				}
				break;
			case "N":
				if (len <= 2) {
					pw2N.println(word);
				}
				else if (len == 3) {
					pw3N.println(word);
				}
				else if (len == 4) {
					pw4N.println(word);
				}
				else if (len == 5) {
					pw5N.println(word);
				}
				else if (len == 6) {
					pw6N.println(word);
				}
				else if (len == 7) {
					pw7N.println(word);
				}
				else {
					pw8N.println(word);
				}
				break;
			case "O":
				if (len <= 2) {
					pw2O.println(word);
				}
				else if (len == 3) {
					pw3O.println(word);
				}
				else if (len == 4) {
					pw4O.println(word);
				}
				else if (len == 5) {
					pw5O.println(word);
				}
				else if (len == 6) {
					pw6O.println(word);
				}
				else if (len == 7) {
					pw7O.println(word);
				}
				else {
					pw8O.println(word);
				}
				break;
			case "P":
				if (len <= 2) {
					pw2P.println(word);
				}
				else if (len == 3) {
					pw3P.println(word);
				}
				else if (len == 4) {
					pw4P.println(word);
				}
				else if (len == 5) {
					pw5P.println(word);
				}
				else if (len == 6) {
					pw6P.println(word);
				}
				else if (len == 7) {
					pw7P.println(word);
				}
				else {
					pw8P.println(word);
				}
				break;
			case "Q":
				if (len <= 2) {
					pw2Q.println(word);
				}
				else if (len == 3) {
					pw3Q.println(word);
				}
				else if (len == 4) {
					pw4Q.println(word);
				}
				else if (len == 5) {
					pw5Q.println(word);
				}
				else if (len == 6) {
					pw6Q.println(word);
				}
				else if (len == 7) {
					pw7Q.println(word);
				}
				else {
					pw8Q.println(word);
				}
				break;
			case "R":
				if (len <= 2) {
					pw2R.println(word);
				}
				else if (len == 3) {
					pw3R.println(word);
				}
				else if (len == 4) {
					pw4R.println(word);
				}
				else if (len == 5) {
					pw5R.println(word);
				}
				else if (len == 6) {
					pw6R.println(word);
				}
				else if (len == 7) {
					pw7R.println(word);
				}
				else {
					pw8R.println(word);
				}
				break;
			case "S":
				if (len <= 2) {
					pw2S.println(word);
				}
				else if (len == 3) {
					pw3S.println(word);
				}
				else if (len == 4) {
					pw4S.println(word);
				}
				else if (len == 5) {
					pw5S.println(word);
				}
				else if (len == 6) {
					pw6S.println(word);
				}
				else if (len == 7) {
					pw7S.println(word);
				}
				else {
					pw8S.println(word);
				}
				break;
			case "T":
				if (len <= 2) {
					pw2T.println(word);
				}
				else if (len == 3) {
					pw3T.println(word);
				}
				else if (len == 4) {
					pw4T.println(word);
				}
				else if (len == 5) {
					pw5T.println(word);
				}
				else if (len == 6) {
					pw6T.println(word);
				}
				else if (len == 7) {
					pw7T.println(word);
				}
				else {
					pw8T.println(word);
				}
				break;
			case "U":
				if (len <= 2) {
					pw2U.println(word);
				}
				else if (len == 3) {
					pw3U.println(word);
				}
				else if (len == 4) {
					pw4U.println(word);
				}
				else if (len == 5) {
					pw5U.println(word);
				}
				else if (len == 6) {
					pw6U.println(word);
				}
				else if (len == 7) {
					pw7U.println(word);
				}
				else {
					pw8U.println(word);
				}
				break;
			case "V":
				if (len <= 2) {
					pw2V.println(word);
				}
				else if (len == 3) {
					pw3V.println(word);
				}
				else if (len == 4) {
					pw4V.println(word);
				}
				else if (len == 5) {
					pw5V.println(word);
				}
				else if (len == 6) {
					pw6V.println(word);
				}
				else if (len == 7) {
					pw7V.println(word);
				}
				else {
					pw8V.println(word);
				}
				break;
			case "W":
				if (len <= 2) {
					pw2W.println(word);
				}
				else if (len == 3) {
					pw3W.println(word);
				}
				else if (len == 4) {
					pw4W.println(word);
				}
				else if (len == 5) {
					pw5W.println(word);
				}
				else if (len == 6) {
					pw6W.println(word);
				}
				else if (len == 7) {
					pw7W.println(word);
				}
				else {
					pw8W.println(word);
				}
				break;
			case "X":
				if (len <= 2) {
					pw2X.println(word);
				}
				else if (len == 3) {
					pw3X.println(word);
				}
				else if (len == 4) {
					pw4X.println(word);
				}
				else if (len == 5) {
					pw5X.println(word);
				}
				else if (len == 6) {
					pw6X.println(word);
				}
				else if (len == 7) {
					pw7X.println(word);
				}
				else {
					pw8X.println(word);
				}
				break;
			case "Y":
				if (len <= 2) {
					pw2Y.println(word);
				}
				else if (len == 3) {
					pw3Y.println(word);
				}
				else if (len == 4) {
					pw4Y.println(word);
				}
				else if (len == 5) {
					pw5Y.println(word);
				}
				else if (len == 6) {
					pw6Y.println(word);
				}
				else if (len == 7) {
					pw7Y.println(word);
				}
				else {
					pw8Y.println(word);
				}
				break;
			case "Z":
				if (len <= 2) {
					pw2Z.println(word);
				}
				else if (len == 3) {
					pw3Z.println(word);
				}
				else if (len == 4) {
					pw4Z.println(word);
				}
				else if (len == 5) {
					pw5Z.println(word);
				}
				else if (len == 6) {
					pw6Z.println(word);
				}
				else if (len == 7) {
					pw7Z.println(word);
				}
				else {
					pw8Z.println(word);
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
	
	public static void main(String[] args) {
		try {
			String separator = System.getProperty("file.separator");
			File inputFile =  new File("docs" + separator + "Collins_Scrabble_Words_(2019)_with_definitions.txt");
			File outputFile = new File("docs/masterWordList");
			generateMasterWordListCsvFile(inputFile, outputFile);
			generateWordsStartingWithFiles();
			generateWordLengthStartingWithFiles();
		}
		catch (IOException excpt) {
			System.out.println("Caught IOException: " + excpt.getMessage());
		}
		
	}

}
