import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String string = bf.readLine();
			if (string == null) {
				break;
			}
			String[] split = string.split(" ");

			int num1 = Integer.parseInt(split[0]);
			int num2 = Integer.parseInt(split[1]);

			int result = num1 + num2;
			System.out.println(result);
		}

	}

}