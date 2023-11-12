
import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        long num = Long.parseLong(bf.readLine());
        long result = num * 4;
        System.out.println(result);
    }

}