package ExpectionDemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FIleRead {

    public static void main(String[] args)  {

        try {

            FileInputStream fp = new FileInputStream("D:\\screenshots\\IMG1.png");
        }
        catch (Exception e)
        {
            System.out.println("inside catch");
        }
        System.out.println("end of the program");
    }
}
