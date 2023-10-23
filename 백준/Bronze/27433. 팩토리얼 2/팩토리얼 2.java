import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Long num = Long.parseLong(bf.readLine());
		Long result = factorial(num); // 재귀 함수 호출 예시
		System.out.println(result);
	}

	public static Long factorial(Long n) {
		if (n == 1) {
			return (long) 1;
		} else if(n == 0) {
			return (long) 1;
		}
		else {
			return n * factorial(n - 1); // 재귀 호출
		}
	}
}