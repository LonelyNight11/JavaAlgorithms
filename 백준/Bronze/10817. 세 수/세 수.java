import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static Long[] seq = new Long[101];

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        String s = bf.readLine();
        String[] split = s.split(" ");

        List<Integer> array = new ArrayList<>();


        for (int i = 0; i < split.length; i++) {
            array.add(Integer.parseInt(split[i]));
        }
        Collections.sort(array);

        System.out.println(array.get(1));

    }

}