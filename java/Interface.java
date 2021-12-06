 class Interface
 {
     public static void main(String arg[])
     {
        test t=new test();
        t.increment();
        System.out.println(t.i);
        t.decrement();
        System.out.println(t.i);
     }
 }

 interface demo
 {
     void increment();
     void decrement();
 }
  
 class test implements demo
 {
     int i=5;
   public void increment()
     {
       i++;
     }
    public void decrement()
     {
         i--;
     }
 }