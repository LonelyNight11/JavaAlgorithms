import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();
        String[] split = s.split(" ");

        int R1 = Integer.parseInt(split[0]);
        int S = Integer.parseInt(split[1]);

        int result = 2 * S - R1;
        System.out.println(result);

    }

}