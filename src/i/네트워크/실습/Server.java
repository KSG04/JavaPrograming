package i.네트워크.실습;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;

        InputStream inputStream = null;
        DataInputStream dataInputStream = null;

        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;

        Scanner scanner = null;


        try {
            serverSocket = new ServerSocket(9000);
            System.out.println("클라이언트 맞을 준비");

            socket = serverSocket.accept();
            System.out.println("클라이언트 연결");
            System.out.println("socket : " + socket);

            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);

            outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);

            scanner = new Scanner(System.in);

            while (true){
                String clienM = dataInputStream.readUTF();
                System.out.println("메세지 : " + clienM);

                dataOutputStream.writeUTF("메세지 전송 완료");
                dataOutputStream.flush();
                if (clienM.equals("STOP")) break;
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (serverSocket != null)serverSocket.close();
                if (socket != null)socket.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }
}
