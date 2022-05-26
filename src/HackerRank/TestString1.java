package HackerRank;

import java.io.*;
import java.util.*;

public class TestString1 {
    public static boolean isLetter(char a){
        if(('a'<=a&&a<='z')||('A'<=a&&a<='Z')){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String l = "";
        for(int i=start;i<end;i++){
            if(isLetter(s.charAt(i))){
                l+=(s.charAt(i));
            }
        }
        System.out.println(l);
    }
}
