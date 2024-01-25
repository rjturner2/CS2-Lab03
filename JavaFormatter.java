import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class JavaFormatter {
	public static void main(String[] args) {
		try {
			Scanner console = new Scanner(System.in);
			System.out.print("What file would you like to format?: ");
			String fileLocation = console.next();
			File fileName = new File(fileLocation);
			Scanner file = new Scanner(fileName);

			while(file.hasNextLine()) {
				System.out.println(file.nextLine());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("File was not found.");
		}
	}
}