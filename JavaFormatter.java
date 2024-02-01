import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class JavaFormatter {
	public static void main(String[] args) {
		int indentSize = 0;
		String currentLine;
		try {
			Scanner console = new Scanner(System.in);
			System.out.print("What file would you like to format?: ");
			String fileLocation = console.next();
			File fileName = new File(fileLocation);
			Scanner file = new Scanner(fileName);

			while(file.hasNextLine()) {
				currentLine = file.nextLine();
				if (currentLine.contains("{")) indentSize += 4;
				if (currentLine.contains("}")) indentSize -= 4;
				for (int i = 0; i < indentSize; i++) System.out.print(" ");
				System.out.println(currentLine);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("File was not found.");
		}
	}
}