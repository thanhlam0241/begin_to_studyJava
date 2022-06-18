package HackerRank;
import java.io.*;
import java.util.*;
import java.text.NumberFormat;
public class Currency {
    //use NumberFormat
    //
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            NumberFormat nf = NumberFormat.getInstance();//dinh dang so theo khu vuc
            Locale locale = new Locale("en","EN");
            NumberFormat nu = NumberFormat.getInstance(locale);
            //dinh dang tien te (Currency)
            Locale india = new Locale("en","india");
            NumberFormat indiaCurrency = NumberFormat.getCurrencyInstance(india);
            NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            double payment = sc.nextDouble();
            System.out.println("US: "+us.format(payment));
            System.out.println("India: Rs."+indiaCurrency.format(payment).replace('₹','\0'));
            System.out.println("China: "+china.format(payment).replace("¥","￥"));
            System.out.println("France: "+fr.format(payment));
        }
}
