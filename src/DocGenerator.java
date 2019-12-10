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
//				System.out.println("Should add A word");
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
