import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String string = bf.readLine();
		String[] split = string.split(" ");

		long number1 = Long.parseLong(split[0]);
		long number2 = Long.parseLong(split[1]);
		long result = 0;
		if (number1 > number2) {
			result = number1 - number2;
		} else {
			result = number2 - number1;
		}
		System.out.print(result);
	}
}