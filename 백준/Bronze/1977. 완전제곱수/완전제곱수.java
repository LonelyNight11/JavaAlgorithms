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

        int num = Integer.parseInt(bf.readLine());
        int num2 = Integer.parseInt(bf.readLine());
        List<Integer> array = new ArrayList<>();
        int result = 0;
        for (int i = num; i <= num2; i++) {
            if (Math.sqrt(num) % 1 == 0) {
                array.add(num);
                result += num;
            }
            num++;
        }

        if (array.isEmpty()) {
            System.out.println(-1);
            return;
        }

        Integer min = Collections.min(array);
        System.out.println(result);
        System.out.println(min);

    }

}