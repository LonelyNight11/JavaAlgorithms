import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static Long[] seq = new Long[101];

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        seq[0] = 0L;
        seq[1] = 1L;
        seq[2] = 1L;
        seq[3] = 1L;

        int T = Integer.parseInt(bf.readLine());

        while (T-- > 0) {
            System.out.println(find(Integer.parseInt(bf.readLine())));
        }
    }

    public static long find(int N) {
        if (seq[N] == null) {
            seq[N] = find(N - 2) + find(N - 3);
        }
        return seq[N];
    }

}