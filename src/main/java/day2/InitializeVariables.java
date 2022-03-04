package day2;

public class InitializeVariables
{
    int a;
    String b;
    //Creating the Constructor//
    InitializeVariables(int  x,String y)
    {
        a=x;
        b=y;
    }
    public static void main(String[] args)
    {
        InitializeVariables obj =new InitializeVariables(10,"hello");
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
