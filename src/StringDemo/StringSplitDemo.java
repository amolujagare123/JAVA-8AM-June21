package StringDemo;

public class StringSplitDemo {

    public static void main(String[] args) {

        String str = "Hey baby you are so lovely";

        String[] stArr = str.split(" ");


        for(int i=0;i<stArr.length;i++) {
            // check --> last character of individual string is y or not

            String tempStr = stArr[i];
            int l = tempStr.length();

            if(tempStr.charAt(l-1) =='y')
                 System.out.println(stArr[i]);
        }


    }
}
