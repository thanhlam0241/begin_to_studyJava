package HackerRank.Regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
       /* String[] strings = new String[n];
        for(int i=0;i<n;i++){
            strings[i]=sc.nextLine();
        }*/
        while(n>0){
            String s=sc.nextLine();
            String ok="";
            String[] use = s.split("\\s");
            for(String s1:use) {
                boolean check=true;
                for (String si : ok.split("\\s")) {
                    if (si.equalsIgnoreCase(s1)){
                        check=false;
                        break;
                    }
                }
                if(check){ok=ok+" "+s1;}
            }
            System.out.println(ok.trim());
            n--;
        }
    }
}