import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {


    static Integer[] dp;
    static int[] arr;

    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();

        String[] split = s.split(" ");


        BigInteger big = new BigInteger(split[0]);
        BigInteger big2 = new BigInteger(split[1]);

        BigInteger result = big.add(big2);

        System.out.println(result);


    }


}