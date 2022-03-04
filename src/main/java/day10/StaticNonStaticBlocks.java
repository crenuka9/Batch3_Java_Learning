
package day10;

public class StaticNonStaticBlocks
{

    StaticNonStaticBlocks()
    {
        System.out.println("Hi Iam constructor");
    }

    {
        System.out.println("Hi Iam non-static Block");
    }

    {
        System.out.println("Hi Iam static Block");
    }

    public void main(String[] args)
    {

        StaticNonStaticBlocks obj = new StaticNonStaticBlocks();
    }
}
