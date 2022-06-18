package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String hour = s.substring(0, 2);
        String abm=s.substring(8);
        if (abm.equals("AM"))
        {
            if (Integer.parseInt(hour) == 12)
            {
                return ("00"  + s.substring(2, 8));
            }
            else { return s.substring(0, 8); }
        }
        else
        {
            if (Integer.parseInt(hour) == 12)
            {
                return s.substring(0, 8);
            }
            else
            {
                return ((Integer.parseInt(hour) + 12) + s.substring(2, 8));
            }
        }

    }



        public static void main(String[] args) throws IOException {
            String s="12:40:22AM";
            System.out.println(timeConversion(s));
        }

}