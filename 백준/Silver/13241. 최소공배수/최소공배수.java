import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        String s = bf.readLine();
        String[] split = s.split(" ");

        long num1 = Long.parseLong(split[0]);
        long num2 = Long.parseLong(split[1]);

        Main main = new Main();
        long gcd = main.getGCD(num1, num2);
        long result = num1 * num2 / gcd;
        System.out.println(result);
    }

    long getGCD(long N, long M) {
        if (N % M == 0) {
            return M;
        }
        return getGCD(M, N%M);
    }
}