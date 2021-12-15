import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
class WebSource
{
    public static void main(String arg[])throws IOException
    {
        ServerSocket ss=new ServerSocket(7060);
        Socket s=ss.accept();
        InputStream is=s.getInputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        String str=br.readLine();
        System.out.println(str);
        ss.close();
    }
}