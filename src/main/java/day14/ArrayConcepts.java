package day14;

public class ArrayConcepts
{
    public static void main(String[] args)
    {
        //create array of 5 numbers
        int[] arr=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        //size of the array

        //System.out.println(arr.length);

        /*int arrsize=arr.length;
        for(int i=0;i<=arrsize;i++)
        {
            System.out.println(arr[i]);
        }*/
        //For each loop
        for(int a:arr)
        {
            System.out.println(a);
        }
    }
}
