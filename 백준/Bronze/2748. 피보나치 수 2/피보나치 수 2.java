import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    static Long dp[];


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int num = Integer.parseInt(bf.readLine());

        dp = new Long[num + 1];

        dp[0] = 0L;
        dp[1] = 1L;

        if (num >= 2) {
            System.out.println(find(num));
        } else if(num == 0){
            System.out.println(0);
        } else if(num == 1){
            System.out.println(1);
        }
    }

    static long find(int N) {

        if (dp[N] == null) {
            dp[N] = find(N - 1) + find(N - 2);
        }
        return dp[N];
    }
}