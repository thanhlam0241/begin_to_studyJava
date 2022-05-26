package HackerRank;
import java.io.*;
import java.util.*;

public class SplitString {
//    public static boolean isAlphabet(char c){
//        if(('a'<=c&&c<='z')||('A'<=c&&c<='Z')){
//            return true;
//        }
//        return false;
//    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
//        for(int i=0;i<s.length();i++){
//            if(!isAlphabet(s.charAt(i))){
//                s.replace(i,i+1,"-");
//            }
//        }
        StringTokenizer st = new StringTokenizer(s.toString(),"\\W");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
