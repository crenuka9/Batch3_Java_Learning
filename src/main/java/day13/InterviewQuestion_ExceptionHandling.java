package day13;

public class InterviewQuestion_ExceptionHandling
{
    public static int getval()
    {
        try
        {
            return 4;
        }
        catch (Exception e)
        {
            return 5;
        }
        finally
        {
            return 6;
        }
    }
        public static void main (String[]args)
        {
            System.out.println(getval());
        }

}