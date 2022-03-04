package day4;

public class ConditionalClauses1
{
    public static void main(String[] args)
    {
        int a =100;
        int b = 20;
        int c = 10;
        if (a > b)
        {
            if (b > c)
            {
                if (c>a)
                {
                    System.out.println("Access granted");

                }
                else
                    System.out.println("no output");

            }
        }
    }
}