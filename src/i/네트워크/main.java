package i.네트워크;


// 네트워크에 연결되어 있는 대상 사이에 데이터를 전송하는 방법
// socket -> 네트워크상에서 데이터를 주고받기 위한 장치

// 네트워크 대상 사이에 입/출력 (InputStream, OutputStream)를 이용해서 데이터를 입력하고 출력한다

import java.net.ServerSocket;
import java.net.Socket;

public class main {
    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new ServerSocket(9000);
            System.out.println("클라이언트 맞을 준비");

            socket = serverSocket.accept();
            System.out.println("클라이언트 연결");
            System.out.println("socket : " + socket);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (socket != null) socket.close();
                if (serverSocket != null) serverSocket.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
