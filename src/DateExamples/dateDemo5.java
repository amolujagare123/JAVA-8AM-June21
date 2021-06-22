package DateExamples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo5 {

    public static void main(String[] args) throws ParseException {

        String dateStr0= "23-June-2016" ;
            //=> dd-MMMM-yyyy
        System.out.println("dateStr0= "+dateStr0);
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");

        Date date = sd0.parse(dateStr0);
        System.out.println("System format Date:"+date);


        //--- date in the format dd/MM/yyyy --> this will be in the form of String
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        String dateStr = sd.format(date);
        System.out.println("dateStr= "+dateStr);

    }
}
