package ua.edu.chmnu.ki.networks.tcp.simple;

import java.io.*;
import java.net.*;
public class Pract06_SimpleTCPServer {

    public static void main(String[] args) {
        Socket socket = null;
        ServerSocket servSocket = null;
        PrintStream printStream = null;
        int port = 5560;
        try {
            servSocket = new ServerSocket(port);
            socket = servSocket.accept();
            System.out.println("Connection established [" + socket.getInetAddress() + "]");
            printStream = new PrintStream(socket.getOutputStream());
            printStream.println("Welcome to the club boddy");
            printStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            printStream.close();
            try {
                socket.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            try {
                servSocket.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }


}
