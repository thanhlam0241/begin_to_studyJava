package HackerRank;
import java.io.*;
import java.util.*;

public class Palindrome {
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            StringBuilder newS = new StringBuilder(s);
            String s1 = newS.reverse().toString();
            if(s.equals(s1)){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
    }
}
