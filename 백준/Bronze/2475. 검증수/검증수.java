import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int result = 0;
        String s = bf.readLine();
        String[] split = s.split(" ");

        for(String str : split){

            int count = Integer.parseInt(str);
            result += (count * count);

        }

        int show = result % 10;
        System.out.println(show);


    }

}