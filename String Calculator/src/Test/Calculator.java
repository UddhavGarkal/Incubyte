package Test;

public class Calculator {

	private final String delimiter = ",|\n";

	public int calculate(String input) {
		String[] numbers = input.split(delimiter);

		if (isEmpty(input)) {
			return 0;
		}
		if (input.length() == 1) {
			return stringToInt(input);
		} else {
			return Add(numbers);
		}

	}

	public int Add(String[] numbers) {
		int sum = 0;
		for (String current : numbers) {
			sum += Integer.parseInt(current);
		}
		return sum;
	}

	private boolean isEmpty(String input) {
		return input.isEmpty();
	}

	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}
}
