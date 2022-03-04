package day12;

public class MultiTest
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 3; i++)
        {
            MultiThreading multiThreading = new MultiThreading(i);
            multiThreading.start();
        }
    }
        }




