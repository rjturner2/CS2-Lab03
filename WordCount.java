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
			Scanner currentLine;
			while (textFile.hasNextLine()) {
				lineCount += 1;
				String line = textFile.nextLine();
				currentLine = new Scanner(line);

				while (currentLine.hasNext()) {
					wordCount += 1;
					String currentWord = currentLine.next();
					charCount += currentWord.length();
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