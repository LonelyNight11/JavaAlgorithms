
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		
		String readLine = bf.readLine();
		String[] split = readLine.split(" ");
		
		BigInteger num1 = new BigInteger(split[0]);
		BigInteger num2 = new BigInteger(split[1]);
		
		BigInteger divide = num1.divide(num2);
		BigInteger odd = num1.remainder(num2);
		
		System.out.println(divide);
		System.out.println(odd);
		
	}
}