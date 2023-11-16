import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {


    static int[] arr;
    static int[] dp = new int[100000001];


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());


        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;


        for (int i = 3; i < dp.length; i++) {
            dp[i] = -1;
        }
        int result = find(num);
        System.out.println(result);
    }

    static int find(int N) {

        if (dp[N] == -1) {
            dp[N] = (find(N - 1) + find(N - 2)) % 15746;
        }

        return dp[N];

    }
}

