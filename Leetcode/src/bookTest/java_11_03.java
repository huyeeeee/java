package bookTest;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class java_11_03 {
    public static void main(String[] args){
        Date d = new Date();
        System.out.println(d);
        Calendar c = null;
        c = new GregorianCalendar();
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH) + 1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
    }
}
