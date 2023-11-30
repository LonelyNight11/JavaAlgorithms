import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        long num = Long.parseLong(bf.readLine());

        for (int i = 0; i < num; i++) {
            long result = num - i;
            System.out.println(result);
        }

    }

}