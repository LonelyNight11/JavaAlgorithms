import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();
        String[] split = s.split(" ");

        int a1 = Integer.parseInt(split[0]);
        int a0 = Integer.parseInt(split[1]);

        int c = Integer.parseInt(bf.readLine());
        int n = Integer.parseInt(bf.readLine());

        int fn = a1 * n + a0;

        int gn = c * n;

        if (fn <= gn && c>=a1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

}