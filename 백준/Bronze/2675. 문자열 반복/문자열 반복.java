

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());

        for (int i = 0; i < num; i++) {
            String s = bf.readLine();
            String[] string = s.split(" ");

            int count = Integer.parseInt(string[0]);
            String[] stringList = string[1].split("");
            String str = "";
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < stringList.length; k++) {
                for (int j = count; j > 0; j--) {

                    str += stringList[k];
                }
            }
            System.out.println(str);
        }
    }
}