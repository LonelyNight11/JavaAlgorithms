

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        long number = Integer.parseInt(bf.readLine());

        long result = number *  number * number;
        System.out.println(result);
        System.out.println(3);
    }
}