
import java.io.*;
//import java.io.OutputStream;
import java.io.*;
import java.net.*;

public class Network1 {
    public static void main(String[] args)throws Exception {
        Socket s = new Socket("client",192);
        PrintWriter pw = new PrintWriter(s.getOutputStream());
        pw.write("HEllo i am Vijender");
        pw.flush();
    }
}