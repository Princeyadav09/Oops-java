class ExceptionHandling
{
   public static void main(String arg[])
   {
      int a=5;
      int b=0;
      try
      {
          int c=a/b;
      }
      catch(Exception e)
      {
         System.out.println("Exception occured");
      }
   }
}