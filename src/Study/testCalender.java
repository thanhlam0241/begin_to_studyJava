package Study;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
public class testCalender {
    public static void main(String args[]){
        Calendar cal=Calendar.getInstance();
        Date date=cal.getTime();
        System.out.println("Time now is: "+date);//lay thoi gian hien tai
        //Hien thi thang hien tai //Display this month
        System.out.println("This month is: "+(cal.get(Calendar.MONTH)+1));
        //Display the date of month
        System.out.println("The date now is: "+cal.get(Calendar.DAY_OF_MONTH));
        //Display the hour
        System.out.println("It's is: "+cal.get(Calendar.HOUR));//tinh theo thang 12 gio
        System.out.println("It's is: "+cal.get(Calendar.HOUR_OF_DAY));//theo thang 24 gio
        //Display the year
        System.out.println("This year is: "+cal.get(Calendar.YEAR));
        int n=cal.get(Calendar.DAY_OF_WEEK);
        //Ngoai ra con nhieu thu nhu : WEEK_OF_YEAR,WEEK_OF_MONTH,...

        //Next,we study how to change the time of system by using set() method
        cal.set(Calendar.MONTH,3 );//Now,the month is 3
        cal.set(Calendar.YEAR,2000);//Now,the year is 2000
        cal.set(Calendar.HOUR_OF_DAY,20);//Now the hour is 20/24
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.YEAR));

        System.out.println(cal.getTime());
        //Or we can do like that:
        cal.set(2020,Calendar.DECEMBER,24,13,20,2);
        System.out.println(cal.getTime());

        //Add and Sub the time of system
        //Use the add() method,if you want to sub,use negative integer
        cal.add(Calendar.MONTH,23);//Add 23 months to 24/9/2020
        System.out.println("After add 23 months,time is: "+cal.getTime());

        //roll() method
        //example,it's very hard to explain

        cal.roll(Calendar.MONTH,2);
        System.out.println(cal.getTime());
        cal=Calendar.getInstance();//Recover everything
        SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sd.format(cal.getTime()));
        sd=new SimpleDateFormat("d/M/y");
        System.out.println(sd.format(cal.getTime()));
        sd=new SimpleDateFormat("aa/MM/yyyy HH:mm:ss aaa");
        //HH:hour,ss:second,mm:minute,aaa: AM or PM
        System.out.println(sd.format(cal.getTime()));
        
    }
}
