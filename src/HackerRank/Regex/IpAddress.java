package HackerRank.Regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
public class IpAddress {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            String s="(25[0-5]|2[0-4][0-9]|[0-1][0-9][0-9]|[0-9][0-9]|[0-9])";// 25[0-5]|2[0-4]\d|\d{1,2}|[0-1]\d{2}
            String regex=s+"."+s+"."+s+"."+s;
            System.out.println(Pattern.matches(regex, IP));
        }
    }
}