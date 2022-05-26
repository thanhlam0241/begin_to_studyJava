package HackerRank;
import java.io.*;
import java.util.*;
public class CompareSubstring {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            int k = sc.nextInt();
            int l = s.length();
            String min=s.substring(0,k);
            String max=s.substring(0,k);
            for(int i=1;i<l-k+1;i++){
                if(s.substring(i,i+1).compareTo(max.substring(0,1))>=0){
                    if(s.substring(i,i+k).compareTo(max)>0){
                        max=""+s.substring(i,i+k);
                    }
                }
                if(min.substring(0,1).compareTo(s.substring(i,i+1))>=0){
                    if(min.compareTo(s.substring(i,i+k))>0){
                        min=""+s.substring(i,i+k);
                    }
                }
            }
            System.out.println(min);
            System.out.println(max);
        }

    }

