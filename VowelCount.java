public class VowelCount {
	public static void main(String[] args) {
		String[][] charactersPerWord = seperateString(args[0]);
		int[] vowelCount = new int[]{0, 0, 0, 0, 0};
		System.out.println("A, E, I, O, U")

		for (int i = 0; i < charactersPerWord.length; i++) {
			for (int j = 0; j < charactersPerWord[i].length; j++) {
				if (indexOfVowel(charactersPerWord[i][j]) >= 0)
					vowelCount[indexOfVowel(charactersPerWord[i][j])] += 1;
			}
		}

		System.out.print(vowelCount[0]);
		for (int i = 1; i < vowelCount.length; i++) {
			System.out.print(", " + vowelCount[i]);
		}
	}

	public static int indexOfVowel(String c) {
		if (c.equalsIgnoreCase("a")) return 0;
		else if (c.equalsIgnoreCase("e")) return 1;
		else if (c.equalsIgnoreCase("i")) return 2;
		else if (c.equalsIgnoreCase("o")) return 3;
		else if (c.equalsIgnoreCase("u")) return 4;
		else return -1;
	}

	public static String[][] seperateString(String str) {
		String[] words = str.split(" ", 0);
		String[][] characterInWords = new String[words.length][];

		for (int i = 0; i < words.length; i++) {
			characterInWords[i] = words[i].split("", 0);
		}

		return characterInWords;
	}
}