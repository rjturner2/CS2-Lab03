public class Collapse {
	public static void main(String[] args) {
		int[] collapsedArray = collapse(args);

		for (int i = 0; i < collapsedArray.length; i++) System.out.println(collapsedArray[i]);
	}

	public static int[] collapse(String[] arguments) {
		int[] arrayToCollapse;
		int[] collapsedArray;
		if (arguments.length % 2 == 1) {
			arrayToCollapse = new int[arguments.length + 1];
			arrayToCollapse[arrayToCollapse.length - 1] = 0;
		}
		else arrayToCollapse = new int[arguments.length];

		collapsedArray = new int[arrayToCollapse.length / 2];

		for (int i = 0; i < arguments.length; i++) {
			String str = arguments[i];

			// I'm using RegEx to determine if it's a numeric character
			if (str.matches("-?\\d+")) arrayToCollapse[i] = Integer.valueOf(str);
		}

		for (int i = 0; i < arrayToCollapse.length; i += 2) {
			collapsedArray[i / 2] = arrayToCollapse[i] + arrayToCollapse[i + 1];
		}
		return collapsedArray;
	}
}