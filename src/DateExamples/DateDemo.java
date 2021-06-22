package DateExamples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        String dateStr = sd.format(date); //date into string

        System.out.println(dateStr);

        System.out.println(sd.format(date));

    }
}
