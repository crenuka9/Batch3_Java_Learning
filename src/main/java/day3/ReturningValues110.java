package day3;

public class ReturningValues110
{
    public void notReturning ()
    {
        System.out.println("Not returning");
    }

    public int concat ( int a, int b)
    {
        return a - b;
    }

    public static void main (String[]  args)
    {

        ReturningValues110 obj = new ReturningValues110();

        int c = obj.concat(1, 1);

        System.out.println(c);

    }
}


