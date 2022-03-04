package pack2;
public class Class1
{
    public int a = 10;
    private int b = 30;
    protected int c = 60;
    int d = 40;

    public static void main(String[] args)
    {
        Pack1.AccessModifiers obj = new Pack1.AccessModifiers();
        System.out.println(obj.a);


    }
}