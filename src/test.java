import java.io.BufferedReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.lang.String;
import java.text.SimpleDateFormat;
public class test {
    public static String findDay(int month, int day, int year) {
        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.MONTH,month);
        cal.set(Calendar.DATE,day);
        cal.set(Calendar.YEAR,year);
        return Integer.toString(cal.get(Calendar.DATE));

    }

    public static void main(String args[])  {
       /* Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%3d%n", s1, x);
        }
        System.out.println("================================");*/

    }
}
