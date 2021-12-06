import java.io.*;
class Threading
{
    public static void main(String arg[])
    {
       Mythread1 th1=new Mythread1();
       Thread t1=new Thread(th1);
       t1.start();
       try
       {
          // t1.sleep(100);
       }
       catch(Exception e)
       {
           System.out.println("Exception occured");
       }
       Mythread2 th2=new Mythread2();
       Thread t2=new Thread(th2);
       t2.start();
       try
       {
          t2.sleep(100);
       }
       catch(Exception e)
       {
           System.out.println("Exception occured");
       }
    }
}

class Mythread1 implements Runnable
{
   public void run()
   {
       for(int i=0;i<10;i++){
       System.out.println("prince");
       }
   }
}
class Mythread2 implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++){
        System.out.println("Yadav");
        }
    }
}