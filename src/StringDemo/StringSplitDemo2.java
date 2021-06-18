package StringDemo;

public class StringSplitDemo2 {

    public static void main(String[] args) {

        String str = "We are learning Java";

        String[] stArr = str.split(" ");
                   // {"We","are","learning","java"}

        for(int i=0;i<stArr.length;i++)
            System.out.println(stArr[i]);



    }
}
