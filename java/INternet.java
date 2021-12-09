import java.net.*;
public class INternet
{
    public static void main(String arg[])throws Exception{
   InetAddress address=InetAddress.getLocalHost();
   InetAddress address1=InetAddress.getByName("www.google.com");
   InetAddress address2[]=InetAddress.getAllByName("www.google.com");
   System.out.println(address);
   System.out.println(address1);
   for(int i=0;i<address2.length;i++)
   {
      System.out.println("ip Address : "+ address2[i]);
   }
 }
}