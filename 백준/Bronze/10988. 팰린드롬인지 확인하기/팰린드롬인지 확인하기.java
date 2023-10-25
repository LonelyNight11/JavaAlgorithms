import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String readLine = bf.readLine();
		String[] split = readLine.split("");
		String str = "";
		String second = "";
		for (int i = 0; i < split.length; i++) {
			String string = split[i];
			str += string;
		}
		int size = split.length;
		for (int j = size-1; j >= 0; j--) {
			String secondString = split[j];
			second += secondString;
		}

		if (str.equals(second)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}
}