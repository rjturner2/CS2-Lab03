import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordCount {
	public static void main(String[] args) {
		int wordCount, lineCount, charCount;
		wordCount = lineCount = charCount = 0;
		try {
			File myTextFile = new File(args[0]);
			Scanner textFile = new Scanner(myTextFile);
			while (textFile.hasNextLine()) {
				String line = textFile.nextLine();
				String[] individualWords = line.split(" ", 0);
				wordCount += individualWords.length;
				lineCount += 1;

				for(int i = 0; i < individualWords.length; i++) {
					for(int j = 0; j < individualWords[i].length(); j++) {
					char c = individualWords[i].charAt(j);
						if (!Character.isWhitespace(c)) {
							charCount += 1;
								}
							}
						}
					}
		System.out.print(args[0] + " has " + lineCount + " lines,");
		System.out.print(" " + wordCount + " words, and ");
		System.out.println(charCount + " characters.");
				}
	catch (FileNotFoundException e) {
		System.out.println("That file was not found.");
		}
	}
}