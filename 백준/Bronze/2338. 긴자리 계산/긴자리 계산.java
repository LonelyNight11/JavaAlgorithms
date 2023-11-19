import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        BigInteger number = new BigInteger((bf.readLine()));
        BigInteger number2 = new BigInteger((bf.readLine()));


        BigInteger add = number.add(number2);
        BigInteger subtract = number.subtract(number2);
        BigInteger multiply = number.multiply(number2);

        System.out.println(add);
        System.out.println(subtract);
        System.out.println(multiply);

    }
}