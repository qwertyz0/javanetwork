package ua.edu.chmnu.ki.networks.tcp.simple;


import java.io.*;
import java.net.*;
public class Pract06_SimpleTCPClient {


    public static void main(String[] args) {
        Socket socket = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        String serverAddr = "localhost";
        int port = 5560;
        try {
            socket = new Socket(serverAddr,port);
            inputStreamReader = new InputStreamReader(socket.getInputStream());
            bufferedReader = new BufferedReader(inputStreamReader);
            String msg = bufferedReader.readLine();
            System.out.println("Message: " + msg);
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                bufferedReader.close();
                inputStreamReader.close();
                socket.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
