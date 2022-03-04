package day2;

public class CreatingConstructor
{
        int a;
        String b;

        CreatingConstructor(int a, String b)
    {
        this.a = a;
        this.b = b;
    }
        CreatingConstructor()
        {
            System.out.println("Zero Constructor");
        }
        public static void main(String[] args)
        {
            CreatingConstructor obj = new CreatingConstructor();
            System.out.println(obj.a);
            System.out.println(obj.b);
        }
    }








