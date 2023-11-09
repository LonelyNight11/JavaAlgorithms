import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            array[i] = Integer.parseInt(bf.readLine());
            sum += array[i];
        }
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (100 == sum - array[i] - array[j]) {
                    array[j] = 0;
                    array[i] = 0;

                    Arrays.sort(array);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(array[k]);
                    }
                    return;
                }

            }
        }
    }
}