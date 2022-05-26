package HackerRank;
import java.io.*;
import java.util.*;

public class TestString {
    public char Upper(char i){
        return i+='a'-'A';
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        int a = A.length()+B.length();
        System.out.println(a);
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
    }
}