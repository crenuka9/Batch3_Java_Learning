package day12;

public class StringOperations
{
    public static void main(String[] args) {
        String val = "This is Batch 3 Java sessions";
        String val1= "Automation";

        // To find the length of String
        System.out.println(val1.length());

        //To remove the spaces of the String from begining and ending
        String removedSpace = val1.trim();

        System.out.println(val1);
        System.out.println(removedSpace);

        //To convert to Lower case letter

        System.out.println(val1.toLowerCase());

        //To convert to Upper case letter

        System.out.println(val.toUpperCase());
    }

}
