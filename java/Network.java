

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Network {
    public static void main(String[] args)throws Exception {
        ServerSocket ss = new ServerSocket(192);
        Socket s = ss.accept();
        InputStreamReader ir = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(ir);
        String st = br.readLine();
        System.out.println(st);
        br.close();
        ir.close();
    }
}