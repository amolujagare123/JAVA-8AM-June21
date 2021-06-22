package DateExamples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo4 {

    public static void main(String[] args) throws ParseException {

        String dateStr0= "23-June-2016" ;
        //=> dd-MMMM-yyyy
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        System.out.println("dateStr0 = "+dateStr0);
        Date date0 = sd0.parse(dateStr0);
        System.out.println("Converted String into date : "+date0);


        String dateStr1= "23 | June 16  8:34" ;
        //=>  dd | MMMM yy hh:mm
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        Date date1 = sd1.parse(dateStr1);
        System.out.println("dateStr1 = "+dateStr1);
        System.out.println("Converted String into date : "+date1);


        String dateStr2= "2016 - 06 - 23 | 8:34:23";
        // => yyyy - MM - dd | hh:mm:ss
        SimpleDateFormat sd = new SimpleDateFormat("yyyy - MM - dd | hh:mm:ss");
        Date date2 = sd.parse(dateStr2);
        System.out.println("dateStr2 = "+dateStr2);
        System.out.println("Converted String into date : "+date2);

    }
}
