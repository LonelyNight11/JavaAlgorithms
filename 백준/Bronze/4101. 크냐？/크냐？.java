import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int number = 9;
        int result = 0;
        while (true) {
            String s = bf.readLine();
            if(s.isEmpty()){
                break;
            }
            String[] split = s.split(" ");

            int first = Integer.parseInt(split[0]);
            int second = Integer.parseInt(split[1]);

            if(first>second){
                System.out.println("Yes");
            } else if(first<=second && first != 0 && second != 0){
                System.out.println("No");
            } else {
                break;
            }
        }


    }

}