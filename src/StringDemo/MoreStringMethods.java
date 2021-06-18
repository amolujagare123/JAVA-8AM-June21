package StringDemo;

public class MoreStringMethods {

    public static void main(String[] args) {

        String str = "Selenium tests web based application";

        System.out.println(str);
        // 1. endsWith 2. startsWith 3.contains

        System.out.println(str.endsWith("ion1"));

        System.out.println(str.startsWith("Seleaaa"));

        System.out.println(str.contains("web b1"));


    }
}
