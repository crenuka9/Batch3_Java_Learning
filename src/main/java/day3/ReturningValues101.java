package day3;

public class ReturningValues101

    {

        public void notReturning ()
        {
            System.out.println("Not returning");
        }

        public int concat ( int a, int b)
        {
            return a + b;
        }

        public static void main (String[]  args)
        {

        ReturningValues101 obj = new ReturningValues101();

        int c = obj.concat(1, 0);

        System.out.println(c);

    }
    }
