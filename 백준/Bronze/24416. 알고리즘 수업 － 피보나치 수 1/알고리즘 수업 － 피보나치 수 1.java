import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int num = Integer.parseInt(bf.readLine());


        System.out.println(fib(num));
        System.out.println(num-2);
    }

    static int fib(int N) {
        if (N == 1 || N == 2) {
            return 1;
        } else {
            return (fib(N - 1) + fib(N - 2));
        }
    }



}