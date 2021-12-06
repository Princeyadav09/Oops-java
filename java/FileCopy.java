import java.io.*;
class FileCopy
{
    public static void main(String arg[])throws IOException
    {
       FileInputStream fis=new FileInputStream("C:\\Users\\dell\\Desktop\\a.txt");
       String s="";
       int i=fis.read();
       while(i!=-1)
       {
           s+=(char)i;
           i=fis.read();
       }        
       FileWriter fos=new FileWriter("C:\\Users\\dell\\Desktop\\b.txt",true);
       fos.write(s);
       fos.close();
    }
}
