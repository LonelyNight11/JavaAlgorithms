
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

		int num = Integer.parseInt(bf.readLine());
		int num2 = Integer.parseInt(bf.readLine());
		
		int result = num + num2;
		System.out.println(result);
	}
}