

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        LocalDateTime dateTime = LocalDateTime.now();

        String format = dateTime.format(DateTimeFormatter.ofPattern("YYYY-MM-dd"));

        System.out.println(format);
    }

}