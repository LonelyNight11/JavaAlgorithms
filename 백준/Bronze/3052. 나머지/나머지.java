import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int number = 10;

        List<Integer> array = new ArrayList<>();
        while (number-- > 0) {

            int readLine = Integer.parseInt(bf.readLine());

            int result = readLine % 42;
            array.add(result);
        }

        long count = array.stream().distinct().count();
        System.out.println(count);
    }

}