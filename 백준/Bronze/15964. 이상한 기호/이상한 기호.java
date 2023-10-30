
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String string = bf.readLine();
		String[] split = string.split(" ");
		
		int num1 = Integer.parseInt(split[0]);
		int num2 = Integer.parseInt(split[1]);
		
		int result = (num1 + num2) * (num1 - num2);
		System.out.println(result);
	}
}