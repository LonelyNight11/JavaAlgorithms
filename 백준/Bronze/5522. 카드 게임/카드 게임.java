import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static Integer[] dp;
    static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        for (int i = 0; i < 5; i++) {

            int num = Integer.parseInt(bf.readLine());
            result += num;
        }

        System.out.println(result);
    }


}