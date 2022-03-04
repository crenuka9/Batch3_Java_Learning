package day12;
// iam extending to predefined class Thread
public class MultiThreading extends Thread
{
    private int threadNumber;
    public MultiThreading(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    @Override
    public void run()
    {
        //print value from 1 to 5
        for(int i=1;i<=5;i++)
        {
         System.out.println(i+"from thread number:"+threadNumber);
         try
         {
             Thread.sleep(  1000);
         }
         catch(InterruptedException e)
         {
             //e.printStackTrace();
             System.out.println(e.fillInStackTrace());
         }
        }
    }
}

