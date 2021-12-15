import java.net.*;
import java.io.*;
class webServer1{
public static void main(String args[])throws Exception{

ServerSocket ss=new ServerSocket(1237);
Socket s=ss.accept();
BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
String str=br.readLine();
String s1="";
int i=1;
while(i<5){
    s1=s1+str+"<br/>";
    str=br.readLine();
i++;
}
OutputStream os=s.getOutputStream();
os.write(("HTTP/1.1 200 ok \r\n").getBytes());
os.write(("content-type:text \r\n").getBytes());
os.write(("content-length:"+s1.length()+"\r\n").getBytes());
os.write(("\r\n").getBytes());
os.write(s1.getBytes());
os.flush();
s.close();

}
}