package day13;

public class ExceptionHandling {
    public static void main(String[] args) {
        try
        {
            String val = "Hello";

            int no = Integer.parseInt(val);
            System.out.println(no);
            System.out.println("try block executed successfully");
        }
        catch (Exception e)
        {
            System.out.println("hey please enter correct value for converting to integer");
        }
        finally
        {
            System.out.println("This is finally block");
        }
        System.out.println("End of code");

    }
}