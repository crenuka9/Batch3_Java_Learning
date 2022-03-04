package day2;

public class Overloading
{
        //Zero Constructor
        Overloading()
        {
            System.out.println("Zero Constructor");
        }

        //One Parameter Constructor
        Overloading(int a)
        {
            System.out.println(a);
        }
        //Two Parameter Constructor
        Overloading(int a, int b)
        {
            System.out.println(a*b);
            System.out.println(b*b);
        }

        public static void main(String[] args)
        {
            Overloading obj = new Overloading();
            Overloading obj1 = new Overloading(10);
            Overloading obj3 = new Overloading(20,30);

        }
    }

