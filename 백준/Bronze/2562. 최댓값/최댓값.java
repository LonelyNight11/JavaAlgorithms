

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> array = new ArrayList<>();

        int count = 9;
        while(count-->0){
            int num = Integer.parseInt(bf.readLine());
            array.add(num);
        }
        Integer max = Collections.max(array);
        System.out.println(max);
        System.out.println(array.indexOf(max)+1);
    }

}