  

import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Manicomio {
    public static void main(String[] args) throws Exception {
       
        
       
        Date firstDate = new Date(2001,30,11);
        Date secondDate = new Date(2003,23,11);

        long diff = secondDate.getTime() - firstDate.getTime();

        TimeUnit time = TimeUnit.DAYS; 
        System.out.println(firstDate+" ____\n "+secondDate );
        long diffrence = time.convert(diff, TimeUnit.MILLISECONDS);
        System.out.println(" : "+((int)diffrence/365));

    }
}