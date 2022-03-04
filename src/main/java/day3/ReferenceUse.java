package day3;

public class ReferenceUse
{
    ReferenceUse()
    {
        System.out.println("Zero Constructor");
    }

    ReferenceUse(int a)
        {
        this();
        System.out.println(a);
        }
    ReferenceUse(int a, int b, int c)
    {
        this(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void main(String[] args)
    {
        ReferenceUse obj = new ReferenceUse(1,2,3);
    }
}
