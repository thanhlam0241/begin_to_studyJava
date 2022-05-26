package HackerRank;

import java.io.*;
import java.util.*;

public class AnagramsString {
        public static int countChar(char c,String chuoi){
            int count=0;
            for (int i = 0; i < chuoi.length(); i++) {
                // Nếu ký tự tại vị trí thứ i bằng 'a' thì tăng count lên 1
                if (chuoi.charAt(i) == c) {
                    count++;
                }
            }
            return count;
        }
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine().toLowerCase();
            String b = sc.nextLine().toLowerCase();
            String l="\\s";
            boolean result=true;
            for(int i=0;i<a.length();i++){
                char k=a.charAt(i);
                if(!l.contains(k+"\\s")){l+=k;}
                if(!b.contains(k+"\\s")){
                    continue;
                }
                if(countChar(k,a)!=countChar(k,b)){
                    result=false;
                    break;
                }
            }
            if(result){
                System.out.println("Anagrams");
            }
            else {
                System.out.println("Not Anagrams");
            }
        }
}
