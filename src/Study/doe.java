package Study;

import java.util.*;
import java.text.NumberFormat;
import java.io.*;
public class doe  {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            double payment = sc.nextDouble();
            Locale Us = new Locale("us","US");
            Locale Fr = new Locale("french","FRANCE");
            Locale En = new Locale("en","EN");
            
            NumberFormat currencyUS = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat currencyChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat currencyFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            NumberFormat currencyIn = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
            System.out.println("US: "+currencyUS.format(payment));
            System.out.println("India: "+currencyIn.format(payment));
            System.out.println("China: "+currencyChina.format(payment));
            System.out.println("France: "+currencyFrance.format(payment));

    }
}
