import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int num1 = Integer.parseInt(bf.readLine());
        int num2 = Integer.parseInt(bf.readLine());
        int num3 = Integer.parseInt(bf.readLine());

        if (num1 == 60 && num2 == 60 && num3 == 60) {
            System.out.println("Equilateral");
        } else if(num1 + num2 + num3 == 180){
            if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("Isosceles");
            } else if (num1 != num2 && num2 != num3 && num1 != num3) {
                System.out.println("Scalene");
            }
        }
        else {
            System.out.println("Error");
        }
    }



}