import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static Long[] seq = new Long[101];

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());

        while (T-- > 0) {

            String s = bf.readLine();
            String[] split = s.split(" ");

            List<Integer> array = new ArrayList<>();

            for (int i = 0; i < split.length; i++) {
                array.add(Integer.parseInt(split[i]));
                Collections.sort(array, Comparator.reverseOrder());
            }
            System.out.println(array.get(2));

        }
    }

}