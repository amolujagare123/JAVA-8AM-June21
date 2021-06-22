package DateExamples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo3 {

    public static void main(String[] args) throws ParseException {

        String dateStr = "12/07/2021"; // dd/MM/yyyy
        //System.out.println(dateStr);
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        Date date =  sd.parse(dateStr);
        System.out.println(date);





    }
}
