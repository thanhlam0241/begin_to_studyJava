package Study;
import java.util.Scanner;
import java.util.regex.*;
public class Regex1 {
       public static void main(String[] args) {
           Pattern pattern = Pattern.compile("\\s");
           Scanner sc = new Scanner(System.in);
           int n = Integer.parseInt(sc.nextLine());
           while (n > 0) {
               String s = sc.nextLine();
               String ok = "";
               String[] use = s.split("\\s");
               for (String s1 : use) {
                   boolean check = true;
                   for (String si : ok.split("\\s")) {
                       if (si.equalsIgnoreCase(s1)) {
                           check = false;
                           break;
                       }
                   }
                   if (check) {
                       ok = ok + " " + s1;
                   }

               }


           }
       }
}
